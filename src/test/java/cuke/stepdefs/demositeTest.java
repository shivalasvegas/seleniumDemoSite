package cuke.stepdefs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demositeTest {

	private WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shiva//Documents//AA_PROJECTS//DG_seleniumProjects//seleniumTest1//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
			
	}
	
	WebElement target;
	
	@Given("^we can open demosite$")
	public void we_can_open_demosite() throws Throwable {
		driver.get("http://thedemosite.co.uk/");
		Thread.sleep(3000);
		assertTrue(driver.getTitle().contains("FREE example"));
	}

	@When("^we create a user$")
	public void we_create_a_user() throws Throwable {
	    target = driver.findElement(By.xpath("/html/body/div[1]/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
	    target.click();
	    Thread.sleep(2000);
	    assertTrue(driver.getTitle().contains("Add a user"));
	    
	    target = driver.findElement(By.name("username"));
		target.sendKeys("ArthurDent");
		
		target = driver.findElement(By.name("password"));
		target.sendKeys("earthToGargle");
		
		target = driver.findElement(By.name("FormsButton2"));
		target.click();
		
		
	}

	@Then("^demosite will take us to the login page$")
	public void demosite_will_take_us_to_the_login_page() throws Throwable {
		target = driver.findElement(By.xpath("/html/body/div[1]/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
	    target.click();
	    Thread.sleep(2000);
	    assertTrue(driver.getTitle().contains("Login example"));
	    target = driver.findElement(By.name("username"));
		target.sendKeys("ArthurDent");
		
		target = driver.findElement(By.name("password"));
		target.sendKeys("earthToGargle");
		
		target = driver.findElement(By.name("FormsButton2"));
		target.click();
		assertTrue(driver.getPageSource().contains("**Successful Login**"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
