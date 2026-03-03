package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Hp\\eclipse-workspace\\Cucumber_Project\\src\\test\\resources\\com.feature",
glue= {"com.stepdefination","com.hooks"},

monochrome = true,
publish = true,
plugin = {"html:HtmlReports/Nakuri.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		
public class Runner_Class {

}