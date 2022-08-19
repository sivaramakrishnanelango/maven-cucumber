package org.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",monochrome=true,dryRun=false,tags= {"@automation"},snippets= SnippetType.CAMELCASE,plugin= {"html:target","junit:junitreport\\junitreport.xml"
		,"json:jsonreport\\report2.json","rerun:src/test/resources\\failed.txt"})


public class Testrunner {
	
	@AfterClass
	public static void tc100() {
		jvmreport.reportGeneration("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\MavenCucumber\\jsonreport\\report.json");

	}
	
	

}
