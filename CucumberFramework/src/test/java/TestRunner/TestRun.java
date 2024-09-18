package TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
			features="C://Users//Dell//git//BDD-framework//CucumberFramework//Feature//Shoppers.feature",
			glue="com.shoppersstck.stepDefination")
	public class TestRun {


}
