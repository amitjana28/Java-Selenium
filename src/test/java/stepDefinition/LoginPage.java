package stepDefinition;

import static pages.LoginPage.*;
import static pages.DashboardPage.*;

import io.cucumber.java.en.*;

public class LoginPage {
	
	@Given("User navigates to login page")
	public static void user_navigates_to_login_page() throws InterruptedException{
		navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("User enters login credentials")
	public static void user_enters_login_credentials() throws InterruptedException{
		sendKeysUserName("Admin");
		sendKeysPassword("admin123");
	}
	
	@And("User click login button")
	public static void user_click_login_button() throws InterruptedException {
		clickLoginBtn();
	}
	
	@Then("User able to logged in successfully")
	public static void user_able_to_logged_in_successfully() throws InterruptedException {
		navbarVisible();
		dashboardGridVisible();
	}
}
