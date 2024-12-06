package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By byFullName = By.id("txtFullName");
	By bymailid = By.id("txtEmail");
	By byPhoneNumber = By.id("txtPhoneNumber");
	By byCity = By.id("txtCity");
	By byCourseTitle = By.xpath("//select[@id='ddlCourseTite']");
	By byCourseOption = By.xpath("//*[@value='4']");
	By bySubmit = By.xpath("//input[@type='submit']");
	By option = By.xpath("//option[text()='Percentage']");
	By create = By.xpath("//input[@type='submit']");

	public void VerifyUserIsAbletoSubmitCredentials() throws InterruptedException {
		driver.findElement(byFullName).clear();
		driver.findElement(byFullName).sendKeys("VIGNESH_NAIDU");
		Thread.sleep(1000);

		driver.findElement(bymailid).clear();
		driver.findElement(bymailid).sendKeys("vignesh6@gmail.com");
		Thread.sleep(1000);

		driver.findElement(byPhoneNumber).clear();
		driver.findElement(byPhoneNumber).sendKeys("9396688872");
		Thread.sleep(1000);

		driver.findElement(byCity).clear();
		driver.findElement(byCity).sendKeys("GUNTUR");
		Thread.sleep(1000);

		driver.findElement(byCourseTitle).click();
		Thread.sleep(1000);
		
		WebElement option = driver.findElement(byCourseOption);
		JavascriptExecutor jsE = (JavascriptExecutor) driver;
		jsE.executeScript("arguments[0].setAttribute('style', 'border: 4px solid red');",option);
		driver.findElement(byCourseOption).click();
		Thread.sleep(1000);

		driver.findElement(bySubmit).click();

		System.out.println("User login to application successfully");

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}	
}
