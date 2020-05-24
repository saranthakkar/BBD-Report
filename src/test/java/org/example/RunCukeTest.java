package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resource/Homepage.feature", tags = {"@smoke"},
plugin = {"html:target/cucumber-html-report",                   //HTML report
            "json:target/cucumber-json-report.json",            //JSON report
            "junit:target/cucumber-xml-report.xml",              //XML report
            "pretty:target/cucumber-pretty-report.txt"            //PRETTY report

}// plugin curly bracket ends here

)//feature bracket ends here
public class RunCukeTest {
}
//Saran thakkar 