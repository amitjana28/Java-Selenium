package seleniumbasics;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	@Test
	public void RegisterUser() throws InterruptedException {
		// Set system property
		WebDriverManager.chromedriver().setup();
		
		// Initiate instance of ChromeDriver object
		WebDriver driver = new ChromeDriver();
		
		// Add implecitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		// Navigate to URL
		driver.navigate().to("https://www.automationexercise.com/");
		
		// Maximize window
		driver.manage().window().maximize();
		
		// Click on SignUp 
		driver.findElement(By.partialLinkText("Login")).click();
		
		// Enter name and email address
		driver.findElement(By.name("name")).sendKeys("Test1UserRegistration");
		driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys("ritikjana1@gmail.com");
		
		// Click on submit button
		driver.findElement(By.cssSelector(".signup-form .btn.btn-default")).click();
		
		// Fill required details like Title, password, dob
		
		// Click on mr radio button
		WebElement mrTitleRadioButtonElement = driver.findElement(By.id("id_gender1"));
		if(!mrTitleRadioButtonElement.isSelected()) {
			mrTitleRadioButtonElement.click();
		}
		
		// Enter password
		driver.findElement(By.id("password")).sendKeys("amit@2025");
		
		// Select DOB
		Select daysOptionDropdown = new Select(driver.findElement(By.id("days")));
		Select monthsOptionDropdown = new Select(driver.findElement(By.id("months")));
		Select yearsOptionDropdown = new Select(driver.findElement(By.id("years")));
		
		daysOptionDropdown.selectByIndex(28);
		monthsOptionDropdown.selectByVisibleText("June");
		yearsOptionDropdown.selectByValue("2000");
		
		// Click on newsletters and partner offers checkboxes
		WebElement newslettersCheckboxElement = driver.findElement(By.id("newsletter"));
		WebElement offerCheckboxElement = driver.findElement(By.id("optin"));
		if(!(newslettersCheckboxElement.isSelected() && offerCheckboxElement.isSelected())) {
			newslettersCheckboxElement.click();
			offerCheckboxElement.click();
		}
		
		
		// Fill required details first and last name, address, country, state, city, zipcode, mobile
		driver.findElement(By.id("first_name")).sendKeys("Amit");
		driver.findElement(By.id("last_name")).sendKeys("jana");
		driver.findElement(By.id("address1")).sendKeys("BD 125, Street 174, Newtown");
		driver.findElement(By.id("state")).sendKeys("West Bengal");
		driver.findElement(By.id("city")).sendKeys("Kolkata");
		driver.findElement(By.id("zipcode")).sendKeys("700156");
		driver.findElement(By.id("mobile_number")).sendKeys("8178942830");
		
		Select CountryDowpdown = new Select(driver.findElement(By.id("country")));
		CountryDowpdown.selectByContainsVisibleText("India");
		
		// Click on create account button
		driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
		
		// Click on continue button
		driver.findElement(By.className("btn-primary")).click();
		
		// Click on delete account button
		driver.findElement(By.className("fa-trash-o")).click();
		
		// Click on continue button
		driver.findElement(By.className("btn-primary")).click();
		
		Thread.sleep(3000);
		
		// Quit the browser instance
		driver.quit();
		

	}

}
