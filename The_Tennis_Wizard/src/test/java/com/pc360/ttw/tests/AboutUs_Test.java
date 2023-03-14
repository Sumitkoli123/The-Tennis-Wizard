package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.AboutUs;
@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class AboutUs_Test extends BaseClass {

	@Test(dependsOnMethods= {"expertsConsultation"}, ignoreMissingDependencies= true)
	public void aboutUs() throws InterruptedException, IOException {
		AboutUs about = new AboutUs(driver);
		about.About_US();
		about.Join_Our_Newsletter();
	}
}
