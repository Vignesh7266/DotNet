package NewPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;

	By GetStart = By.xpath("//a[text()='Get started free']");
	By Gmail = By.xpath("//a[text()='Gmail']");

	public void LaunchApplication() {
		// Create a new WebDriver object
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to the main window
		driver.get("https://www.google.com/");

		// Open a new tab in the existing window
		driver.switchTo().newWindow(WindowType.TAB);

		// Navigate to a new website in the newly opened tab
		driver.navigate().to("https://www.browserstack.com/");

		// Perform actions in the new tab
		driver.findElement(GetStart).click();
		System.out.println("GetStart Element Clicked Successfully");
		System.out.println("                                     ");

		// Switch back to the main window
		driver.switchTo().window(driver.getWindowHandles().iterator().next());

		// Perform actions in the main window
		driver.findElement(Gmail).click();
		System.out.println("Gmail Element Clicked Successfully");

		// Close the driver
		driver.quit();
	}
}
