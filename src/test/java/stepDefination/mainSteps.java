package stepDefination;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps
{
	@Given("User is on Netbanking Landing Page")
	public void user_is_on_netbanking_landing_page() 
	{
	    System.out.println("User landed on NetBanking Page");
	}
	@Given("User is on Practice landing Page")
	public void user_is_on_practice_landing_page()
	{
	    System.out.println("User is on Practice landing Page");
	    
	}
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data)
	{
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) 
	{
		System.out.println(username+" and password is "+password);
	   
	}
	@Then("Home Page is Displyed")
	public void home_page_is_displyed()
	{
	   System.out.println("Home Page is Displyed");
	}
	@Then("Cards are displyed")
	public void cards_are_displyed()
	{
	    System.out.println("Cards are Displyed");
	}
	
	@Given("setup entries in database")
	public void setup_entries_in_database() 
	{
	    System.out.println("*************");
	    System.out.println("setup entries in database");
	}
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() 
	{
	   System.out.println("launch the browser from config variables");
	}
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site()
	{
	   System.out.println("hit the home page url of banking site");   
	}

}
