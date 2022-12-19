package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Register extends BasePageObject {
    private By landingPage = By.xpath("//android.widget.ImageView[2]");
    private By daftarBtn = By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    private By name = By.xpath("//android.widget.EditText[1]");
    private By email = By.xpath("//android.widget.EditText[2]");
    private By phoneNum = By.xpath("//android.widget.EditText[3]");
    private By lanjutBtn = By.xpath("//android.widget.Button[@content-desc=\"Lanjut\"]");
    private By errorName = By.xpath("(//android.view.View[@content-desc=\"Harus diisi\"])[1]");
    private By errorEmail = By.xpath("(//android.view.View[@content-desc=\"Harus diisi\"])[2]");
    private By errorNum = By.xpath("(//android.view.View[@content-desc=\"Harus diisi\"])[3]");
    private By headerPage2 = By.xpath("//android.view.View[@content-desc=\"Langkah 2 dari 2\"]");
    private By vName = By.xpath("//android.widget.EditText[1]");
    private By vEmail = By.xpath("//android.widget.EditText[2]");
    private By vNum = By.xpath("//android.widget.EditText[3]");
    private By pass = By.xpath("//android.view.View[2]/android.widget.EditText[1]");
    private By confirmPass = By.xpath("//android.view.View/android.view.View[2]/android.widget.EditText[2]");
    private By errorPass = By.xpath("(//android.view.View[@content-desc=\"Harus diisi\"])[1]");
    private By errorPasscon = By.xpath("(//android.view.View[@content-desc=\"Harus diisi\"])[2]");
    private By errorPasscon2 = By.xpath("//android.view.View[@content-desc=\"konfirmasi tidak sesuai\"]");
    private By errorKar = By.xpath("//android.view.View[@content-desc=\"8 Karakter\"]");
    private By errorHkecil = By.xpath("//android.view.View[7]");
    private By errorHkapital = By.xpath("//android.view.View[7]");
    private By registerBtn= By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    private By loginPage = By.xpath("//android.view.View[@content-desc=\"Masuk\"]");
    private By masukOnRegister =By. xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private String newemail;
    private String newemail2;

    public void landingPageIsDisplayed() {
        isDisplayed(landingPage);
    }

    public void clickDaftarBtn() {
        click(daftarBtn);
    }

    public void inputName(String arg0) {
        click(name);
        inputText(name, arg0);
    }

    public void inputEmail(String arg1) {
        click(email);
        List<Integer> category = new LinkedList<>();
        Random rand = new Random();
        newemail = "retiamelina10" + rand.nextInt() + "@gmail.com";
        inputText(email, arg1);
    }

    public void inputPhoneNum(String arg2) {
        click(phoneNum);
        inputText(phoneNum, arg2);
    }

    public void clickLanjutkanBtn() {
        scrollUp();
        click(lanjutBtn);
    }

    public void inputVName(String arg0) {
        click(vName);
        inputText(vName, arg0);
    }

    public void inputVEmail(String arg1) {
        click(vEmail);
        List<Integer> category2 = new LinkedList<>();
        Random rand = new Random();
        newemail2 = "retiamelina" + rand.nextInt() + "@gmail.com";
        inputText(vEmail, arg1);
    }

    public void inputVNum(String arg2) {
        click(vNum);
        inputText(vNum, arg2);
        click(lanjutBtn);
    }

    public void inputPassword(String arg0) {
        click(pass);
        inputText(pass, arg0);
    }

    public void InputConfirmPassword(String arg1) {
        click(confirmPass);
        inputText(confirmPass, arg1);
    }

    public void clickRegistBtn() {
        scrollUp();
        click(registerBtn);
    }


    public void errorNumDisplayed() {
        isDisplayed(name);
    }

    public void errorEmailDisplayed() {
        isDisplayed(email);
    }

    public void errorNameDisplayed() {
        isDisplayed(errorName);
    }

    public void headerPage2Displayed() {
        isDisplayed(headerPage2);
    }

    public void errorPassDisplayed() {
        isDisplayed(errorPass);
    }

    public void headerLoginDisplayed() {
        isDisplayed(errorHkecil);
    }

    public void errorPassconDisplayed() {
        isDisplayed(pass);
    }

    public void errorHkapitalDisplayed() {
        isDisplayed(errorHkapital);
    }

    public void errorKarakterangkaDisplayed() {
        isDisplayed(errorKar);
    }

    public void errorHkecilDisplayed() {
        isDisplayed(errorHkecil);
    }

    public void errorPasscon2Displayed() {
        isDisplayed(errorPasscon2);
    }

    public void inputAnAlreadyEmamail(String arg1) {
        click(email);
        inputText(email, arg1);
    }

    public void registPage22Displayed() {
        isDisplayed(headerPage2);
    }

    public void errorPopupAppears(String arg0) {
        isDisplayed(headerPage2);
    }
}
