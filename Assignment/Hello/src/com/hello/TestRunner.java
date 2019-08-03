package com.hello;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/hello"},glue= {"com.hello"},plugin= {"pretty"})
public class TestRunner {

}
