package StepDefinitions.Others;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;


@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features/FeatureWithTags",
        publish = true,
        glue = "StepDefinitions/Others",
        tags = "@mustRun"
//                "(@smoke or @regression) and not @important"
)

public class TestRunnerWithSingleTags {


}
