package com.hellounit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/htmlunit"},glue= {"com.hellounit"},plugin= {"pretty"})
public class TestRunner {

}
