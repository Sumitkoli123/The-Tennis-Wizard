package com.pc360.ttw.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pc360.ttw.utility.ConfigReader;

public class LaunchApp {

	private WebDriver driver;
	private ConfigReader setData;

	public LaunchApp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver launchApp() throws IOException {
		setData = new ConfigReader();
		// Javascript executor to return value
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").toString().equals("complete");
		// get the current URL
		String s = driver.getCurrentUrl();
		// checking condition if the URL is loaded
		if (s.equals(setData.getUrl())) {
			System.out.println("Page Loaded");
			System.out.println("Current Url: " + s);
		} else {
			System.out.println("Page did not load");
		}

		return driver;
	}
}
