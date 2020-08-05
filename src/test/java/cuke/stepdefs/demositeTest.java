package cuke.stepdefs;


import static org.junit.Assert.assertEquals;

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
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^we create a user$")
	public void we_create_a_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^demosite will take us to the login page$")
	public void demosite_will_take_us_to_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
