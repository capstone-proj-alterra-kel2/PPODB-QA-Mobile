package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Pulsa extends BasePageObject {

    private By masukOnLanding = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private By loginPage = By.xpath("//android.widget.ScrollView/android.widget.ImageView[2]");
    private By email = By.xpath("//android.widget.EditText[1]");
    private By pass = By.xpath("//android.widget.EditText[2]");
    private By masukkBtn = By.xpath("//android.view.View/android.view.View[10]");
    private By lainya = By.xpath("//android.widget.ImageView[@content-desc=\"Lainnya\"]");
    private By pulsaBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Pulsa\"]");
    private By telekom = By.xpath("(//android.view.View[@content-desc=\"Telekomunikasi\"])[1]");
    private By lanjutBtn = By.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
    private By numField = By.xpath("//android.widget.EditText");
    private By nominal = By.xpath("(//android.widget.Button)[3]");
    private By bayarBtn = By.xpath("//android.widget.Button[@content-desc=\"Bayar Sekarang\"]");
    private By saldo = By.xpath("(//android.widget.Button)[2]");
    private By dana = By.xpath("(//android.widget.Button)[3]");
    private By gopay = By.xpath("(//android.widget.Button)[4]");
    private By voucher = By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]");
    private By selectVoucer = By.xpath("(//android.widget.Button[@content-desc=\"Pakai\"])[2]");
    private By pilihVBtn = By.xpath("//android.widget.Button[@content-desc=\"Terapkan Voucher\"]");
    private By validateV =By.xpath("(//android.view.View[@content-desc=\"Voucher\"])[2]");
    private By validatePage = By.xpath("//android.view.View[@content-desc=\"Pembayaran Berhasil!\"]");
    private By validateProvider = By.xpath("//android.view.View[@content-desc=\"Telkomsel\"]");
    private By invalidNum = By.xpath("//android.view.View[@content-desc=\"Nomor handphone tidak ditemukan\"]");
    private By xSimbol = By.xpath("(//android.widget.Button)[1]");
    private By invalidNumInd = By.xpath("//android.view.View[@content-desc=\"Maaf hanya menerima nomor provider indonesia\"]");
    private By go = By.xpath("//android.widget.Button[@content-desc=\"Masuk ke aplikasi\"]");


    public void inputEmail(String s) {
        click(masukOnLanding);
        click(email);
        inputText(email, s);
    }

    public void inputPass(String arya) {
        click(pass);
        inputText(pass, arya);
    }

    public void clickMasukBtn() {
        scrollUp();
        click(masukkBtn);
    }

    public void clickPulsa() {
        click(pulsaBtn);
    }

    public void inputValidNum(String arg0) {
        click(numField);
        inputText(numField, arg0);
    }

    public void clickLanjutkan() {
        click(lanjutBtn);
    }

    public void choseNominal() {
        click(nominal);
    }

    public void chosePaymentM() {
        click(saldo);
    }

    public void clickBayar() {
        click(bayarBtn);
    }

    public void validatePageDisplayed() {
        isDisplayed(validatePage);
    }

    public void inputInvalidNum(String arg0) {
        click(numField);
        inputText(numField, arg0);
        click(lanjutBtn);
    }

    public void errorLesslongNumlDisplayed() {
        isDisplayed(invalidNum);
        click(xSimbol);
    }

    public void errorProviderIndDisplayed() {
        isDisplayed(invalidNumInd);
        click(xSimbol);
    }

    public void choseVoucher() {
        click(voucher);
        click(selectVoucer);
        click(pilihVBtn);
        isDisplayed(validateV);
    }

    public void selectdanaPaymentM() {
        scrollUp();
        click(dana);
        onWait();
    }

    public void clickGo() {
        click(bayarBtn);
        click(go);
        isDisplayed(validatePage);
    }
}

