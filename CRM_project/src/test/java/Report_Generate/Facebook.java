package Report_Generate;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Facebook {
    ExtentReports report;

    @BeforeSuite
    public void repconfig() throws IOException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HH-mm-ss");
        String time = now.format(dtf);

        String reportPath = "C:\\Users\\ss582\\eclipse-workspace\\CRM_project\\src\\test\\java\\advance_html_reports\\Report_" + time + ".html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("facebook_reports");
        spark.config().setReportName("This is a Report made by Saurabh");
        spark.config().setTheme(Theme.DARK);

        report = new ExtentReports();
        report.attachReporter(spark);

        report.setSystemInfo("OS", "Windows");
        report.setSystemInfo("Version", "11");
        report.setSystemInfo("Browser", "Chromium");
    }

    @Test
    public void login() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.cricbuzz.com/");

        ExtentTest test = report.createTest("login");
        test.log(Status.INFO, "This is info......");
        test.log(Status.PASS, "This is passed......");
        test.log(Status.WARNING, "This is warning......");
        test.log(Status.SKIP, "This is skipped......");
        test.log(Status.FAIL, "This is failed......");

        //  Screenshot
        TakesScreenshot tks = (TakesScreenshot) driver;
        File src = tks.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\ss582\\eclipse-workspace\\CRM_project\\src\\test\\java\\advance_html_reports\\ss.png");
        FileHandler.copy(src, dest);

        //  Add screenshot to report
        test.addScreenCaptureFromPath(dest.getAbsolutePath(), "Facebook Screenshot");

        driver.quit();
    }

    @AfterSuite
    public void ReportBackup() {
        report.flush();
    }
}
