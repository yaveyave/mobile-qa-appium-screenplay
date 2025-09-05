package com.demo.mobile.stepdefinitions;

import com.demo.mobile.questions.ElementVisible;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SmokeStepDefs {

    @Managed(driver = "Appium")
    WebDriver hisDevice;


     @Then("deberia ver el texto exacto {string}")
    public void validarTexto(String texto) {
        CommonStepDefs.getOscar().should(seeThat(ElementVisible.withExactText(texto)));
    }
}
