package com.magneto365.automation.interactions;

import com.magneto365.automation.models.Data;
import com.magneto365.automation.userinterfaces.MagnetoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LoginUser implements Interaction {

    Data data;

    public LoginUser(Data data){this.data=data;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getEmail()).into(MagnetoPage.IMPUT_EMAIL),
                Enter.theValue(data.getPassword()).into(MagnetoPage.IMPUT_PASSWORD),
                Click.on(MagnetoPage.BUTTON_CONFIRM_LOGIN),
                Click.on(MagnetoPage.BUTTON_CLOSE)
        );
    }
    public static LoginUser theLoginUser(Data data){
        return instrumented(LoginUser.class, data);
    }
}
