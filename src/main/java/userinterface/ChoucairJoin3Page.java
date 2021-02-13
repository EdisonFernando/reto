package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJoin3Page {
    public static final Target I_MOVIL=Target.the("select movil").located(
            By.xpath("//div[@class='row second']//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"
            )
    );
    public static final Target II_MOVIL=Target.the("select movil").located(
            By.xpath("//div[@class='row second']//div[@class='ui-select-box']//div[@name='handsetMakerId']"
            )
    );

    public static final Target BUTTON_NEXT=Target.the("button for next step").located(
            By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"
            )
    );
}
