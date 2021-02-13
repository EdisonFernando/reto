package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJoin1Page {
    public static final Target BUTTON_JOIN=Target.the("button for join today").located(
            By.xpath("//unauthenticated-header//a[@class='unauthenticated-nav-bar__sign-up']"
            )
    );
    public static final Target F_NAME=Target.the("first name").located(By.id("firstName"));
    public static final Target L_NAME=Target.the("last name").located(By.id("lastName"));
    public static final Target E_MAIL=Target.the("email").located(By.id("email"));
    public static final Target B_MONTH=Target.the("month").located(By.id("birthMonth"));
    public static final Target B_DAY=Target.the("day").located(By.id("birthDay"));
    public static final Target B_YEAR=Target.the("year").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT=Target.the("button for next step").located(
            By.xpath("//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"
            )
    );
}
