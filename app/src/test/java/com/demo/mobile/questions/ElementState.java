package com.demo.mobile.questions;

import com.demo.mobile.ui.ControlsUI;
import net.serenitybdd.screenplay.Question;

public class ElementState {

    public static Question<Boolean> checkboxIsChecked(){
        return actor -> {
            String value = ControlsUI.CHECKBOX.resolveFor(actor).getAttribute("checked");
            return Boolean.parseBoolean(value);
        };
    }

    public static Question<Boolean> switchIsOn(){
        return actor -> {
            String value = ControlsUI.SWITCH.resolveFor(actor).getAttribute("checked");
            return Boolean.parseBoolean(value);
        };
    }
}
