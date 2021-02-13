package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJoin2Page {
    /*public static final Target BUTTON_JOIN=Target.the("button for join today").located(
            By.xpath("//unauthenticated-header//a[@class='unauthenticated-nav-bar__sign-up']"
            )
    );*/
    public static final Target CITY=Target.the("city of residence").located(By.id("city"));
    public static final Target P_CODE=Target.the("post code").located(By.id("zip"));
    public static final Target COUNTRY=Target.the("country").located(By.id("focusser-2"));
    public static final Target S_COUNTRY=Target.the("select country").located(
            By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']"
            )
    );

    public static final Target BUTTON_NEXT=Target.the("button for next step").located(
            By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"
            )
    );
}
