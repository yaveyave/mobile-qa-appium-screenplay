package com.demo.mobile.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.demo.mobile.questions.ElementState;
import com.demo.mobile.tasks.NavigateTo;
import com.demo.mobile.tasks.Toggle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ControlsStepDefs {
    @Managed(driver="Appium")
    WebDriver hisDevice;



    @When("marca el checkbox")
    public void marcaCheckbox(){
        CommonStepDefs.getOscar().attemptsTo(Toggle.checkbox());
    }

    @When("activa el switch")
    public void activaSwitch() {
        CommonStepDefs.getOscar().attemptsTo(Toggle.switchControl());
    }
    @Then("el checkbox deberia estar marcado")
    public void validarCheckbox(){
        CommonStepDefs.getOscar().should(seeThat(ElementState.checkboxIsChecked()));
    }

    @Then("el switch deberia estar activado")
    public void valdiarSwitch(){
        CommonStepDefs.getOscar().should(seeThat(ElementState.switchIsOn()));
    }

}
