package tasks;

import interactions.GoToTheWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterface.DownloadManualLostItemTocumenPage.*;

public class GoToTheOption implements Task {

    public static GoToTheOption lostItem() {
        return Tasks.instrumented(GoToTheOption.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SERVICES_BUTTON),
                Click.on(TRAVELER_INFORMATION_BUTTON),
                Click.on(LOST_ITEM_BUTTON),
                Click.on(DOWNLOAD_POLITICS_BUTTON),
                GoToTheWindow.number()
        );
    }
}
