package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Data extends BasePageObject {

    private By dana = By.xpath("//android.widget.ImageView[@content-desc=\"DANA\"]/android.widget.Button");
    private By go = By.xpath("//android.widget.Button[@content-desc=\"Masuk ke aplikasi\"]");
    private By paketData = By.xpath("//android.widget.ImageView[@content-desc=\"Paket Data\"]");
    private By mycuan = By.xpath("(//android.widget.Button)[2]");
    private By lagiBtn = By.xpath("//android.widget.Button[@content-desc=\"Transaksi lagi\"]");
    private By bayarrBtn = By.xpath("//android.widget.Button[@content-desc=\"Bayar Sekarang\"]");
    private By paketD = By.xpath("//android.view.View[@content-desc=\"GamesMax Ketengan Harian 1.8 GB GamesMax Ketengan Harian 1.5 GB Rp5.000\"]");


    public void clickPaketdata() {
        click(paketData);
    }

    public void selectDataP() {
        click(paketD);
    }

    public void mycuanM() {
        scrollUp();
        click(mycuan);
    }

    public void validatePageDisplayed() {
        click(mycuan);
        click(bayarrBtn);
        isDisplayed(go);
        click(go);
        isDisplayed(lagiBtn);
    }

    public void clickBayarrBtn() {
       click(bayarrBtn);
    }

    public void danaPayment() {
        click(dana);
        click(bayarrBtn);
        isDisplayed(go);
    }
}
