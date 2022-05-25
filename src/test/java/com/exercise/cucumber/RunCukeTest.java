package com.exercise.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        monochrome = true,
        tags = "@test",
        features = "src/test/resources/features",
        glue = {"com.exercise.cucumber",
                "com.exercise.steps",
                "com.exercise.stepdefinitions",

        })
public class RunCukeTest {
}
