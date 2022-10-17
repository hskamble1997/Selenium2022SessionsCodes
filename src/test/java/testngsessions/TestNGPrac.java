package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumsessions.BrowserUtil;

public class TestNGPrac {

	WebDriver driver;
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS - connectWithDB");
	}
	
	@BeforeTest
	public void createTestUser() {
		System.out.println("BT - createUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("BM - login");
	}
	
	
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	@Test
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - deleteUser");
	}
	
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS - disconnectwithDB");
	}
	
}
