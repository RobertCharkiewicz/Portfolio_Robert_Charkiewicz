import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//this class is a place wher JUnit connects to Cucumber
@RunWith(Cucumber.class)
// this prints logs in console in "prettty" manner and generates logs in HTML:
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})

//this tags are to be used to filter test to run:
//test with tag "@foo" will run, tests with tag "not @bar" will be ignored
//@CucumberOptions(tags = {"@foo", "not @bar"})
public class RunCucumberTest {
}
