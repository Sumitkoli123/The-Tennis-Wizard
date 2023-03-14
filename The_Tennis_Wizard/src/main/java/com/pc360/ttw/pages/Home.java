package com.pc360.ttw.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pc360.ttw.utility.ConfigReader;

public class Home {
	
	private WebDriver driver;
	private ConfigReader setData;
	JavascriptExecutor js;
	
	@FindBy(xpath="//button[@id='edit-openid-connect-client-generic-login']")
	private WebElement Login_Join;
	
	@FindBy(xpath="//a[normalize-space()='Free Sign Up']")
	private WebElement FreeSignUp ;
	
	@FindBy(xpath="//button[@id='btn-login']")
	private WebElement SignInBtn;
	
	@FindBy(xpath="//a[@id='subscribe-btn']")
	private WebElement SubscribeBtn;
	
	@FindBy(xpath="//a[text()='Find Experts']")
	private WebElement FindExpertBtn;
	
	@FindBy(xpath="//a[normalize-space()='Join For Free']")
	private WebElement JoinForFree;
	
	@FindBy(xpath="//a[normalize-space()='Join Pro']")
	private WebElement JoinPro;
	
	@FindBy(xpath="//a[normalize-space()='Join Pro Plus']")
	private WebElement JoinProPlus;
	
	@FindBy(xpath="//input[@id='edit-email-address']")
	private WebElement EmailTextBox;
	
	@FindBy(xpath="//button[@name='op']")
	private WebElement JoinBtn;
	
	

	public Home(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void LoginJoin() throws InterruptedException {
		Thread.sleep(2000);
        boolean AcceptBtn = driver.findElement(By.xpath("//button[normalize-space()='Accept']")).isEnabled();	
		if(AcceptBtn==true) 
		{
			driver.findElement(By.xpath("//button[normalize-space()='Accept']")).click();			
		}
		else 
		{
			System.out.println("Accept button is not present to accept cookies PopUp...");
		}
		
		System.out.println("========== Testing Page : Home Page ==========");
		
		Thread.sleep(2000);
		if (Login_Join.isEnabled()) 
		{
			System.out.println("Login/Join button is enabled : " + Login_Join.isEnabled());
			Login_Join.click();	
			Thread.sleep(2000);
			driver.navigate().back();
		} 
		else 
		{
			System.out.println("Login/Join button is disabled : " + Login_Join.isEnabled());
		}
	}
	
	public void FreeSignUp() throws InterruptedException {
		Thread.sleep(2000);
		if (FreeSignUp.isEnabled()) 
		{
			System.out.println("Free Sign Up button is enabled : " + FreeSignUp.isEnabled());
			FreeSignUp.click();	
			Thread.sleep(2000);
			driver.navigate().back();
		} 
		else 
		{
			System.out.println("Free Sign Up button is disabled : " + FreeSignUp.isEnabled());
		}
	}
	
	public void SubscribeBtn() throws InterruptedException {
		Thread.sleep(2000);
		if (SubscribeBtn.isEnabled()) 
		{
			System.out.println("Learn More & Subscribe link is enabled : " + SubscribeBtn.isEnabled());
			SubscribeBtn.click();	
			Thread.sleep(3000);
			driver.navigate().back();
		} 
		else 
		{
			System.out.println("Learn More & Subscribe link is disabled : " + SubscribeBtn.isEnabled());
		}
	}
	
	public void FindExpertBtn() throws InterruptedException {
		Thread.sleep(2000);
		if (FindExpertBtn.isEnabled()) 
		{
			System.out.println("Find Experts link is enabled : " + FindExpertBtn.isEnabled());
			FindExpertBtn.click();	
			Thread.sleep(3000);
			driver.navigate().back();
		} 
		else 
		{
			System.out.println("Find Experts link is disabled : " + FindExpertBtn.isEnabled());
		}
	}
	
	public void Tennis_Recruitment_Package() throws InterruptedException {
		
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		
		Thread.sleep(2000);
		if (JoinForFree.isEnabled()) 
		{
			System.out.println("Join For Free button is enabled : " + JoinForFree.isEnabled());
			JoinForFree.click();
			Thread.sleep(4000);
			driver.navigate().back();
		} 
		else 
		{
			System.out.println("Join For Free button is disabled : " + JoinForFree.isEnabled());
		}
		
		Thread.sleep(3000);
		if (JoinPro.isEnabled()) 
		{
			System.out.println("Join pro button is enabled : " + JoinPro.isEnabled());
			JoinPro.click();
			Thread.sleep(5000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			List<WebElement> JoinProPlus = driver.findElements(By.xpath("//a[normalize-space()='Join Pro Plus']"));
			if(JoinProPlus.size() > 0 || JoinProPlus.size() < 0 ) 
			{
							
			}
			else 
			{
			driver.navigate().back();
			}
		} 
		else 
		{
			System.out.println("Join pro button is disabled : " + JoinPro.isEnabled());
		}
	
		Thread.sleep(3000);
		if (JoinProPlus.isEnabled()) 
		{
			System.out.println("Join pro plus button is enabled : " + JoinProPlus.isEnabled());
			JoinProPlus.click();
			Thread.sleep(5000);
			driver.navigate().back();
		} 
		else 
		{
			System.out.println("Join pro plus button is disabled : " + JoinProPlus.isEnabled());
		}
	}
	
	public void Join_Our_Newsletter() throws InterruptedException, IOException {
		setData = new ConfigReader();

		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);
		if (EmailTextBox.isEnabled()) 
		{
			System.out.println("Enter Email textbox is enabled : " + EmailTextBox.isEnabled());
			EmailTextBox.sendKeys(setData.getEmail());
		} 
		else 
		{
			System.out.println("Enter Email textbox is disabled : " + EmailTextBox.isEnabled());
		}

		Thread.sleep(2000);
		if (JoinBtn.isEnabled()) 
		{
			System.out.println("Join button is enabled : " + JoinBtn.isEnabled());
			JoinBtn.click();
		} 
		else 
		{
			System.out.println("Join button is disabled : " + JoinBtn.isEnabled());
		}
	}  
}
