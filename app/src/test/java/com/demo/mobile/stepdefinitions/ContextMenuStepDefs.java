package com.demo.mobile.stepdefinitions;

import com.demo.mobile.tasks.LongPressOn;
import com.demo.mobile.questions.ElementVisible;
import io.cucumber.java.en.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ContextMenuStepDefs {

    @When("mantiene presionado sobre {string}")
    public void longPressOnElement(String texto) {
        CommonStepDefs.getOscar().attemptsTo(LongPressOn.elementWithText(texto));
    }

    @Then("deberia ver el texto en el menu contextual {string}")
    public void validarTexto(String texto) {
        CommonStepDefs.getOscar().should(seeThat(ElementVisible.withPartialText(texto)));
    }
}
