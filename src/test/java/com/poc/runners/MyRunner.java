package com.poc.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "html:target/defaultReport"},
        glue = "com/poc/stepDefinitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@wip"
)
public class MyRunner {
}
