package com.demo.mobile.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demo.mobile.ui.MainMenuUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;

public class NavigateTo implements Task {
    private final String option;
    public NavigateTo(String option){
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        String uiScrollables = "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector().text(\"" + option + "\"))";

        WebElement element = BrowseTheWeb.as(actor).getDriver()
                .findElement(MobileBy.AndroidUIAutomator(uiScrollables));

        element.click();
    }


    public static NavigateTo menu(String option){
        return instrumented(NavigateTo.class, option);
    }
}
