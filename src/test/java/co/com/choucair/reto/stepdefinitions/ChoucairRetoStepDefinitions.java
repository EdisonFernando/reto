package co.com.choucair.reto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.RetoChoucairData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Devices;
import tasks.Join;
import tasks.Location;
import tasks.OpenUp;

import java.util.List;

public class ChoucairRetoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Estefania wants to join and she talks about$")
    public void thanEstefaniaWantsToJoinAndSheTalksAbout(List<RetoChoucairData> retoChoucairData) throws Exception {
        OnStage.theActorCalled("Estefania").wasAbleTo(
                OpenUp.thePage(),
                Join.onThePage(
                        retoChoucairData.get(0).getfName(),
                        retoChoucairData.get(0).getlName(),
                        retoChoucairData.get(0).getEmailA(),
                        retoChoucairData.get(0).getdM(),
                        retoChoucairData.get(0).getdD(),
                        retoChoucairData.get(0).getdY()
                )
        );
    }

    @When("^click on next, she need to add her address$")
    public void clickOnNextSheNeedToAddHerAddress(List<RetoChoucairData> retoChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Location.the(retoChoucairData.get(0).getCity(),retoChoucairData.get(0).getpCode(),retoChoucairData.get(0).getCountry()));
    }

    @When("^click on next devices, she needs to talk about her devices$")
    public void clickOnNextDevicesSheNeedsToTalkAboutHerDevices(List<RetoChoucairData> retoChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Devices.the(retoChoucairData.get(0).getPc(),retoChoucairData.get(0).getVersion(),retoChoucairData.get(0).getLanguage(),retoChoucairData.get(0).getMovil(),retoChoucairData.get(0).getModel(),retoChoucairData.get(0).getOs()));
    }

    @When("^click on the last step, she needs to create the password and accept the code of conduct and privacy$")
    public void clickOnTheLastStepSheNeedsToCreateThePasswordAndAcceptTheCodeOfConductAndPrivacy(List<RetoChoucairData> retoChoucairData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        //throw new PendingException();
    }

    @Then("^she go to click on complete setup and finish$")
    public void sheGoToClickOnCompleteSetupAndFinish(List<RetoChoucairData> retoChoucairData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
