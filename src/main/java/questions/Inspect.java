package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.WhereFindCodeReservationPage;

import static userinterface.WhereFindCodeReservationPage.*;

public class Inspect implements Question<Boolean> {

    public Inspect(int length) {
        Length = length;
    }

    public int Length;

    public static Inspect toThe(int length) {
        return new Inspect(length);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String codeComplete = Text.of(COGE_RESERVATION_LABEL).viewedBy(actor).asString();
        int code = codeComplete.substring(39,45).trim().length();
        System.out.print(code);
        if (Length == code){
            return true;
        }else{
            return false;
        }
    }
}
