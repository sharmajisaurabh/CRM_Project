package generics_utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	TakesScreenshot tks;
	
	public WebDriver_Utility(WebDriver driver) {
		this.driver = driver;
		this.act = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.tks= (TakesScreenshot)driver;
	}
	public void maximizewindow() {
		driver.manage().window().maximize();
	}
	

	public void fullscreen() {
		driver.manage().window().fullscreen();
	}
	
	public void waitforpageload() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void WaitForElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
	
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
				sel.selectByIndex(0);
	}
	
	public void select (WebElement element, String value) {
		Select sel = new Select (element);
		sel.selectByValue("saurabh");
	}
	
	public void hover(WebElement element) {
		act.moveToElement(element).build().perform();
	}
	
	public void doubleClickOnElement(WebElement element) {
		act.doubleClick(element).perform();
	}
	
	public void ssw() throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ss582\\eclipse-workspace\\CRM_project\\src\\main\\java\\generics_utility\\ss.png");
		FileHandler.copy(source,dest);
	}
	public void sse() throws IOException {
	WebElement loginBtn = driver.findElement(By.name("login"));
	File Source = loginBtn.getScreenshotAs(OutputType.FILE);
	File Destination = new File ("Users\\ss582\\eclipse-workspace\\CRM_project\\src\\main\\java\\generics_utility\\ss.png");
	FileHandler.copy(Source, Destination);
	}
	
	public void clickAndHold(WebElement element) {
		act.clickAndHold(element).perform();
	}
	
	public void dragAndDrop(WebElement source, WebElement target) {
		act.dragAndDrop(source, target).perform();
	}
	
	public void scrollIntoView(WebElement element, boolean bool) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView("+ bool +");", element);
	}
	
	public void jsScrollToTop() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
	}
	
	public void waitAndClick(WebElement element) {
		WaitForElementClickable(element);
		element.click();
}
	public void sendKeyboardKey(WebElement element, Keys key) {
		element.sendKeys(key);
	}
	
	public boolean isCheckboxChecked(WebElement checkbox) {
		return checkbox.isSelected();
	}
	
	public void switchToWindowByTitle(String partialWindowTitle) {
		Set<String> windowHandles = driver.getWindowHandles();
	}
	
	public void switchToParentWindow(String parentWindowHandle) {
		driver.switchTo().window(parentWindowHandle);
	}
	
	public void closeAllChildWindows(String parentWindowHandle) throws InterruptedException {
		Set<String> windowHandles = driver.getWindowHandles();
	}
	
	
}
