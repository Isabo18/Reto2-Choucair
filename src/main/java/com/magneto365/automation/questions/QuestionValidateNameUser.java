package com.magneto365.automation.questions;

import com.magneto365.automation.models.Data;
import com.magneto365.automation.userinterfaces.MagnetProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class QuestionValidateNameUser implements Question {

    private Data data;
    public QuestionValidateNameUser(Data data){
        this.data= data;
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Ensure.that(MagnetProfilePage.NAME_USER).text().isEqualTo(data.getNameUser()));
        System.out.println("El nombre en el portal es:    "+MagnetProfilePage.NAME_USER.resolveFor(actor).getText());
        System.out.println("El nombre que debe aparecer en el portal es:   "+data.getNameUser());
        return true;
    }
    public static QuestionValidateNameUser questionValidateNameUser(Data data){
        return new QuestionValidateNameUser(data);
    }
}
