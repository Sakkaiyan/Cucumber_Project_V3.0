package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksMethod extends Base_Class {
	

	@Before
	public void beforeHooks(Scenario scenario) {

		String name = scenario.getName();
		System.out.println("SCENARIO NAME :" + name);

	}

	@After
	public void afterHooks(Scenario scenario) {

		if (scenario.isFailed()) {
			TakesScreenshot takescreenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = takescreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "isfailed");
		} else {
			String name = scenario.getName();
			System.out.println("SCENARIO NAME :" + name);
			TakesScreenshot takescreenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = takescreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "ispassed");
		}

	}

}
