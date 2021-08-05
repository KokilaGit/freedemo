package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Kokila/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///Users/Kokila/Documents/Selenium/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");

		WebElement chkbx = driver.findElement(By.id("rkwd"));
		chkbx.click();

		System.out.println(chkbx.isSelected());


	}

}
