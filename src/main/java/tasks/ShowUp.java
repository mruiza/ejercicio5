package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.LatamAirlinesPage;

public class ShowUp implements Task {

    LatamAirlinesPage latamAirlinesPage;

    public static ShowUp thePageLatamAirlines() {
        return Tasks.instrumented(ShowUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(latamAirlinesPage));
    }
}
