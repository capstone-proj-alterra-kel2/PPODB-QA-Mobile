package com.example.steps;

import com.example.app.Features.Data;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DataStepdefs {
    Data data = new Data();
    @And("I chose paket data on product menu")
    public void iChosePaketDataOnProductMenu() {
        data.clickPaketdata();
    }

    @And("select data paket")
    public void selectDataPaket() {
        data.selectDataP();
    }

    @And("select Mycuan method")
    public void selectMycuanMethod() {
        data.mycuanM();
    }

    @And("click bayarr button")
    public void clickBayarrButton() {
        data.clickBayarrBtn();
    }

    @Then("the data transaction is success")
    public void theDataTransactionIsSuccess() {
        data.validatePageDisplayed();
    }

    @And("select dana paymentt method")
    public void selectDanaPaymenttMethod() {
        data.danaPayment();
    }
}
