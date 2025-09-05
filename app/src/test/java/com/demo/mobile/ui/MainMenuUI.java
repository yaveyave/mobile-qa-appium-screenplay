package com.demo.mobile.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MainMenuUI {
    public static final Target MENU_OPTION =
            Target.the("opcion de menu")
                    .locatedBy("//*[@resource-id='android:id/text1' and @text='{0}']");
}
