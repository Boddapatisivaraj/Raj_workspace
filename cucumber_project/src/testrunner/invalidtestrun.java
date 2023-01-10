package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resource//invalidlogin.feature",glue="stepdefination",dryRun=false,monochrome=true)
public class invalidtestrun {
	

}
