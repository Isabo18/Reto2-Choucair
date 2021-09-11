package com.magneto365.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MagnetProfilePage extends PageObject {

    public static final Target NAME_USER = Target.the("Validate name user").located(By.xpath("//span[contains(text(), 'Isabo')]"));
}
