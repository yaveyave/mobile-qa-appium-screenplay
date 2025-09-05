package com.demo.mobile.stepdefinitions;


import com.demo.mobile.questions.ElementVisible;
import com.demo.mobile.tasks.NavigateTo;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NavigationStepDefs {
    @Managed(driver = "Appium")
    WebDriver hisDevice;


    @When("navega a la opcion {string}")
    public void navegaAOpcion(String opcion) {
        CommonStepDefs.getOscar().attemptsTo(NavigateTo.menu(opcion));
    }

    @Then("deberia ver un texto parcial {string}")
    public void validarTexto(String texto) {
        CommonStepDefs.getOscar().should(seeThat(ElementVisible.withPartialText(texto)));
    }
}
