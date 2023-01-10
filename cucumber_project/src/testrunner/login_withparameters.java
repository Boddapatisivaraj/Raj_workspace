package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resource\\Login_withparameters.feature",glue="stepdefination",dryRun=true,monochrome=true)
public class login_withparameters{

}