package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.CollegeTennisRecruitment;
import com.pc360.ttw.pages.Home;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class CollegeTennisRecruitment_Test extends BaseClass {

	CollegeTennisRecruitment ctr;
	Home home;
	
	@Test(dependsOnMethods= {"premiumContent"}, ignoreMissingDependencies= true)
	public void collegeTennisRecruitment() throws InterruptedException, IOException {
		ctr = new CollegeTennisRecruitment(driver);
		ctr.collegeTennisRecruitment();
		ctr.CollegeTennisRecruitmentPackage();
		
		home = new Home(driver);
		ctr.collegeTennisRecruitment();
		home.Tennis_Recruitment_Package();
		home.Join_Our_Newsletter();
		
		ctr.collegeTennisRecruitment();
		ctr.College_Tennis_Recruitment_Guide();
		home.Join_Our_Newsletter();
		
		ctr.collegeTennisRecruitment();
		ctr.nILCompliantAthleteWebpagePromotion();
		home.Join_Our_Newsletter();
		
		ctr.collegeTennisRecruitment();
		ctr.tournamentScheduler();
		home.Join_Our_Newsletter();
		
		ctr.collegeTennisRecruitment();
		ctr.collegeTennisProgramFinderTool();
		home.Tennis_Recruitment_Package();
		home.Join_Our_Newsletter();
	}
}
