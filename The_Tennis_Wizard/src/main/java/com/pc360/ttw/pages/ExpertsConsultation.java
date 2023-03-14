package com.pc360.ttw.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pc360.ttw.utility.ConfigReader;

public class ExpertsConsultation {

	private WebDriver driver;
	private ConfigReader setData;
	JavascriptExecutor js;
	Set<String> windowhandles;
		
	@FindBy(xpath="//a[normalize-space()='Experts Consultation']")
	private WebElement ExpertsCon;
	
	@FindBy(xpath="//input[@id='edit-combine']")
	private WebElement SearchName;
	
	@FindBy(xpath="//button[@id='edit-submit-find-expert-providers']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//a[text()='View Profile']")
	private WebElement ViewProfile;
	
	@FindBy(xpath="//a[normalize-space()='Contact Me']")
	private WebElement ContactMe;
	
	@FindBy(xpath = "//input[@id='edit-first-name']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id='edit-last-name']")
	private WebElement LastName ;
	
	@FindBy(xpath="//input[@id='edit-email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='edit-mobile-number']")
	private WebElement PhoneNo;
	
	@FindBy(xpath="//input[@id='edit-subject']")
	private WebElement Subject;
	
	@FindBy(xpath="//textarea[@id='edit-message']")
	private WebElement EnterMsg;
	
	@FindBy(xpath="//button[@id='edit-actions-submit']")
	private WebElement SendMsg;
	
	@FindBy(xpath="(//a[contains(@type,'button')][normalize-space()='Book Services'])[1]")
	private WebElement Book_Services;
	
	@FindBy(xpath="//span[@class='btn-text']")
	private WebElement BuyBtn;
	
	@FindBy(xpath="//button[@id='btnCheckout']")
	private WebElement CheckoutBtn;
	
	@FindBy(xpath="//a[@id='btnCancel']")
	private WebElement CancelBtn;
	
	
	public ExpertsConsultation(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void Experts_Consultation() throws InterruptedException {
		Thread.sleep(2000);
		ExpertsCon.click();
		System.out.println("========== Testing Page : Experts Consultation ==========");
	}
	
	public void Search_by_consultants_name() throws InterruptedException {

		Thread.sleep(2000);
		if (SearchName.isEnabled()) 
		{
			System.out.println("Search by consultants name search bar is enabled : " + SearchName.isEnabled());
			SearchName.sendKeys("Anirban Dutta");
		} 
		else 
		{
			System.out.println("Search by consultants name search bar is disabled : " + SearchName.isEnabled());
		}

		Thread.sleep(2000);
		if (SearchButton.isEnabled()) 
		{
			System.out.println("Submit button is enabled : " + SearchButton.isEnabled());
			SearchButton.click();
		} 
		else 
		{
			System.out.println("Submit button is disabled : " + SearchButton.isEnabled());
		} 
	}
	
	public void ViewProfile() throws InterruptedException {

		String oldTab = driver.getWindowHandle();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		if (ViewProfile.isEnabled()) 
		{
			System.out.println("View Profile button is enabled : " + ViewProfile.isEnabled());
			ViewProfile.click();
			Thread.sleep(5000);
			driver.switchTo().window(oldTab);
			Thread.sleep(2000);
		} 
		else 
		{
			System.out.println("View Profile button is disabled : " + ViewProfile.isEnabled());
		}
	}
	
	public void ContactMe() throws InterruptedException, IOException {
		
		windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(parentwindow);
		
		setData = new ConfigReader();		
		Thread.sleep(3000);
		if (ContactMe.isEnabled()) 
		{
			System.out.println("Contact Me button is enabled : " + ContactMe.isEnabled());
			ContactMe.click();
			Thread.sleep(5000);
			driver.switchTo().window(childwindow);
		} 
		else 
		{
			System.out.println("Contact Me button is disabled : " + ContactMe.isEnabled());
		}	
		
	
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		if (FirstName.isEnabled()) 
		{
			System.out.println("First Name textbox is enabled : " + FirstName.isEnabled());
			FirstName.sendKeys(setData.getFirstName());
		} 
		else 
		{
			System.out.println("First Name textbox is disabled : " + FirstName.isEnabled());
		}
		
		Thread.sleep(2000);
		if (LastName.isEnabled()) 
		{
			System.out.println("Last Name textbox is enabled : " + LastName.isEnabled());
			LastName.sendKeys(setData.getLastName());
		} 
		else 
		{
			System.out.println("Last Name textbox is disabled : " + LastName.isEnabled());
		}
		
		Thread.sleep(2000);
		if (email.isEnabled()) 
		{
			System.out.println("email textbox is enabled : " + email.isEnabled());
			email.sendKeys(setData.getEmail());
		} 
		else 
		{
			System.out.println("email textbox is disabled : " + email.isEnabled());
		}
		
		Thread.sleep(2000);
		if (PhoneNo.isEnabled()) 
		{
			System.out.println("PhoneNo textbox is enabled : " + PhoneNo.isEnabled());
			PhoneNo.sendKeys(setData.getMobileNo());
		} 
		else 
		{
			System.out.println("PhoneNo textbox is disabled : " + PhoneNo.isEnabled());
		}
		
		Thread.sleep(2000);
		if (Subject.isEnabled()) 
		{
			System.out.println("Subject textbox is enabled : " + Subject.isEnabled());
			Subject.sendKeys(setData.getSubject());
		} 
		else 
		{
			System.out.println("Subject textbox is disabled : " + Subject.isEnabled());
		}
		
		Thread.sleep(2000);
		if (EnterMsg.isEnabled()) 
		{
			System.out.println("EnterMsg textbox is enabled : " + EnterMsg.isEnabled());
			EnterMsg.sendKeys(setData.getComment());
		} 
		else 
		{
			System.out.println("EnterMsg textbox is disabled : " + EnterMsg.isEnabled());
		}
		
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,82)");
		
		Thread.sleep(1000);
		if (SendMsg.isEnabled()) 
		{
			System.out.println("SendMsg button is enabled : " + SendMsg.isEnabled());
			SendMsg.click();
		} 
		else 
		{
			System.out.println("SendMsg button is disabled : " + SendMsg.isEnabled());
		}
	}
	
	
	public void bookServices() throws InterruptedException {

		windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(2000);
		if (Book_Services.isEnabled()) 
		{
			System.out.println("Book Services button is enabled : " + Book_Services.isEnabled());
			Book_Services.click();
		} 
		else 
		{
			System.out.println("Book Services button is disabled : " + Book_Services.isEnabled());
		}
		
		Thread.sleep(2000);
		if (BuyBtn.isEnabled()) 
		{
			System.out.println("BUY button is enabled : " + BuyBtn.isEnabled());
			BuyBtn.click();
		} 
		else 
		{
			System.out.println("BUY button is disabled : " + BuyBtn.isEnabled());
		}
		
		Thread.sleep(2000);
		if (CheckoutBtn.isEnabled()) 
		{
			System.out.println("Check Out button is enabled : " + CheckoutBtn.isEnabled());
			//CheckoutBtn.click();
		} 
		else 
		{
			System.out.println("Check Out button is disabled : " + CheckoutBtn.isEnabled());
		}
		
		Thread.sleep(2000);
		if (CancelBtn.isEnabled()) 
		{
			System.out.println("Cancel button is enabled : " + CancelBtn.isEnabled());
			CancelBtn.click();
		} 
		else 
		{
			System.out.println("Cancel button is disabled : " + CancelBtn.isEnabled());
		}
		
	}
	
}
