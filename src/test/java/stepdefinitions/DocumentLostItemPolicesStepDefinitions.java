package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.Verify;
import tasks.GoToTheOption;
import tasks.Start;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DocumentLostItemPolicesStepDefinitions {
    @Given("^that user wants to use the Tocumen Airport Page$")
    public void thatUserWantsToUseTheTocumenAirportPage() throws Exception {
        theActorCalled("User").wasAbleTo(Start.toThePageTocumen());
    }

    @When("^He wants download the Lost and Found Polices document$")
    public void heWantsDownloadTheLostAndFoundPolicesDocument() throws Exception {
        theActorInTheSpotlight().attemptsTo(GoToTheOption.lostItem());
    }

    @Then("^He should see the document (.*)$")
    public void heShouldSeeTheDocumentPolíticasDeObjetosExtraviados(String polices) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.toThe(polices, "http://www.tocumenpanama.aero/images/objetos-extraviados/politicas-objetos-extraviados.pdf")));

    }
}
