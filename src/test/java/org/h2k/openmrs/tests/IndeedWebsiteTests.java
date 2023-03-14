package org.h2k.openmrs.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Login2.feature",glue="org.h2k.openmrs")
public class IndeedWebsiteTests {

}
