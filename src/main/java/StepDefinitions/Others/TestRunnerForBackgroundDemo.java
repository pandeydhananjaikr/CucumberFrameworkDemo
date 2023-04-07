package StepDefinitions.Others;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
        glue = "StepForBackground",
        monochrome = true,
        plugin = {"pretty", "html:target/HTMLReports/report.html"},
        publish = true
)
public class TestRunnerForBackgroundDemo {
}
