package com.demo.mobile.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewsUI {
    public static final Target CONTROLS_OPTION =
            Target.the("opcion Controls").located(By.id("android:id/text1"));

    public static final Target BUTTON_OPTION =
            Target.the("opcion Buttons").located(By.id("android:id/text1"));
}
