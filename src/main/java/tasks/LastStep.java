package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairJoin1Page;
import userinterface.ChoucairJoin4Page;

public class LastStep implements Task {
    private final String pass;
    private final String cpass;

    public LastStep(String password, String getcPassword){
        this.pass=password;
        this.cpass=getcPassword;
    }
    public static LastStep the(String password, String getcPassword) {
        return Tasks.instrumented(LastStep.class,password,getcPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(pass).into(ChoucairJoin4Page.PASS),
                Enter.theValue(cpass).into(ChoucairJoin4Page.PASSC),
                Click.on(ChoucairJoin4Page.FINISH));
    }
}
