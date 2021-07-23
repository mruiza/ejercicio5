package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.TocumenAirportPage;

public class Start implements Task {

    TocumenAirportPage tocumenAirportPage;

    public static Start toThePageTocumen() {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(tocumenAirportPage));
    }
}
