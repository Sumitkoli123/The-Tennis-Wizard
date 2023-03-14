package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.ExpertsConsultation;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class ExpertsConsultation_Test extends BaseClass {

	@Test(dependsOnMethods= {"collegeTennisRecruitment"}, ignoreMissingDependencies= true)
	public void expertsConsultation() throws InterruptedException, IOException {
		ExpertsConsultation ec = new ExpertsConsultation(driver);
		ec.Experts_Consultation();
		ec.Search_by_consultants_name();
		ec.ViewProfile();
		ec.ContactMe();
		ec.bookServices();
	}
}
