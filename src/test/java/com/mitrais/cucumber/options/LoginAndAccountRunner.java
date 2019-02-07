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
		features = "src/test/java/com/mitrais/cucumber/features",
		glue = "com.mitrais.cucumber.steps",
		tags = "@SimpleLogin") // glue is package name!
public class LoginAndAccountRunner {

}
