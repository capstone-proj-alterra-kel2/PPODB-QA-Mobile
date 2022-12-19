package com.example.steps;

import com.example.app.Features.Shopee;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopeeStepdefs {
    Shopee shop = new Shopee();
    @And("I click lainya")
    public void iClickLainya() {
        shop.clickLainnya();
    }

    @When("I click shopee")
    public void iClickShopee() {
        shop.clickShopee();
    }

    @And("input my num e-wallet")
    public void inputMyNumEWallet() {
        shop.inputNum("085773471838");
    }

    @And("click lanjutkan2 button")
    public void clickLanjutkanButton2() {
        shop.clickLanjutkanBtn();
    }

    @Then("top up e-wallet success")
    public void topUpEWalletSuccess() {
        shop.successTopup();
    }

    @And("I input nominal")
    public void iInputNominal() {
        shop.inputNominal("100000000");
    }
}
