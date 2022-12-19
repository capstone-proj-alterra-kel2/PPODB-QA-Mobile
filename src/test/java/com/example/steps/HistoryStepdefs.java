package com.example.steps;

import com.example.app.Features.History;
import com.example.app.Features.Pulsa;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HistoryStepdefs {
    History history = new History();
    @And("I click history on dashboard")
    public void iClickHistoryOnDashboard() {
        history.clickHistoryMenu();
    }

    @And("I buy pulsa")
    public void iBuyPulsa() {
        history.clickPulsa();
        history.inputPhoneNum("08123456789");
        history.clickLanjutkan();
        history.choseNominal();
        history.clickPaymentM();
        history.clickBayar();
        history.clickKembali();
    }

    @When("select one of history")
    public void selectOneOfHistory() {
        history.clickOneOfList();
    }

    @Then("I see my transaction")
    public void iSeeMyTransaction() {
        history.historyDisplayed();

    }

    @Then("I can see my history transaction")
    public void iCanSeeMyHistoryTransaction() {
        history.detailDisplayed();
    }

    @And("I buy paket data")
    public void iBuyPaketData() {
        history.clickData();
        history.inputPhoneNum("08123456789");
        history.clickLanjutkan();
        history.choseData();
        history.clickPaymentM();
        history.clickBayar();
        history.clickKembali();
    }

    @Then("I see my data transaction")
    public void iSeeMyDataTransaction() {
        history.dataHistoryDisplayed();
    }

    @Then("I see my pulsa transaction")
    public void iSeeMyPulsaTransaction() {

    }

    @Then("I can see my list history transaction")
    public void iCanSeeMyListHistoryTransaction() {
    }
}
