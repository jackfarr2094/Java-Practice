package com.Nationwide.cucmber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	private WebDriver driver;
	
	@Given("^User on google's landing page$")
	public void user_on_google_s_landing_page() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/chromedriver.exe");
	    
	    ChromeOptions option = new ChromeOptions();
	    option.setHeadless(true);
	    driver = new ChromeDriver(option);
	    driver.get("http://www.google.com");
	   
	    
	}

//	@When("^User on clicks on searchbar$")
//	public void user_on_clicks_on_searchbar() {
//		driver.findElement(By.name("q")).click();
//	}

	@When("^User enters fender stratocaster in searchbar$")
	public void user_enters_fender_stratocaster_in_searchbar() {
		driver.findElement(By.name("q")).sendKeys("fender stratocaster");
	}
	
//	@When("^User presses clicks search icon$")
//	public void user_presses_clicks_search_icon() {
//		driver.findElement(By.name("btnK")).sendKeys(Keys.CLICK);
//	}

	@When("^User presses enter key on searchbar$")
	public void user_presses_enter_key_on_searchbar() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("^title of webpage is \"([^\"]*)\"$")
	public void title_of_webpage_is_fender_stratocaster_Google_Search(String arg1) {
		String title = driver.getTitle();
		assertEquals("fender stratocaster - Google Search", title);
	}
}
