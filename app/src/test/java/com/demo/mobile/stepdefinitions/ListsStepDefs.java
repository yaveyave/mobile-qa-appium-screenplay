package com.demo.mobile.stepdefinitions;

import com.demo.mobile.tasks.ScrollTo;
import com.demo.mobile.questions.ElementVisible;
import io.cucumber.java.en.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ListsStepDefs {

    @When("hace scroll hasta el item {string}")
    public void haceScroll(String item) {
        CommonStepDefs.getOscar().attemptsTo(ScrollTo.item(item));
    }

    @Then("deberia ver el item exacto {string}")
    public void deberiaVerTextoExacto(String texto) {
        CommonStepDefs.getOscar().should(seeThat(ElementVisible.withExactText(texto)));
    }
}
