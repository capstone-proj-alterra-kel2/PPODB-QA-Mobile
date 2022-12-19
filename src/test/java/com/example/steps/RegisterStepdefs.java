package com.example.steps;

import com.example.app.Features.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepdefs {
    Register register = new Register();

    @Given("I opened the app")
    public void iOpenedTheApp() {
        register.landingPageIsDisplayed();
    }

    @And("I click daftar button")
    public void iClickDaftarButton() {
        register.clickDaftarBtn();
    }

    @When("I input fullname {string} email {string} and phone number {string}")
    public void iInputFullnameEmailAndPhoneNumber(String arg0, String arg1, String arg2) {
        register.inputName(arg0);
        register.inputEmail(arg1);
        register.inputPhoneNum(arg2);
    }

    @And("I click lanjutkan button")
    public void iClickLanjutkanButton() {
        register.clickLanjutkanBtn();
    }

    @Then("I can verify the result {string}")
    public void iCanVerifyTheResult(String result) {
        if (result.equals("error num")) {
            register.errorNumDisplayed();
        } else if (result.equals("error email")) {
            register.errorEmailDisplayed();
        } else if (result.equals("error name")) {
            register.errorNameDisplayed();
        } else if (result.equals("go to page 2")) {
            register.headerPage2Displayed();
        }
    }

    @And("I input valid fullname {string}, email {string} and phone number {string}")
    public void iInputValidFullnameEmailAndPhoneNumber(String arg0, String arg1, String arg2) {
        register.inputVName(arg0);
        register.inputVEmail(arg1);
        register.inputVNum(arg2);
        register.clickLanjutkanBtn();
    }

    @When("I Input password {string} and confirm password {string}")
    public void iInputPasswordAndConfirmPassword(String arg0, String arg1) {
        register.inputPassword(arg0);
        register.InputConfirmPassword(arg1);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        register.clickRegistBtn();
    }

    @Then("I get the result {string}")
    public void iGetTheResult(String result2) {
        if (result2.equals("error pass")) {
            register.errorPassDisplayed();
        } else if (result2.equals("go to home page")) {
            register.headerLoginDisplayed();
        } else if (result2.equals("error passcon")) {
            register.errorPassconDisplayed();
        } else if (result2.equals("error hkapital")) {
            register.errorHkapitalDisplayed();
        } else if (result2.equals("error karakterangka")) {
            register.errorKarakterangkaDisplayed();
        } else if (result2.equals("error hkecil")) {
            register.errorHkecilDisplayed();
        } else if (result2.equals("error passcon2")) {
            register.errorPasscon2Displayed();
        } else if (result2.equals("regist page 2")) {
            register.registPage22Displayed();
        }

    }

    @And("I input already fullname {string}, email {string} and phone number {string}")
    public void iInputAlreadyFullnameEmailAndPhoneNumber(String arg0, String arg1, String arg2) {
        register.inputAnAlreadyEmamail(arg1);
        register.inputVName(arg0);
        register.inputVNum(arg2);
    }

    @Then("I get the results {string}")
    public void iGetTheResults(String arg0) {
        register.errorPopupAppears(arg0);
    }
}
