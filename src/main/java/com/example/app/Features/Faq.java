package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Faq extends BasePageObject {
    private By faq = By.xpath("(//android.widget.ImageView)[15]");
    private By riwayat = By.xpath("(//android.widget.ImageView)[14]");
    private By akun = By.xpath("(//android.widget.ImageView)[16]");
    private By article = By.xpath("//android.view.View[@content-desc=\"Fitur apa saja yang bisa dinikmati pada aplikasi MyCuan?\"]");
    private By topik = By.xpath("//android.view.View[@content-desc=\"Topik\"]");

    public void clickFaqMenu() {
        click(faq);
    }

    public void clcikArticle() {
        click(article);
    }

    public void articleDisplayed() {
        isDisplayed(topik);
    }
}
