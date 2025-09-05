package com.demo.mobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HandleAlert implements Task {
    private final String action;

    public HandleAlert(String action) {
        this.action = action;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (action.equals("accept")) {
            actor.attemptsTo(Click.on(By.id("android:id/button1")));
        } else if (action.equals("cancel")) {
            actor.attemptsTo(Click.on(By.id("android:id/button2")));
        }
    }

    public static HandleAlert accept() {
        return instrumented(HandleAlert.class, "accept");
    }

    public static HandleAlert cancel() {
        return instrumented(HandleAlert.class, "cancel");
    }
}
