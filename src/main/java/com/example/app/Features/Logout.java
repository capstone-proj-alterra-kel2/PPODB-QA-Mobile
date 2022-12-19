package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Logout extends BasePageObject {

    private By masukOnLanding = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private By loginPage = By.xpath("//android.view.View[@content-desc=\"Masuk\"]");
    private By email = By.xpath("//android.widget.EditText[1]");
    private By pass = By.xpath("//android.widget.EditText[2]");
    private By masukBtn = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    private By menuAkun = By.xpath("(//android.widget.ImageView)[16]");
    private By logout = By.xpath("//android.view.View[@content-desc=\"Keluar\"]");
    private By headerHome = By.xpath("(//android.widget.ImageView[2])[1]");
    private By yesBtn = By.xpath("//android.widget.Button[@content-desc=\"Iya\"]");

    public void clickMasukBtn1() {
        click(masukOnLanding);
    }

    public void inputEmail(String s) {
        click(email);
        inputText(email, s);
    }

    public void inputPass(String retiaah10) {
        click(pass);
        inputText(pass, retiaah10);
    }

    public void clickMasukBtn() {
        click(masukBtn);
    }

    public void headerHomeDisplayed() {
        isDisplayed(headerHome);
    }

    public void clickMenuAkun() {
        click(menuAkun);
    }

    public void clickLogout() {
        scrollUp();
        click(logout);
        click(yesBtn);
    }

    public void loginPageDisplayed() {
        isDisplayed(masukOnLanding);
    }



}
