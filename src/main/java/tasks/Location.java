package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.ChoucairJoin1Page;
import userinterface.ChoucairJoin2Page;

public class Location implements Task {
    private String city;
    private String pCode;
    private String country;

    public Location(String city, String getpCode, String country){
        this.city=city;
        this.pCode=getpCode;
        this.country=country;
    }
    public static Location the(String city, String getpCode, String country) {
        return Tasks.instrumented(Location.class,city,getpCode,country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(ChoucairJoin2Page.CITY),
                //MoveMouse.to(ChoucairJoin2Page.CITY).andThen(actions -> actions.click()),
                Hit.the(Keys.ARROW_DOWN).keyIn(ChoucairJoin2Page.CITY),
                MoveMouse.to(ChoucairJoin2Page.P_CODE).andThen(actions -> actions.click()),
                Enter.theValue(pCode).into(ChoucairJoin2Page.P_CODE),
                //MoveMouse.to(ChoucairJoin2Page.S_COUNTRY).andThen(actions -> actions.click()),
                //Enter.theValue(country).into(ChoucairJoin2Page.COUNTRY),
                Click.on(ChoucairJoin2Page.BUTTON_NEXT)
        );
    }
}
