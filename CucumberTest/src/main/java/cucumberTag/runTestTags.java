package cucumberTag;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
//chose to run all including smoke test
//@Cucumber.Options(format = { "pretty", "html:target/cucumber" })
// chose to run with out the smoke test!
@Cucumber.Options(format={"pretty", "html:target/cucumber"},tags={"~@SmokeTest"}) 
public class runTestTags {

}