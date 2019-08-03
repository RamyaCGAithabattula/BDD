package com.form;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/form"},glue= {"com.form"},plugin= {"pretty"})
public class TestRunner {

}
