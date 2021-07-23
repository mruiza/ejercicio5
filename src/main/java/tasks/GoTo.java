package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.WhereFindCodeReservationPage;

import static userinterface.WhereFindCodeReservationPage.*;

public class GoTo implements Task {

    public static GoTo theLinkDondeEncontrarDatosDelViaje() {
        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MY_TRAVELS_BUTTON),
                Click.on(WHERE_TO_FIND_THE_TRIP_DATA_LINK),
                Scroll.to(COGE_RESERVATION_LABEL)
                );
    }
}
