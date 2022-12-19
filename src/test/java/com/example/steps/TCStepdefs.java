package com.example.steps;

import com.example.app.Features.TermsAndCondition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCStepdefs {
    TermsAndCondition tc = new TermsAndCondition();

    @When("I click terms and condotion")
    public void iClickTermsAndCondotion() {
        tc.clickTc();
    }

    @Then("I can see list therm and condition")
    public void iCanSeeListThermAndCondition() {
        tc.listTcDisplayed();
    }

    @And("I click detail")
    public void iClickDetail() {
        tc.clickDetail();
    }

    @Then("I can see the term and condition")
    public void iCanSeeTheTermAndCondition() {
        tc.articleDispalyed();
    }
}
