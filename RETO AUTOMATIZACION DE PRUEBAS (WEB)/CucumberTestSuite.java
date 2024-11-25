@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.demoblaze.automation.steps",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CucumberTestSuite extends SerenityRunner {}