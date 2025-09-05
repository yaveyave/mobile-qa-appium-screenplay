package com.demo.mobile.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demo.mobile.ui.ControlsUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterText implements Task {
    private final String text;

    public EnterText(String text){
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(text).into(ControlsUI.TEXT_FIELD));
    }

    public static EnterText intoField(String text){
        return instrumented(EnterText.class, text);
    }
}
