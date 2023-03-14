package com.pc360.ttw.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pc360.ttw.utility.ConfigReader;

public class ContactUs {

	private WebDriver driver;
	private ConfigReader setData;
	JavascriptExecutor js;
	
	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	private WebElement ContactUs;
	
	@FindBy(xpath = " //input[@id='edit-enter-your-name']")  
	private WebElement enter_your_name;            
	
	@FindBy(xpath = "//input[@id='edit-enter-mail-address']")  
	private WebElement enter_mail_address;
	
	@FindBy(xpath = "//input[@id='edit-enter-subject']")  
	private WebElement enter_subject;
	
	@FindBy(xpath = "//textarea[@id='edit-enter-message']")  
	private WebElement enter_message;
	
	@FindBy(xpath = "//button[@id='edit-actions-submit']")  
	private WebElement Send_Message;
	
	@FindBy(id = "bottom-subscription-blog")
	private WebElement Join_Our_Newsletter;

	@FindBy(id = "edit-email-address")
	private WebElement Enter_Email_Address;

	@FindBy(xpath = "(//button[normalize-space()='Join'])[1]")
	private WebElement Click_Join;
	
	public ContactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Contact_Us() throws InterruptedException {
		Thread.sleep(2000);
		ContactUs.click();
		System.out.println("========== Testing page : Contact Us ==========");
   }
	
   public void Get_in_touch () throws InterruptedException, IOException {
	   setData = new ConfigReader();
	   
		Thread.sleep(2000);
		enter_your_name.isDisplayed();

		Thread.sleep(2000);
		if (enter_your_name.isEnabled()) 
		{
			System.out.println("Enter Your Name textbox is enabled : " + enter_your_name.isEnabled());
			enter_your_name.sendKeys(setData.getFirstName());
		} 
		else 
		{
			System.out.println("Enter Your Name textbox is disabled : " + enter_your_name.isEnabled());
		}
		
		Thread.sleep(2000);
		if (enter_mail_address.isEnabled()) 
		{
			System.out.println("Enter Your Email Address textbox is enabled : " + enter_mail_address.isEnabled());
			enter_mail_address.sendKeys(setData.getEmail());
		} 
		else 
		{
			System.out.println("Enter Your Email Address textbox is disabled : " + enter_mail_address.isEnabled());
		}
		
		Thread.sleep(2000);
		if (enter_subject.isEnabled()) 
		{
			System.out.println("Enter Your Subject textbox is enabled : " + enter_subject.isEnabled());
			enter_subject.sendKeys(setData.getSubject());
		} 
		else 
		{
			System.out.println("Enter Your Subject textbox is disabled : " + enter_subject.isEnabled());
		}
		
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");

		
		Thread.sleep(2000);
		if (enter_message.isEnabled()) 
		{
			System.out.println("Enter Your Message textbox is enabled : " + enter_message.isEnabled());
			enter_message.sendKeys(setData.getComment());
		} 
		else 
		{
			System.out.println("Enter Your Message textbox is disabled : " + enter_message.isEnabled());
		}
		
	/*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
		WebElement captchabox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
		Thread.sleep(5000);
		captchabox.click();
	*/	
		
		Thread.sleep(2000);
		if (Send_Message.isEnabled()) 
		{
			System.out.println("Send Message Button is enabled : " + Send_Message.isEnabled());
			Send_Message.click();
		} 
		else 
		{
			System.out.println("Send Message Button is disabled : " + Send_Message.isEnabled());
		}
   }
  
   public void Join_Our_Newsletter() throws InterruptedException, IOException {
	   setData = new ConfigReader();
	   
	   Thread.sleep(2000);
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
			driver.findElement(By.xpath("//img[@alt='Home']"));

		} 
		else 
		{
			System.out.println("Join button is disabled : " + Click_Join.isEnabled());
		}
		
	}
   
}
