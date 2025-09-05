package com.demo.mobile.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.Actor;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

public class ElementVisible implements Question<Boolean> {
    //private final String text;
    private final By locator;


    /*public ElementVisible(String text) {
        this.text = text;
    }*/

    public ElementVisible(By locator){
        this.locator = locator;
    }

   /* @Override
    public Boolean answeredBy(Actor actor) {
        Target element = Target.the("elemento con texto " + text)
                //.located(By.xpath("//android.widget.TextView[@text='" + text + "']"));
                .located(By.id("io.appium.android.apis:id/text1"));
        return element.resolveFor(actor).isVisible();
    }*/

    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor)
                .getDriver()
                .findElement(locator)
                .isDisplayed();
    }

    public static ElementVisible withExactText(String text){
        return new ElementVisible(By.xpath("//*[@text='" + text + "']"));
    }

    public static ElementVisible withPartialText(String text) {
        return new ElementVisible(By.xpath("//*[contains(@text,'" + text + "')]"));
    }

    public static ElementVisible withId(String id){
        return new ElementVisible(By.id(id));
    }

}
