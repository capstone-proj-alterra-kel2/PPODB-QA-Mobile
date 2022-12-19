package com.example.steps;

import com.example.app.Features.Faq;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaqStepdefs {
    Faq faq = new Faq();
    @When("I click faq menu")
    public void iClickFaqMenu() {
        faq.clickFaqMenu();
    }

    @And("I click one Of article")
    public void iClickOneOfArticle() {
        faq.clcikArticle();
    }

    @Then("I can see the article")
    public void iCanSeeTheArticle() {
        faq.articleDisplayed();
    }
}
