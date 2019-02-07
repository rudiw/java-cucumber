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
		features = "src/test/java/com/mitrais/cucumber/features/LoginHook.feature",
		glue = "com.mitrais.cucumber.steps",
		tags ="@SimpleLoginInMobile, @SimpleLoginInWeb") // glue is package name!
public class LoginHookRunner {

}
