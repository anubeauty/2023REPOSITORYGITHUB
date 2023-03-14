package org.h2k.openmrs.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Login.feature",glue="org.h2k.openmrs.pages")
public class LoginTests {
	
	
	

}
