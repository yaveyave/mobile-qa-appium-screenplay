package com.demo.mobile.stepdefinitions;

import com.demo.mobile.tasks.HandleAlert;
import com.demo.mobile.questions.ElementVisible;
import io.cucumber.java.en.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AlertsStepDefs {

    @When("acepta la alerta")
    public void aceptarAlerta() {
        CommonStepDefs.getOscar().attemptsTo(HandleAlert.accept());
    }

    @Then("deberia ver un texto que contiene {string}")
    public void deberia_ver_un_texto_que_contiene(String texto) {
        CommonStepDefs.getOscar().should(
                seeThat(ElementVisible.withPartialText(texto))
        );
    }

    @Then("deberia ver el texto en la alerta {string}")
    public void deberia_ver_el_texto_en_la_alerta(String texto) {
        CommonStepDefs.getOscar().should(
                seeThat(ElementVisible.withExactText(texto))
        );
    }

}
