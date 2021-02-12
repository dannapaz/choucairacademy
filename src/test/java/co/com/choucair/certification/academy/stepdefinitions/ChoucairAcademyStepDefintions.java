package co.com.choucair.certification.academy.stepdefinitions;


import co.com.choucair.certification.academy.modal.AcademyChoucairData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Danna wants to learn automation at the academy choucair$")
    public void thanDannaWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Danna").wasAbleTo(OpenUp.thePage(), Login.OnThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^she search for the course on the choucair academy platform$")
    public void sheSearchForTheCoursePatronesDeAutomatizacionOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called resources$")
    public void sheFindsTheCourseCalledResourcesPatronesDeAutomatizacion(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
