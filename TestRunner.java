package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "//Users//yogashivamathivanan//eclipse-workspaceTest//Aspiration//src//test//resources//Features", 
glue={"StepDefinations"}, 
monochrome = true, 
plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"},
tags = "@spend&save")

public class TestRunner {

}
