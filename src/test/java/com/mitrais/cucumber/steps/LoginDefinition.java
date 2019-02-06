package com.mitrais.cucumber.steps;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

/**
 * @author Rudi_W144
 *
 */
@RunWith(Cucumber.class)
public class LoginDefinition {
	
	@Given("^User is on NetBanking landing page$")
	public void onLandingPage() throws Throwable {
		//navigate to login page / url
		System.out.println("onLandingPage");
	}
	
	@When("^User login into application with username and password$")
	public void doLogin() throws Throwable {
		//do login
		System.out.println("doLogin");
	}
	
	@Then("^Home page is populated$")
	public void populatedHomePage() throws Throwable {
		//home page validation
		System.out.println("populatedHomePage");
	}
	
	@And("^Cards are displayed$")
	public void displayedCards() throws Throwable {
		//validate cards
		System.out.println("displayedCards");
	}

}
