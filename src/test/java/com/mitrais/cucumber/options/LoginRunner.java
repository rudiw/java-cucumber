package com.mitrais.cucumber.options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Rudi_W144
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/mitrais/cucumber/features/Login.feature",
		glue = "com.mitrais.cucumber.steps",// glue is package name!
		plugin = {"pretty",
				"html:target/cucumber/login",
				"json:target/cucumber/login/login.json",
				"junit:target/cucumber/login/login.xml"},
		dryRun = true,
		monochrome = true,
		strict = true
		) 
public class LoginRunner {

}
