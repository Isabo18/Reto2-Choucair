package com.magneto365.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.magneto365.com/choucair")
public class MagnetoPage extends PageObject {

    public static final Target BUTTON_LOGIN = Target.the("Select the enter button").located(By.xpath("//a[contains(text(), 'Ingresar')]"));
    public static final Target IMPUT_EMAIL = Target.the("Enter the mail in the item").located(By.id("emailSignIn"));
    public static final Target IMPUT_PASSWORD = Target.the("Enter password in the item").located(By.id("emailSignInConfirm"));
    public static final Target BUTTON_CONFIRM_LOGIN = Target.the("Click button confirm login").located(By.id("btnSubmitLogin"));
    public static final Target BUTTON_CLOSE = Target.the("Click button close").located(By.xpath("//button[@class='close']"));
}
