package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.ContactUs;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class ContactUs_Test extends BaseClass {

	@Test(dependsOnMethods= {"blogs"}, ignoreMissingDependencies= true)
	public void contactUs() throws InterruptedException, IOException {
		ContactUs con = new ContactUs(driver);
		con.Contact_Us();
		con.Get_in_touch();
		con.Join_Our_Newsletter();
	}
}
