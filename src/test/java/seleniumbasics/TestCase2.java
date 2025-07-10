package seleniumbasics;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	WebDriver driver;
	
	@BeforeEach
	public void Setup() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void LoginUser() {
		// Add implecitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				
		// Navigate to URL
		driver.navigate().to("https://www.automationexercise.com/");
				
		// Maximize window
		driver.manage().window().maximize();
				
		// Click on SignUp 
		driver.findElement(By.partialLinkText("Login")).click();
	}

	@AfterEach
	public void Quit() {
		driver.quit();
	}
}
