package com.magneto365.automation.tasks;

import com.magneto365.automation.userinterfaces.MagnetoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MagnetoPage.BUTTON_LOGIN));
    }

    public static EnterLogin theEnterLogin(){
        return instrumented(EnterLogin.class);
    }
}
