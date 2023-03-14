package com.pc360.ttw.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	static ExtentReports report;
	static ExtentTest test;

	public static ExtentReports extentReportGenerator() {

		String path = System.getProperty("user.dir") + "\\Extent_Report\\Test_Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName(" The Tennis Wizard Automation Results");
		reporter.config().setDocumentTitle("The Tennis Wizard Results");
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester Name", "Sumit");
		report.setSystemInfo("WebApp Name", "The Tennis Wizard");
		report.setSystemInfo("WebApp Version", "Not Available");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser", "Chrome");
		return report;
	}

}
