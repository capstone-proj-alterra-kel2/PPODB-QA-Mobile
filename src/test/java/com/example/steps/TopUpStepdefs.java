package com.example.steps;

import com.example.app.Features.Topup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopUpStepdefs {
    Topup topup = new Topup ();
    @When("click topup button")
    public void clickTopupButton() {
        topup.clickTopupBtn();
    }

    @And("choose payment method")
    public void choosePaymentMethod() {
        topup.choosePaymentM();
    }

    @And("input nominal")
    public void inputNominal() {
        topup.inputNominal("1000000");
    }

    @And("go to application")
    public void goToApplication() {
        topup.goToApp();
    }

    @Given("I have loged in")
    public void iHaveLogedIn() {
        topup.clicMasukOnLanding();
        topup.inputEmail("arya@gmail.com");
        topup.inputPass("arya");
        topup.clickMasukBtn();
    }

    @And("click bayr button")
    public void clickBayrButton() {
        topup.bayarBtn();
    }

    @Then("top up success")
    public void topUpSuccess() {
        topup.validateP();
    }
}
