package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\features", glue="\\stepDefination", 
stepNotifications = false, tags = "@HomePage_003",
plugin= {"pretty", "html:target/cucumber.html", "json:json/cucumber.json"},publish=true)

public class TestRunner {

}
