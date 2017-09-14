package com.pack.home.TestExecution;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		if (extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ZenoExtentReport.html", true);
			extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
			extent
			.addSystemInfo("Host Name", "http://10.244.30.178:8080/YouthInc/frontend/web/youthinc-ui/s")
			.addSystemInfo("Environment", "DEMO")
			.addSystemInfo("Application", "Zeno");
		}
		return extent;
	}
}
