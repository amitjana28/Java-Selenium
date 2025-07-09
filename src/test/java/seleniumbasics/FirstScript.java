package seleniumbasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		// Set system property
		WebDriverManager.chromedriver().setup();
		
		// Initiate instance of ChromeDriver object
		WebDriver driver = new ChromeDriver();
		
		// Add implecitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		// Navigate to URL
		driver.navigate().to("https://www.amazon.in/");
		
		// Maximize window
		driver.manage().window().maximize();
		
		// Click on cart icon (here we are going to use ID locator) and go back
		driver.findElement(By.id("nav-cart-text-container")).click();
		driver.navigate().back();
		
		// Click on return and order (here we are going to use partial link text)
		driver.findElement(By.partialLinkText("Orders")).click();
		driver.navigate().back();
		
		// Quit the browser instance
		driver.quit();
		
		
		

	}

}
