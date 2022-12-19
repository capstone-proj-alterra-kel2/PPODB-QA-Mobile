package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class TermsAndCondition extends BasePageObject {
    private By tc = By.xpath("//android.view.View[@content-desc=\"Syarat dan Ketentuan\"]");
    private By listTc = By.xpath("//android.widget.ScrollView");
    private By detail = By.xpath("//android.widget.ScrollView/android.view.View[1]");
    private By article = By.xpath("//android.view.View/android.widget.ScrollView");

    public void clickTc() {
        scrollUp();
        click(tc);
    }

    public void listTcDisplayed() {
        isDisplayed(listTc);
    }

    public void clickDetail() {
        click(detail);
    }

    public void articleDispalyed() {
        isDisplayed(article);
    }
}
