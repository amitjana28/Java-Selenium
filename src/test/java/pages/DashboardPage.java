package pages;

import static org.junit.Assert.*;

import org.openqa.selenium.By;

import util.Utility;

public class DashboardPage extends Utility {
	
	public static String navBarCSS = ".oxd-navbar-nav";
	
	public static String dashboardGridCSS = ".orangehrm-dashboard-grid";
	
	public static void navbarVisible() {
		boolean isNavbarVisible = driver.findElement(By.cssSelector(navBarCSS)).isDisplayed();
		assertEquals(true,isNavbarVisible);
	}
	
	public static void dashboardGridVisible() {
		boolean isDashboardGridVisible = driver.findElement(By.cssSelector(dashboardGridCSS)).isDisplayed();
		assertEquals(true,isDashboardGridVisible);
	}

}
