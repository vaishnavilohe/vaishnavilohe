package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","json:cucumber/target.json"},
features ="Feature",glue = {"stepDefination"},tags="@tag56")

public class DemoTestRunner {

}
