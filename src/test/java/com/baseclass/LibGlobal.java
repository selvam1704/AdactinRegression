package com.baseclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver dr;

		public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		dr.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		dr.get(url);

	}

	public static void fill(WebElement name, String value) {
		name.sendKeys(value);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}
	public static void getTheEnteredText(WebElement element) {
		String txt = element.getAttribute("value");
		System.out.println(txt);
		
		

	}
	public static void selByText(WebElement element,String txt) {
		new Select(element).selectByVisibleText(txt);

	}

}
