package com.demo.mobile.runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/controls.feature",
        glue = "com.demo.mobile.stepdefinitions",
        tags = "@controls",
        plugin = {"pretty"}
)
public class ControlsRunner {
}
