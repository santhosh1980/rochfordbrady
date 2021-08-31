package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue= "StepDefinition4", tags= {"@addTariffplantoCustomerMultiple"}

/*dryRun = false,
monochrome = true,
plugin={"html:target/cucumber-html-report", "json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"}*/
)
public class Runner {

}
