package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Feature" }, glue = { "com.stepdefinition" }, monochrome = true,plugin= {"html:src\\test\\resources\\Reports\\HtmlReport",
"json:src\\test\\resources\\Reports\\JsonReport\\jsonreports.json","junit:src\\test\\resources\\Reports\\XmlReports\\report.xml"
})
public class TestRunnerClass {
}

