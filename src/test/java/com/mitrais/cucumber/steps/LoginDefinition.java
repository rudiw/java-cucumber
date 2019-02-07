package com.mitrais.cucumber.steps;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
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
	
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void doLogin(final String upUsername, final String upPassword) throws Throwable {
		//do login
		System.out.println(String.format("doLogin: username '%s' and password '%s'",
				upUsername, upPassword));
	}
	
	@Then("^Home page is populated$")
	public void populatedHomePage() throws Throwable {
		//home page validation
		System.out.println("populatedHomePage");
	}
	
	@And("^Cards displayed are \"([^\"]*)\"$")
	public void displayedCards(final String upDisplayed) throws Throwable {
		//validate cards
		System.out.println(String.format("displayedCards: %s", upDisplayed));
		
		System.out.println("");
	}
	
	@When("^User sign up with following details$")
	public void signUp(final DataTable upData) throws Throwable {
		final List<List<String>> raw = upData.raw();
		System.out.println(String.format("raw: %s", raw));
	}
	
	@When("^Users login into application with (.+) and (.+)$")
	public void doMultipleLogin(final String upUsername, final String upPassword) throws Throwable {
		System.out.println(String.format("doMultipleLogin: username '%s' and password '%s'",
				upUsername, upPassword));
	}
	
}
