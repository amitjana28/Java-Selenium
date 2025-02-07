package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions (
	features = "src/test/java/features",
	glue = {"util","stepDefinition"},
	plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {

}
