package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resource//Scenario.feature",glue="stepdefination",dryRun=true)
public class Scenario {

}
