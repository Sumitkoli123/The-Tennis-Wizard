package com.pc360.ttw.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.Home;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class Home_Test extends BaseClass {

	@Test(dependsOnMethods= {"launchApp"}, ignoreMissingDependencies= true)
	public void homePage() throws Exception {
		Home home = new Home(driver);
		home.LoginJoin();
		home.FreeSignUp();
		home.SubscribeBtn();
		home.FindExpertBtn();
		home.Tennis_Recruitment_Package();
		home.Join_Our_Newsletter();
	}
}
