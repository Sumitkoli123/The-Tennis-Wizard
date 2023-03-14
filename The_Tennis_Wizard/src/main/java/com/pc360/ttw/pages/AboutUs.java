package com.pc360.ttw.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pc360.ttw.utility.ConfigReader;

public class AboutUs {

	private WebDriver driver;
	private ConfigReader setData;
	JavascriptExecutor js;
	private String text1 = "About Us";

	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement About_us;

	@FindBy(xpath = "//h1[@class='m-0 h1 Comfortaa font-weight-bold aos-init aos-animate']")
	private WebElement About_US_Page_Heading;

	@FindBy(id = "bottom-subscription-blog")
	private WebElement Join_Our_Newsletter;

	@FindBy(id = "edit-email-address")
	private WebElement Enter_Email_Address;

	@FindBy(id = "edit-actions-submit")
	private WebElement Click_Join;

	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void About_US() throws InterruptedException {
		Thread.sleep(2000);
		About_us.click();
		String text2 = About_US_Page_Heading.getText();
		Assert.assertEquals(text1, text2);
		System.out.println("========== Testing Page : About Us ==========");
	}

	public void Join_Our_Newsletter() throws InterruptedException, IOException {
		setData = new ConfigReader();
		
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(2000);
		Join_Our_Newsletter.isDisplayed();

		Thread.sleep(2000);
		if (Enter_Email_Address.isEnabled()) 
		{
			System.out.println("Enter email textbox is enabled : " + Enter_Email_Address.isEnabled());
			Enter_Email_Address.sendKeys(setData.getEmail());
		} 
		else 
		{
			System.out.println("Enter email textbox is disabled : " + Enter_Email_Address.isEnabled());
		}
		

		Thread.sleep(2000);
		if (Click_Join.isEnabled()) 
		{
			System.out.println("Join button is enabled : " + Click_Join.isEnabled());
			Click_Join.click();
		} 
		else 
		{
			System.out.println("Join button is disabled : " + Click_Join.isEnabled());
		}
		
		driver.findElement(By.xpath("//img[@alt='Home']"));
	}
}
