package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("****************************");
		System.out.println("Setup entries in Netbanking Database");
	}
	@After
	public void tearDown()
	{
		System.out.println("Clear the Entries");
	}
	@Before("@Mortgage")
	public void MortgageSetup()
	{
		System.out.println("****************************");
		System.out.println("Setup entries in Mortgage Database");
	}
	
	//@Before ->Background ->Scenario ->@After


}
