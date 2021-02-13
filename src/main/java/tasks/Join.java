package tasks;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import userinterface.ChoucairJoin1Page;

public class Join implements Task {
    private String fName;
    private String lName;
    private String emailA;
    private String dM;
    private String dD;
    private String dY;

    public Join(String fName, String lName, String emailA, String dM, String dD, String dY){
        this.fName = fName;
        this.lName = lName;
        this.emailA = emailA;
        this.dM = "number:"+dM;
        this.dD = "number:"+dD;
        this.dY = "number:"+dY;
    }

    public static Join onThePage(String fName, String lName, String emailA, String dM, String dD, String dY) {
        return Tasks.instrumented(Join.class,fName,lName,emailA,dM,dD,dY);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairJoin1Page.BUTTON_JOIN),
                Enter.theValue(fName).into(ChoucairJoin1Page.F_NAME),
                Enter.theValue(lName).into(ChoucairJoin1Page.L_NAME),
                Enter.theValue(emailA).into(ChoucairJoin1Page.E_MAIL),
                //MoveMouse.to(ChoucairJoin1Page.B_MONTH).andThen(actions -> actions.click()),
                //SelectFromOptions.byVisibleText(dD).from(ChoucairJoin1Page.B_MONTH),
                SelectFromOptions.byValue(dM).from(ChoucairJoin1Page.B_MONTH),
                //Click.on(ChoucairJoin1Page.B_MONTH),
                //Enter.theValue(dM).into(ChoucairJoin1Page.B_MONTH),
                SelectFromOptions.byValue(dD).from(ChoucairJoin1Page.B_DAY),
                //Click.on(ChoucairJoin1Page.B_DAY),
                //Enter.theValue(dD).into(ChoucairJoin1Page.B_DAY),
                SelectFromOptions.byValue(dY).from(ChoucairJoin1Page.B_YEAR),
                //Click.on(ChoucairJoin1Page.B_YEAR),
                //Enter.theValue(dY).into(ChoucairJoin1Page.B_YEAR)
                Click.on(ChoucairJoin1Page.BUTTON_NEXT)
        );
    }
}
