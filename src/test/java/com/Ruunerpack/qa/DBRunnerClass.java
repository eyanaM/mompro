package com.Ruunerpack.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utilitypack.qa.DBBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resource/Features"},
plugin= {"json:target/json.cucumber"},
glue= "com.StepDeffpack.qa",tags= {"@test"})

public class DBRunnerClass extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void startURL() {
		
		DBBaseClass test= new DBBaseClass();
		test.initBrowser();
	}
	@AfterTest
	public void closedURL() {
		DBBaseClass test= new DBBaseClass();
			test.driver.quit();
		
	}
}
