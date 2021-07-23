package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WhereFindCodeReservationPage extends PageObject {
    public static final Target MY_TRAVELS_BUTTON = Target.the("button that shows us the search travel page").
            located(By.xpath("//li[@id='lnk-Mis viajes']"));
    public static final Target WHERE_TO_FIND_THE_TRIP_DATA_LINK = Target.the("link that shows us where to find the reservation code").
            located(By.xpath("//a[@id='undefined-dialog-open']"));
    public static final Target  COGE_RESERVATION_LABEL = Target.the("label the reservation code").
            located(By.xpath("//span[text()='Código de reserva']//following::span[1]"));
}
