package cucumberReport;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/Destination" })
// @Cucumber.Options(format = { "pretty", "html:target/cucumber" })
// Specifying pretty as a format option ensure that HTML report will be
// generated.
// When we specify html:target/Destination - It will generate the HTML report
// inside the Destination folder, in the target folder of the maven project.

//@Cucumber.Options(format = { "json:target/Destination/cucumber.json" })
// When we specify json:target/Destination/cucumber.json - It will generate the
// JSON report inside the Destination folder, in the target folder of the maven
// project.

// -Dwebdriver.gecko.driver=C:\seleniumdrivers\geckodriver.exe needed as a run
// argument
public class runReportTest {
}
