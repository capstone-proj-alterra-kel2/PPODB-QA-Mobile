package com.example.steps;

import com.example.app.Features.BPJS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BPJSStepdefs {
    BPJS bpjs = new BPJS ();
    @When("I input valid VA {string}")
    public void iInputValidVA(String arg0) {
        bpjs.inputValidVa(arg0);
    }

    @And("I chose bpjs on product menu")
    public void iChoseBpjsOnProductMenu() {
        bpjs.choseBpjs();
    }

    @When("I input invalid va {string}")
    public void iInputInvalidVa(String arg0) {
        bpjs.inputInvalidVa(arg0);
    }
}
