package com.qa.demositetest;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Create a user; log in with that user, assert that it was successful.
//The website only stores one user and password at a time so you must be quick in your automation.

public class DemoSiteTest {

	private WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//shiva//Documents//AA_PROJECTS//DG_seleniumProjects//seleniumTest1//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().fullscreen();

	}

	WebElement target;

	@Test
	public void test1() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/");

		target = driver.findElement(
				By.xpath("/html/body/div[1]/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		target.click();
		
		target = driver.findElement(By.name("username"));
		target.sendKeys("ArthurDent");
		
		target = driver.findElement(By.name("password"));
		target.sendKeys("earthToGargle");
		
		target = driver.findElement(By.name("FormsButton2"));
		target.click();
		
		target = driver.findElement(
				By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[2]/small/a"));
		target.click();
		
		target = driver.findElement(By.name("username"));
		target.sendKeys("ArthurDent");
		
		target = driver.findElement(By.name("password"));
		target.sendKeys("earthToGargle");
		
		target = driver.findElement(By.name("FormsButton2"));
		target.click();
		
		assertTrue(driver.getPageSource().contains("**Successful Login**"));
		
		Thread.sleep(9000);
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
