package com.demo.mobile.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/alerts.feature",
        glue = "com.demo.mobile.stepdefinitions",
        plugin = {"pretty"}
)
public class AlertsRunner {}
