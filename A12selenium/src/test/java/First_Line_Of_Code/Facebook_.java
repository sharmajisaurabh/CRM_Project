package First_Line_Of_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import object_Repository.Facebook;

public class Facebook_ {

    public static void main(String[] args) {

        // 1. Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Create Page Object
        Facebook f1 = new Facebook(driver);
        
        driver.get("https://www.facebook.com/");

        // 4. Perform actions
        f1.enterUsername("saurabh");
        f1.enterPassword();
        f1.clickLogin();

        // 5. Close browser
        driver.quit();
    }
}
