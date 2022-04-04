package com.example.demo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "classpath:features", glue = "com.example.demo", tags = "@navigation", plugin = {"pretty", "html:target/cucumber-reports/index.html", "junit:target/cucumber-reports/cucumber.xml", "json:target/cucumber-reports/cucumber.json"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
