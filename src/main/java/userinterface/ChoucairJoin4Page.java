package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJoin4Page {
    public static final Target PASS=Target.the("input the password").located(By.id("password"));
    public static final Target PASSC=Target.the("confirm the password").located(By.id("confirmPassword"));
    public static final Target FINISH=Target.the("button for next step").located(
            By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"
            )
    );
}
