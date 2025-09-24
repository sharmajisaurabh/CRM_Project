package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

    WebDriver driver;

    public Facebook (WebDriver d) {
        driver = d;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
     WebElement email;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(name = "login")
     WebElement login;

    public void enterUsername(String us) {
    	email.sendKeys(us);

    }

    public void enterPassword() {
        password.sendKeys("saurabh123");
    }

    public void clickLogin() {
        login.click();
    }
}