package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",glue="stepDefination",dryRun=false,
monochrome=true,tags="@smokeTest or @RegressionTest",plugin= {"pretty","html:target/cucumber.html",
		"json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests
{
	

}
