package org.h2k.openmrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class LoginPage{ 
	
	
	  WebDriver driver;
	
   
	@Given("^I am a social networking site user$")
	public void i_am_a_social_networking_site_user() throws Throwable {
	    //open indeed page
		    driver = new ChromeDriver();
			driver.get("http://www.indeed.com");
			
			
			
	}
	
	@When("^I enter user name as username1$")
	public void i_enter_user_name_as_username1() throws Throwable {
	    //enter required fields
		driver.findElement(By.xpath("//input[@id=\"text-input-what\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"text-input-what\"]")).sendKeys("work from home");
		driver.findElement(By.xpath("//input[@id=\"text-input-where\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"text-input-where\"]")).sendKeys("Burlington,MA");
	}
	
	@And("^I enter password as password1$")
	public void i_enter_password_as_password1() throws Throwable {
	    //enter submit button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		
	}
	
	@Then("^I should be redirected to the home page of the site$")
	public void i_should_be_redirected_to_the_home_page_of_the_site() throws Throwable {
	   //click submit
		System.out.println("THE CURRENT URL IS:    "+driver.getCurrentUrl());
		if(!driver.getCurrentUrl().equals("http://www.indeed.com")) {
			
			System.out.println("success");
		}
	}

}
