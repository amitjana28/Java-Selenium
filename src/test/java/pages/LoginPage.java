package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;

public class LoginPage extends Utility{

	// Username textbox
	public static String usernameTxtBoxName = "username";
	
	// Password textbox
	public static String passwordTxtBoxName = "password";
	
	// login button
	public static String loginBtnCSS = ".orangehrm-login-button";
	
	// Navigate to specific url
	public static void navigateTo(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
	}
	
	public static void sendKeysUserName(String username) throws InterruptedException {
		driver.findElement(By.name(usernameTxtBoxName)).sendKeys(username);
	}
	
	public static void sendKeysPassword(String password) throws InterruptedException {
		driver.findElement(By.name(passwordTxtBoxName)).sendKeys(password);
	}
	
	public static void clickLoginBtn() throws InterruptedException {
		driver.findElement(By.cssSelector(loginBtnCSS)).click();
		Thread.sleep(5000);
	}
	
	
}
