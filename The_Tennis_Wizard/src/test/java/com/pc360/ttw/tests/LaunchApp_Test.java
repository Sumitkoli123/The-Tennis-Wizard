package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.LaunchApp;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class LaunchApp_Test extends BaseClass {

	@Test
	public void launchApp() throws IOException {
		LaunchApp launch = new LaunchApp(driver);
		launch.launchApp();
	}
}
