package com.example.steps;

import com.example.app.Features.Pulsa;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PulsaStepdefs {
    Pulsa pulsa = new Pulsa();

    @And("I chose Pulsa on product menu")
    public void iChosePulsaOnProductMenu() {
        pulsa.clickPulsa();
    }

    @Given("I have log in")
    public void iHaveLogIn() {
        pulsa.inputEmail("arya@gmail.com");
        pulsa.inputPass("arya");
        pulsa.clickMasukBtn();
    }

    @When("I input valid phone number {string}")
    public void iInputValidPhoneNumber(String arg0) {
        pulsa.inputValidNum(arg0);
    }

    @And("click lanjutkan button")
    public void clickLanjutkanButton() {
        pulsa.clickLanjutkan();
    }

    @And("click nominal transaction")
    public void clickNominalTransaction() {
        pulsa.choseNominal();
    }

    @And("select payment method")
    public void selectPaymentMethod() {
        pulsa.chosePaymentM();
    }

    @And("click bayar button")
    public void clickBayarButton() {
        pulsa.clickBayar();
    }

    @Then("the transaction is success")
    public void theTransactionIsSuccess() {
        pulsa.validatePageDisplayed();
    }

    @When("I input invalid phone number {string}")
    public void iInputInvalidPhoneNumber(String arg0) {
        pulsa.inputInvalidNum(arg0);

    }

    @Then("transaction is failed {string}")
    public void transactionIsFailed(String arg0) {
        if (arg0.equals("Nomor Handphone tidak ditemukan")) {
            pulsa.errorLesslongNumlDisplayed();
        } else if (arg0.equals("Maaf hanya menerima nomor provider indonesia")) {
            pulsa.errorProviderIndDisplayed();
        }
    }

    @And("select voucher")
    public void selectVoucher() {
        pulsa.choseVoucher();
    }

    @And("select dana payment method")
    public void selectDanaPaymentMethod() {
        pulsa.selectdanaPaymentM();
    }

    @And("click go to application")
    public void clickGoToApplication() {
        pulsa.clickGo();
    }
}
