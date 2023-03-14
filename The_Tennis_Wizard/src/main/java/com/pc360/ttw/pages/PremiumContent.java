package com.pc360.ttw.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pc360.ttw.utility.ConfigReader;

public class PremiumContent {
	
	private WebDriver driver;
	private ConfigReader setData;
	JavascriptExecutor js;  
	
	@FindBy(xpath = "//a[text()='Premium Content']")
	private WebElement Premium_Content;
	
	@FindBy(linkText = "How Important is Club Tennis in Getting Recruited?")
	private WebElement PopularPost;
	
	@FindBy(xpath = "//span[@class='field field--name-title field--type-string field--label-hidden']")
	private WebElement PageHeading;
	
	@FindBy(xpath = "//h2[text()='Hey, Is This Article Useful ?']")
	private WebElement This_Article_Useful;
	
	@FindBy(id = "edit-first-name")
	private WebElement Enter_First_Name;
	
	@FindBy(id = "edit-last-name")
	private WebElement Enter_Last_Name;
	
	@FindBy(id = "edit-email")
	private WebElement Enter_Email;
	
	@FindBy(id = "edit-evaluation-no")
	private WebElement Select_Evaluation;
	
	@FindBy(id = "edit-feedback")
	private WebElement Enter_Feedback;
	
	@FindBy(xpath = "//span[@id='recaptcha-anchor']")
	private WebElement Check_recaptcha;
	
	@FindBy(xpath = "//button[@id='edit-submit']")
	private WebElement Click_Submit;
	
	@FindBy(xpath= "//h2[text()='Add new comment']")
	private WebElement Add_new_comment;
	
	@FindBy(id= "edit-name")
	private WebElement Enter_Your_Name;
	
	@FindBy(id= "edit-subject-0-value")
	private WebElement Enter_Subject;
	
	@FindBy(id= "edit-comment-body-0-value")
	private WebElement Enter_Comment;
	
	@FindBy(xpath= "//button[text()='Save']")
	private WebElement Click_Save;
	
	@FindBy(id= "bottom-subscription-blog")
	private WebElement Join_Our_Newsletter;
	
	@FindBy(id= "edit-email-address")
	private WebElement Enter_Email_Address;
	
	@FindBy(xpath= "//button[@id='edit-actions-submit']")
	private WebElement Click_Join;
	
	@FindBy(id= "bottom-subscription-blog")
	private WebElement Join_Our_Newsletter_OnPremiumContentPage;
	
	@FindBy(id= "edit-email-address")
	private WebElement Enter_Email_Address__OnPremiumContentPage;
	
	@FindBy(xpath= "//button[@id='edit-actions-submit']")
	private WebElement Click_Join__OnPremiumContentPage;
	
	
	public PremiumContent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void Premium_Content() throws InterruptedException {
		Thread.sleep(2000);
		Premium_Content.click();
		System.out.println("========== Testing Page : Premium Content ==========");
	}
	
	public void PopularPost() throws InterruptedException {
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		PopularPost.click();
	}
	
	public void PageHeading() throws InterruptedException {
		Thread.sleep(2000);
		String heading = PageHeading.getText();
		System.out.println("Page Heading Is : " + heading);
		
		if (PageHeading.isDisplayed()) 
		{
			System.out.println("PageHeading is visible : " + PageHeading.isDisplayed());
		} 
		else 
		{
			System.out.println("PageHeading is not visible : " + PageHeading.isDisplayed());
		}
	}
	
	public void This_Article_Useful() throws InterruptedException, IOException {
		setData = new ConfigReader();
		 Thread.sleep(2000);
		 if(Enter_First_Name.isEnabled()) 
		   { 
		     System.out.println("First Name Textbox is enabled : " + Enter_First_Name.isEnabled() );
		     Enter_First_Name.sendKeys(setData.getFirstName());
		   } 
		   else 
		   { 
		      System.out.println("First Name Textbox is disabled : " +Enter_First_Name.isEnabled()); 
		   } 
		 
		 
		 Thread.sleep(2000);
		 if(Enter_Last_Name.isEnabled()) 
		   { 
		     System.out.println("Last Name Textbox is enabled : " + Enter_Last_Name.isEnabled()); 
		     Enter_Last_Name.sendKeys(setData.getLastName());
		   } 
		   else 
		   { 
		      System.out.println("Last Name Textbox is disabled : " +Enter_Last_Name.isEnabled()); 
		   } 
		 
		 
		 Thread.sleep(2000);
		 if(Enter_Email.isEnabled()) 
		   { 
		     System.out.println("Email Textbox is enabled : " + Enter_Email.isEnabled()); 
		     Enter_Email.sendKeys(setData.getEmail());
		   } 
		   else 
		   { 
		      System.out.println("Email Textbox is disabled : " +Enter_Email.isEnabled()); 
		   } 
		 
		 
		 Thread.sleep(2000);
		 if(Select_Evaluation.isEnabled()) 
		   { 
		     System.out.println("Evaluation radio button is clickable : " + Select_Evaluation.isEnabled());
		     Select_Evaluation.click();
		   } 
		   else 
		   { 
		      System.out.println("Evaluation radio button is Not clickable : " +Select_Evaluation.isEnabled()); 
		   } 
		 
		  
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300)");
		 
		 Thread.sleep(2000);
		 if(Enter_Feedback.isEnabled()) 
		   { 
		     System.out.println("Feedback textbox area is enabled : " + Enter_Feedback.isEnabled());
		     Enter_Feedback.sendKeys(setData.getComment());
		   } 
		   else 
		   { 
		      System.out.println("Feedback textbox area is disabled : " +Enter_Feedback.isEnabled()); 
		   } 
		 
		 Thread.sleep(2000);
		 if(Click_Submit.isEnabled()) 
		   { 
		     System.out.println("Submit button is enabled : " + Click_Submit.isEnabled() ); 
		     Click_Submit.click();
		   } 
		   else 
		   { 
		      System.out.println("Submit button is disabled : " +Click_Submit.isEnabled()); 
		   } 	 
	}
	
	public void Add_new_comment() throws InterruptedException, IOException {
		setData = new ConfigReader();
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1930)");
		 
		Thread.sleep(2000);
		Add_new_comment.isDisplayed();
		
		Thread.sleep(2000);
		if(Enter_Your_Name.isEnabled()) 
		   { 
		     System.out.println("Your Name Textbox is enabled : " + Enter_Your_Name.isEnabled() );
		     Enter_Your_Name.sendKeys(setData.getFirstName());
		   } 
		   else 
		   { 
		      System.out.println("Your Name Textbox is disabled : " +Enter_Your_Name.isEnabled()); 
		   } 
		
		
		Thread.sleep(2000);
		if(Enter_Subject.isEnabled()) 
		   { 
		     System.out.println("Subject Textbox is enabled : " + Enter_Subject.isEnabled() ); 
		     Enter_Subject.sendKeys(setData.getSubject());
		   } 
		   else 
		   { 
		      System.out.println("Subject Textbox is disabled : " +Enter_Subject.isEnabled()); 
		   } 
		
		
		Thread.sleep(2000);
		if(Enter_Comment.isEnabled()) 
		   { 
		     System.out.println("Comment Textbox is enabled : " + Enter_Comment.isEnabled() );
		     Enter_Comment.sendKeys(setData.getComment());
		   } 
		   else 
		   { 
		      System.out.println("Comment Textbox is disabled : " +Enter_Comment.isEnabled()); 
		   } 
		
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,50)");
		
		if(Click_Save.isEnabled()) 
		   { 
		     System.out.println("Save button is enabled : " + Click_Save.isEnabled() );
		     Thread.sleep(3000);
			 Click_Save.click();
		   } 
		   else 
		   { 
		      System.out.println("Save button is disabled : " +Click_Save.isEnabled()); 
		   }
	}
	
	public void Join_Our_Newsletter() throws InterruptedException, IOException {
		setData = new ConfigReader();
		Thread.sleep(3000);
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,550)");
		 
		Thread.sleep(2000);
		Join_Our_Newsletter.isDisplayed();
		
		Thread.sleep(2000);
		if(Enter_Email_Address.isEnabled()) 
		   { 
		     System.out.println("Enter email textbox is enabled : " + Enter_Email_Address.isEnabled() ); 
		     Enter_Email_Address.sendKeys(setData.getEmail());
		   } 
		   else 
		   { 
		      System.out.println("Enter email textbox is disabled : " +Enter_Email_Address.isEnabled()); 
		   } 
		
		
		Thread.sleep(2000);
		if(Click_Join.isEnabled()) 
		   { 
		     System.out.println("Join button is enabled : " + Click_Join.isEnabled() ); 
		     Click_Join.click();	
		   } 
		   else 
		   { 
		      System.out.println("Join button is disabled : " +Click_Join.isEnabled()); 
		   } 
	}
	
	public void Join_Our_Newsletter_OnPremiumContentPage() throws InterruptedException, IOException {
		setData = new ConfigReader();
		
		 Thread.sleep(3000);
		 Premium_Content.click();
		 Thread.sleep(3000);
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1600)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Next ›')]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,1900)");
		 Thread.sleep(2000);
		 Join_Our_Newsletter_OnPremiumContentPage.isDisplayed();
		
		Thread.sleep(2000);
		if(Enter_Email_Address__OnPremiumContentPage.isEnabled()) 
		   { 
		     System.out.println("Enter email textbox is enabled on premium content page : " + Enter_Email_Address__OnPremiumContentPage.isEnabled() ); 
		     Enter_Email_Address__OnPremiumContentPage.sendKeys(setData.getEmail());
		   } 
		   else 
		   { 
		      System.out.println("Enter email textbox is disabled on premium content page : " +Enter_Email_Address__OnPremiumContentPage.isEnabled()); 
		   } 
		
		Thread.sleep(2000);
		if(Click_Join__OnPremiumContentPage.isEnabled()) 
		   { 
		     System.out.println("Join button is enabled on premium content page : " + Click_Join__OnPremiumContentPage.isEnabled() ); 
		     Click_Join__OnPremiumContentPage.click();
		   } 
		   else 
		   { 
		      System.out.println("Join button is disabled on premium content page : " +Click_Join__OnPremiumContentPage.isEnabled()); 
		   } 
		
		driver.findElement(By.xpath("//img[@alt='Home']"));
	}
}
