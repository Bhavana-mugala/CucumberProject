package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/AdminSignIn.feature" }, glue = {
		"stepDefinition" }, monochrome = true, plugin = { "pretty", "html:target/HTMLReports/report.html" }

)
public class AdminSignInTest {

}
