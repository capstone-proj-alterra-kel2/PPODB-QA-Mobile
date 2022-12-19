package com.example.steps;

import com.example.app.Features.Logout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogutStepdefs {
    Logout logout = new Logout ();
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        logout.clickMasukBtn1();
        logout.inputEmail("retiamelina@gmail.com");
        logout.inputPass("Retiaah10");
        logout.clickMasukBtn();
        logout.headerHomeDisplayed();
    }

    @And("I go to akun menu")
    public void iGoToAkunMenu() {
        logout.clickMenuAkun();
    }

    @When("I click log out")
    public void iClickLogOut() {
        logout.clickLogout();
    }

    @Then("I success logout")
    public void iSuccessLogout() {
        logout.loginPageDisplayed();
    }
}
