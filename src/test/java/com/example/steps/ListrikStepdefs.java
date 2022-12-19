package com.example.steps;

import com.example.app.Features.Listrik;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListrikStepdefs {
    Listrik listrik =new Listrik ();
    @And("I chose listrik on product menu")
    public void iChoseListrikOnProductMenu() {
        listrik.choseListrik();
    }

    @When("I input valid id {string}")
    public void iInputValidId(String arg0) {
        listrik.inputValidId(arg0);
    }

    @When("I input invalid id {string}")
    public void iInputInvalidId(String arg0) {
        listrik.inputInvalidId(arg0);
    }

    @Then("payment is failed {string}")
    public void paymentIsFailed(String result) {
        listrik.paymentFailed(result);
    }

    @And("select payyment method")
    public void selectPayymentMethod() {
        listrik.paymentM();
    }

    @And("click bayyar button")
    public void clickBayyarButton() {
        listrik.bayyarBtn();
    }
}
