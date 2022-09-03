
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions
        (
                monochrome = true,
                features={"./src/test/java/featuerFiles/GoogleUiSuite.feature"},
                glue={"stepDefinitions","Hooks"},
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
                tags = "@Run"

        )
public class TestRunner extends AbstractTestNGCucumberTests {




}
