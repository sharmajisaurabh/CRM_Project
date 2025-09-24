package HeperAttributes_TestNgExtara;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InvocationCountForLoginFb {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "pass")
    WebElement pass;

    @FindBy(name = "login")
    WebElement loginBtn;
    
    @Test(invocationCount = 4)
    public void LoginIntoFacebook() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");

        PageFactory.initElements(driver, this);

        email.sendKeys("saurabh sharma");
        Thread.sleep(1000);
        pass.sendKeys("sharma@1234");
        Thread.sleep(1000);
        loginBtn.click();

        Thread.sleep(2000);
        driver.quit();
    }
}

















