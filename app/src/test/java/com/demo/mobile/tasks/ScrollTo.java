package com.demo.mobile.tasks;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollTo implements Task {
    private final String itemText;

    public ScrollTo(String itemText) {
        this.itemText = itemText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String uiScrollables = "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector().text(\"" + itemText + "\"))";

        WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(uiScrollables));

        if (element == null || !element.isDisplayed()) {
            throw new AssertionError("No se encontró el elemento con texto: " + itemText);
        }
    }

    public static ScrollTo item(String text) {
        return instrumented(ScrollTo.class, text);
    }
}
