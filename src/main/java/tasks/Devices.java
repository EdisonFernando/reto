package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.ChoucairJoin1Page;
import userinterface.ChoucairJoin2Page;
import userinterface.ChoucairJoin3Page;

public class Devices implements Task {
    private String pc;
    private String ver;
    private String lang;
    private String movil;
    private String model;
    private String os;

    public Devices(String pc, String version, String language, String movil, String model, String os){
        this.pc=pc;
        this.ver=version;
        this.lang=language;
        this.movil=movil;
        this.model=model;
        this.os=os;
    }

    public static Devices the(String pc, String version, String language, String movil, String model, String os) {
        return Tasks.instrumented(Devices.class,pc,version,language,movil,model,os);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //
        actor.attemptsTo(Click.on(ChoucairJoin3Page.I_MOVIL),
                //SelectFromOptions.byValue(movil).from(ChoucairJoin3Page.I_MOVIL)
                //Hit.the(Keys.ARROW_DOWN).keyIn(ChoucairJoin3Page.I_MOVIL)
                //Enter.theValue(movil).into(ChoucairJoin3Page.II_MOVIL),
                //Enter.theValue(fName).into(ChoucairJoin1Page.F_NAME),
                //Enter.theValue(lName).into(ChoucairJoin1Page.L_NAME),
                //Enter.theValue(emailA).into(ChoucairJoin1Page.E_MAIL),
                //MoveMouse.to(ChoucairJoin1Page.B_MONTH).andThen(actions -> actions.click()),
                //SelectFromOptions.byVisibleText(dD).from(ChoucairJoin1Page.B_MONTH),
                //SelectFromOptions.byValue(dM).from(ChoucairJoin1Page.B_MONTH),
                //Click.on(ChoucairJoin1Page.B_MONTH),
                //Enter.theValue(dM).into(ChoucairJoin1Page.B_MONTH),
                //SelectFromOptions.byValue(dD).from(ChoucairJoin1Page.B_DAY),
                //Click.on(ChoucairJoin1Page.B_DAY),
                //Enter.theValue(dD).into(ChoucairJoin1Page.B_DAY),
                //SelectFromOptions.byValue(dY).from(ChoucairJoin1Page.B_YEAR),
                //Click.on(ChoucairJoin1Page.B_YEAR),
                //Enter.theValue(dY).into(ChoucairJoin1Page.B_YEAR)
                Click.on(ChoucairJoin3Page.BUTTON_NEXT)
        );
    }
}
