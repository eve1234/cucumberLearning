package main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//specifying information to your test engine so it can
//take this info and start your test
@CucumberOptions(
		//all the features are in the Festures folder
		features = "Features",
		glue = "test"
		
		)
public class CucumberRunner {

}
