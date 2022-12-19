package com.example.steps;

import com.example.app.Features.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
    Login login = new Login();
    @Given("I have register")
    public void iHaveRegister() {
        login.clickMasukBtnOnLanding();
        login.loginPageDispalyed();
    }

    @When("I input email {string} and password {string}")
    public void iInputEmailAndPassword(String arg0, String arg1) {
        login.inputEmail(arg0);
        login.inputPass(arg1);
    }

    @And("I click masuk button")
    public void iClickMasukButton() {
        login.clickMasukBtn();
    }


    @Then("I can verify the result3 {string}")
    public void iCanVerifyTheResult3(String result3) {
        if (result3.equals("error email")) {
            login.errorEmailDisplayed();
        } else if (result3.equals("error pass")) {
            login.errorPassDisplayed();
        }else if (result3.equals("go to dashboard")) {
            login.dashboardDisplayed();
        }
    }

    @Then("I can verify the result4 {string}")
    public void iCanVerifyTheResult4(String result4) {
        if (result4.equals("error num")) {
            login.errorNumlDisplayed();
        } else if (result4.equals("error pass")) {
            login.errorPassDisplayed();
        }else if (result4.equals("go to dashboard")) {
            login.dashboardDisplayed();
        }
    }


    @When("I input phonenum {string} and password {string}")
    public void iInputPhonenumAndPassword(String arg0, String arg1) {
        login.inputphoneNum(arg0);
        login.inputPass(arg1);
    }
}
