package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions( plugin = {"pretty" ,
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "junit:target/hc-cucumber.xml",
        "rerun:target/hc-rerun.txt"},

        features = {"src/test/resources/features/smokeTestScenarios.feature"},
        monochrome = true,
        glue = {"steps"},
        tags = {"@run"})
@RunWith(Cucumber.class)
public class  Runner {

}

  
   
