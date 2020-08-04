package com.qa.demositetest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {
	
private WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shiva//Documents//AA_PROJECTS//DG_seleniumProjects//seleniumTest1//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		
			
	}
	
	WebElement target;
	
	@Test
	public void test1() throws InterruptedException{
		driver.get("http://thedemosite.co.uk/");
		
//target=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
//target.sendKeys("kittens");
//target.submit();
//target=driver.findElement(By.id("hdtb-msb-vis"));  //videos
//target.click();
		
		Thread.sleep(5000);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}


}
