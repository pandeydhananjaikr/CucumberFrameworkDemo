package StepDefinitions.others;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/GoogleSearch.feature",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HTMLReports/report.html"}
)
public class TestRunner {

}
