package com.pc360.ttw.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollegeTennisRecruitment {

	private WebDriver driver;
	JavascriptExecutor js;
	
	@FindBy(xpath = "//a[normalize-space()='College Tennis Recruitment Package']")
	private WebElement College_Tennis_Recruitment_Package;
	
	@FindBy(xpath = "//a[normalize-space()='College Tennis Recruitment Guide']")
	private WebElement College_Tennis_Recruitment_Guide;
	
	@FindBy(xpath="//a[normalize-space()='Join For Free']")
	private WebElement JoinForFree;
	
	@FindBy(xpath="//a[normalize-space()='Join Pro']")
	private WebElement JoinPro;
	
	@FindBy(xpath="//a[normalize-space()='Join Pro Plus']")
	private WebElement JoinProPlus;
	
	@FindBy(xpath="//a[normalize-space()='NIL Compliant Athlete Webpage & Promotion']")
	private WebElement nIL_Compliant_Athlete_Webpage_Promotion;
	
	@FindBy(xpath = "//a[normalize-space()='Tournament Scheduler']")
	private WebElement Tournament_Scheduler;
	
	@FindBy(xpath = "//a[normalize-space()='College Tennis Program Finder Tool']")
	private WebElement College_Tennis_Program_Finder_Tool;
	
	
	public CollegeTennisRecruitment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void collegeTennisRecruitment() throws InterruptedException {
		Thread.sleep(3000);
		//Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//a[normalize-space()='College Tennis Recruitment']"));
    	//Mouse hover menuOption 
    	actions.moveToElement(menuOption).perform();
		System.out.println("========== Testing Page : College Tennis Recruitment ==========");
		
	}
	
	public void CollegeTennisRecruitmentPackage() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("College Tennis Recruitment Package link is enable : " + College_Tennis_Recruitment_Package.isEnabled());
		College_Tennis_Recruitment_Package.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}
	
	public void College_Tennis_Recruitment_Guide() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("College Tennis Recruitment Guide link is enabled : " + College_Tennis_Recruitment_Guide.isEnabled());
		College_Tennis_Recruitment_Guide.click();
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		
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
	
	public void nILCompliantAthleteWebpagePromotion() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("NIL Compliant Athlete Webpage and Promotion link is enable : " + nIL_Compliant_Athlete_Webpage_Promotion.isEnabled());
		nIL_Compliant_Athlete_Webpage_Promotion.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
	}
	
	public void tournamentScheduler() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Tournament Scheduler link is enable : "+ Tournament_Scheduler.isEnabled());
		Tournament_Scheduler.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
	}
	
	public void collegeTennisProgramFinderTool() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("College Tennis Program Finder Tool link is enable : "+ College_Tennis_Program_Finder_Tool.isEnabled());
		College_Tennis_Program_Finder_Tool.click();
	}	
}
		