package runner_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = {"step_definitions"},
        monochrome = true,
        plugin ={"pretty",
                "json:target/HtmlReports.json"
        },
        tags = "@smoketest"
)

public class TestRunner {
}
