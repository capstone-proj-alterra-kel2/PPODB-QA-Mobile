package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Login extends BasePageObject {

    private By masukOnLanding = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private By loginPage = By.xpath("//android.view.View[@content-desc=\"Masuk\"]");
    private By email = By.xpath("//android.widget.EditText[1]");
    private By pass = By.xpath("//android.widget.EditText[2]");
    private By num = By.xpath("//android.widget.EditText[1]");
    private By masukBtn = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private By errorEmail = By.xpath( "//android.view.View[@content-desc=\"email tidak valid\"]");
    private By errorPass = By. xpath("//android.view.View[@content-desc=\"Sandi salah\"]");
    private By headerDash = By.xpath("(//android.widget.ImageView[2])[1]");
    private By eyesS = By.xpath("(//android.widget.Button)[2]");


    public void loginPageDispalyed() {
        isDisplayed(loginPage);
    }

    public void inputEmail(String arg0) {
        click(email);
        scrollUp();
        inputText(email, arg0);
    }

    public void inputPass(String arg1) {
        scrollUp();
        click(pass);
        inputText(pass, arg1);
        click(eyesS);
    }

    public void clickMasukBtn() {
        scrollUp();
        click(masukBtn);
    }

    public void errorEmailDisplayed() {
        isDisplayed(errorEmail);
    }

    public void errorPassDisplayed() {
        isDisplayed(pass);
    }

    public void dashboardDisplayed() {
        isDisplayed(headerDash);
    }

    public void inputphoneNum(String arg0) {
        scrollUp();
        click(num);
        inputText(num, arg0);
    }

    public void clickMasukBtnOnLanding() {
        click(masukOnLanding);
    }

    public void errorNumlDisplayed() {
        isDisplayed(errorEmail);
    }
}
