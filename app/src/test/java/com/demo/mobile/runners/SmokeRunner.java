package com.demo.mobile.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/smoke.feature",
        glue = "com.demo.mobile.stepdefinitions",
        tags = "@smoke",
        plugin = {"pretty"}
)
public class SmokeRunner {}
