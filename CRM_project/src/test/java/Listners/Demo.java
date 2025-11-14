package Listners;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

// Attach the Listener
@Listeners(Listners.Demo_Listner.class)
public class Demo {

    ExtentReports report;
    ExtentTest test;

    @BeforeSuite
    public void repconfig() throws IOException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HH-mm-ss");
        String time = now.format(dtf);

        String reportPath = "C:\\Users\\ss582\\eclipse-workspace\\CRM_project\\src\\test\\java\\advance_html_reports\\Report_" + time + ".html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("facebook_reports");
        spark.config().setReportName("This is a Report made by Saurabh");
        spark.config().setTheme(Theme.STANDARD);

        report = new ExtentReports();
        report.attachReporter(spark);

        report.setSystemInfo("OS", "Windows");
        report.setSystemInfo("Version", "11");
        report.setSystemInfo("Browser", "Chromium");
    }

    @Test
    public void testStart() {
        System.out.println("Running testStart...");
        Assert.assertTrue(true);
    }

    @Test
    public void testPass() {
        System.out.println("Running testPass...");
        Assert.assertTrue(true);
    }

    @Test
    public void testFail() {
        System.out.println("Running testFail...");
        Assert.fail("Forcing failure");
    }

    @Test
    public void testSkip() {
        System.out.println("Running testSkip...");
        throw new SkipException("Skipping this test");
    }

    @Test(retryAnalyzer = Listners.List_Imp_Retry.class)
    public void amazon() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // ✅ Fixed

        driver.get("https://www.amazon.com");

        // ✅ Fixed locator
        WebElement verify = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(verify.isDisplayed(), "Amazon logo is not displayed!");

        // ✅ Take screenshot
        TakesScreenshot tks = (TakesScreenshot) driver;
        File src = tks.getScreenshotAs(OutputType.FILE);

        String screenshotPath = "C:\\Users\\ss582\\eclipse-workspace\\CRM_project\\src\\test\\java\\advance_html_reports\\AmazonScreenshot.png";
        File dest = new File(screenshotPath);
        FileHandler.copy(src, dest);

        // ✅ Attach screenshot to extent report
        test = report.createTest("Amazon Test");
        test.addScreenCaptureFromPath(dest.getAbsolutePath(), "ye raha = Screenshot");

        driver.quit();
    }

    @AfterSuite
    public void tearDown() {
        // ✅ Important - generate final report
        report.flush();
    }
}
