package com.demo.mobile.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demo.mobile.ui.ControlsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Toggle implements Task {
    private final String type;

    public Toggle(String type) {
        this.type = type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if ("checkbox".equals(type)) {
            actor.attemptsTo(Click.on(ControlsUI.CHECKBOX));
        } else if ("switch".equals(type)) {
            actor.attemptsTo(Click.on(ControlsUI.SWITCH));
        }
    }

    public static Toggle checkbox() {
        return instrumented(Toggle.class, "checkbox");
    }

    public static Toggle switchControl() {
        return instrumented(Toggle.class, "switch");
    }
}
