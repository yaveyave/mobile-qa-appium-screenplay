package com.demo.mobile.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ControlsUI {
    public static final Target CHECKBOX = Target.the("Checkbox").located(By.id("io.appium.android.apis:id/check1"));
    public static final Target SWITCH = Target.the("Switch").located(By.id("io.appium.android.apis:id/toggle1"));
    public static final Target TEXT_FIELD = Target.the("campo de texto").located(By.id("io.appium.android.apis:id/edit"));
}
