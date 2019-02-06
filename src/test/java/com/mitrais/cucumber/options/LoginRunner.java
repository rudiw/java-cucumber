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
//		features = "src/test/java/com/mitrais/cucumber/features",
		features = "src/test/java/com/mitrais/cucumber/features/Login.feature",
		glue = "com.mitrais.cucumber.steps") // glue is package name!
//		glue = "com.mitrais.cucumber.steps.LoginDefinition")
public class LoginRunner {

}
