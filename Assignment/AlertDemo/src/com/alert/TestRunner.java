package com.alert;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/alert"},glue= {"com.alert"},plugin= {"pretty"})
public class TestRunner {

}
