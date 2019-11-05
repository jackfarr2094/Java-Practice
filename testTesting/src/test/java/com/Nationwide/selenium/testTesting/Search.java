package com.Nationwide.selenium.testTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/chromedriver.exe");
		driver =  new ChromeDriver();
	}
	
	@Test	
	public void homePageSearchTest() throws InterruptedException {
		driver.get("http://google.co.uk");
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		Search.sendKeys("Kittens");
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
		@After
		public void tearDown() {
			driver.quit();
		}
	}
