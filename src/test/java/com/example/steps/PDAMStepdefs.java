package com.example.steps;

import com.example.app.Features.PDAM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDAMStepdefs {
    PDAM pdam = new PDAM();

    @And("I chose pdam on product menu")
    public void iChosePdamOnProductMenu() {
        pdam.chosePdam();

    }

    @When("I chose wilayah")
    public void iChoseWilayah() {
        pdam.selectWilaya();
    }

    @And("I input valid user num {string}")
    public void iInputValidUserNum(String arg0) {
        pdam.inputValidUserNum(arg0);
    }

    @When("I input invalid user num {string}")
    public void iInputInvalidUserNum(String arg0) {
        pdam.inputInvalidUserNum(arg0);
    }

    @Then("payment pdam is failed {string}")
    public void paymentPdamIsFailed(String arg0) {
        if (arg0.equals("Silakan Masukan Nomor Pelanggan Yang Benar")) {
            pdam.errorNumlDisplayed();
        }else if (arg0.equals("Silakan Pilih Daerah Anda")){
            pdam.errorWil();
        }
    }
}
