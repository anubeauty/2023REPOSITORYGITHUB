package org.h2k.openmrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage2 {
	
	 WebDriver driver;
		
	   
		@Given("^i enter the indeed.com address$")
		public void i_enter_the_indeed_com() throws Throwable {
		    //open indeed page
			    driver = new ChromeDriver();
				driver.get("http://www.indeed.com");
				
				
				
		}
		
		@When("^enter job type and job place$")
		public void enter_job_type_and_job_place() throws Throwable {
		    //enter required fields
			driver.findElement(By.xpath("//input[@id=\"text-input-what\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"text-input-what\"]")).sendKeys("work from home");
			driver.findElement(By.xpath("//input[@id=\"text-input-where\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"text-input-where\"]")).sendKeys("Burlington,MA");
		}
		
		@And("^click submit$")
		public void click_submit() throws Throwable {
		    //enter submit button
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			
		}
		
		@Then("^I should be redirected to the jobs available in the site$")
		public void I_should_be_redirected_to_the_jobs_available_in_the_site() throws Throwable {
		   //click submit
			System.out.println("THE CURRENT URL IS:    "+driver.getCurrentUrl());
			if(!driver.getCurrentUrl().equals("http://www.indeed.com")) {
				
				System.out.println("success");
			}
		}


}
