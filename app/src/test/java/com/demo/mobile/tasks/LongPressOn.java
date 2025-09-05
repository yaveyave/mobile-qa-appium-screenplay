package com.demo.mobile.tasks;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.time.Duration;

public class LongPressOn implements Task {
    private final String text;

    public LongPressOn(String text) {
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver driver = (AndroidDriver) net.serenitybdd.screenplay.abilities.BrowseTheWeb.as(actor).getDriver();
        WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + text + "\")"));
        new TouchAction<>(driver)
                .longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(element))
                        .withDuration(Duration.ofSeconds(2)))
                .release()
                .perform();
    }

    public static LongPressOn elementWithText(String text) {
        return instrumented(LongPressOn.class, text);
    }
}
