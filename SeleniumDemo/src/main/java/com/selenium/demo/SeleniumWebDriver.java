package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Senthil/dev_downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.close();

	}

}