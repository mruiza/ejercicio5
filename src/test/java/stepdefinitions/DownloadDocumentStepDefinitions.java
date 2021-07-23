package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verify;
import tasks.Download;
import tasks.OpenUp;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DownloadDocumentStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the supplier wants to use the Bancolombia Group Page$")
    public void thatTheSupplierWantsToUseTheBancolombiaGroupPage() throws Exception {
        theActorCalled("Supplier").wasAbleTo(OpenUp.thePageBancolombia());
    }

    @When("^He download the manual of Treatment and Protection Policies of Personal Data of Suppliers$")
    public void heDownloadTheManualOfTreatmentAndProtectionPoliciesOfPersonalDataOfSuppliers() throws Exception {
        theActorInTheSpotlight().attemptsTo(Download.theManual());
    }

    @Then("^He should see the manual(.*)$")
    public void heShouldSeeTheManualPolíticasDeTratamiento(String Title) throws Exception {
        theActorInTheSpotlight().should(seeThat(Verify.toThe(Title, "https://www.grupobancolombia.com/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y")));
    }
}
