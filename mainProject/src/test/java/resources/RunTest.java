package resources;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources", tags = { "@start" }, glue = { "VKTest", "mailTest" })
public class RunTest {
}
