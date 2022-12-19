package com.example.steps;

import com.example.app.Features.Voucher;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VoucherStepdefs {
    Voucher vouch = new Voucher();
    @When("I click voucher")
    public void iClickVoucher() {
        vouch.clickVouch();
    }

    @Then("I can see my vouchers")
    public void iCanSeeMyVouchers() {
        vouch.voucherListDisplayed();
    }
}
