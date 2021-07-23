package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Inspect;
import tasks.GoTo;
import tasks.ShowUp;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LengthReservationCodeStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the traveler wants to use the LATAM Airlines Page$")
    public void thatTheTravelerWantsToUseTheLATAMAirlinesPage() throws Exception {
        theActorCalled("Traveler").wasAbleTo(ShowUp.thePageLatamAirlines());
    }

    @When("^He search the general information of travel$")
    public void heSearchTheGeneralInformationOfTravel() throws Exception {
        theActorInTheSpotlight().attemptsTo(GoTo.theLinkDondeEncontrarDatosDelViaje());
    }

    @Then("^He should see the length of the verification code are (.*) digits$")
    public void heShouldSeeTheLengthOfTheVerificationCodeAreDigits(int Length) throws Exception {
        theActorInTheSpotlight().should(seeThat(Inspect.toThe(Length)));
    }
}
