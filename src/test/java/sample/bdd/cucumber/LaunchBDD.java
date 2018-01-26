package sample.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/",
		glue="sample.bdd.cucumber",
		tags = { "not @wip", "not @not-implemented", "@test" },
		//plugin = { "tzatziki.analysis.exec.gson.JsonEmitterReport:target/samplebdd", 
        //			"json:target/cucumber.json" },
		plugin = {"pretty", "html:target/cucumber"},
		strict = true
    )
public class LaunchBDD {

}
