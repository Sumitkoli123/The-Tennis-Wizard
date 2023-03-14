package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.PremiumContent;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class PremiumContent_Test extends BaseClass {

	@Test(dependsOnMethods= {"homePage"}, ignoreMissingDependencies= true)
	public void premiumContent() throws InterruptedException, IOException {
		PremiumContent content = new PremiumContent(driver);
		content.Premium_Content();
		content.PopularPost();
		content.PageHeading();
		content.This_Article_Useful();
	    content.Add_new_comment();
		content.Join_Our_Newsletter();
		content.Join_Our_Newsletter_OnPremiumContentPage();
	}
}
