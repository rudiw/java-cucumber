package com.mitrais.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author Rudi_W144
 *
 */
public class Hooks {
	
	/* MOBILE */
	@Before(value = "@SimpleLoginInMobile")
	public void beforeValidationInMobile() {
		System.out.println(String.format("Mobile BEFORE hook"));
	}
	
	@After(value = "@SimpleLoginInMobile")
	public void afterValidationInMobile() {
		System.out.println(String.format("Mobile AFTER hook"));
		
		System.out.println(String.format("=========="));
	}
	
	/* WEB */
	@Before(value = "@SimpleLoginInWeb")
	public void beforeValidationInWeb() {
		System.out.println(String.format("Web BEFORE hook"));
	}
	
	@After(value = "@SimpleLoginInWeb")
	public void afterValidationInWeb() {
		System.out.println(String.format("Web AFTER hook"));
		
		System.out.println(String.format("=========="));
	}
	
}
