package com.demo.mobile.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;

public class CommonStepDefs {

    @Managed(driver = "Appium")
    WebDriver hisDevice;

    private static final Actor oscar = Actor.named("Oscar");

    @Given("que Oscar abre la app")
    public void abrirLaApp() {
        oscar.can(BrowseTheWeb.with(hisDevice));
    }

    public static Actor getOscar() {
        return oscar;
    }
}
