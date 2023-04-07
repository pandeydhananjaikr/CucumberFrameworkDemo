package StepDefinitions.Others;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features/HooksDemo/HooksDemo.feature",
        glue = "StepsForHooks",
        monochrome = true,
        plugin = {"pretty", "html:target/HTMLReports/report.html"},
        publish = true
)
public class TestRunnerForHooks {
}
