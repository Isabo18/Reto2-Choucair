package com.magneto365.automation.tasks;

import com.magneto365.automation.interactions.LoginUser;
import com.magneto365.automation.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EnterWithUser implements Task {

    Data data;

    public EnterWithUser (Data data){
        this.data= data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginUser.theLoginUser(data));
    }

    public static EnterWithUser theLoginUser(Data data){
        return instrumented(EnterWithUser.class, data);
    }
}
