package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Topup extends BasePageObject {
    private By masukOnLanding = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private By email = By.xpath("//android.widget.EditText[1]");
    private By pass = By.xpath("//android.widget.EditText[2]");
    private By masukkBtn = By.xpath("//android.view.View/android.view.View[10]");
    private By topupBtn = By.xpath("(//android.widget.ImageView)[4]");
    private By dana = By.xpath("//android.widget.ImageView[@content-desc=\"DANA\"]");
    private By nominal = By.xpath("//android.widget.EditText");
    private By bayarBtn = By.xpath("//android.widget.Button[@content-desc=\"Bayar Sekarang\"]");
    private By go = By.xpath("//android.widget.Button[@content-desc=\"Masuk ke aplikasi\"]");
    private By validatePage = By.xpath("//android.view.View[@content-desc=\"Isi Saldo Berhasil!\"]");



    public void clickTopupBtn() {
        click(topupBtn);
    }

    public void choosePaymentM() {
        click(dana);
    }

    public void inputNominal(String s) {
        click(nominal);
        inputText(nominal, s);
        onWait();
    }

    public void goToApp() {
        click(go);
        isDisplayed(validatePage);
    }

    public void clicMasukOnLanding() {
        click(masukOnLanding);
    }

    public void inputEmail(String s) {
        click(email);
        inputText(email, s);
        scrollUp();
    }

    public void inputPass(String arya) {
        click(pass);
        inputText(pass, arya);
    }

    public void clickMasukBtn() {
        click(masukkBtn);
    }

    public void bayarBtn() {
        onWait();
        click(bayarBtn);
    }

    public void validateP() {
        isDisplayed(validatePage);
    }
}
