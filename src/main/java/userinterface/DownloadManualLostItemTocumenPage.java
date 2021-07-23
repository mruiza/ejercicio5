package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DownloadManualLostItemTocumenPage extends PageObject {
    public static final Target SERVICES_BUTTON = Target.the("button that shows us options").
            located(By.xpath("//a[text()='SERVICIOS']"));
    public static final Target TRAVELER_INFORMATION_BUTTON = Target.the("button that shows us options traveler information").
            located(By.xpath("//a[text()='Información del Viajero']"));
    public static final Target LOST_ITEM_BUTTON = Target.the("button that shows us options traveler information").
            located(By.xpath("//a[text()='Información del Viajero']//following::li[8]//a"));
    public static final Target DOWNLOAD_POLITICS_BUTTON= Target.the("button that download the Lost Item Polices").
            located(By.xpath("//img[@alt='informacion del viajero']//following::img[1]"));
}
