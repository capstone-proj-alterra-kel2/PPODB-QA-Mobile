package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class History extends BasePageObject {

    private By riwayatBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Riwayat Tab 2 of 4\"]");
    private By riwayat = By.xpath("(//android.widget.ImageView)[14]");
    private By pulsa = By.xpath("//android.widget.ImageView[@content-desc=\"Pulsa\"]");
    private By num = By.xpath("//android.widget.EditText");
    private By lanjutkan = By.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
    private By nominal = By.xpath("(//android.widget.Button)[3]");
    private By saldo = By.xpath("(//android.widget.Button)[2]");
    private By bayar = By.xpath("//android.widget.Button[@content-desc=\"Bayar Sekarang\"]");
    private By data = By.xpath("//android.widget.ImageView[@content-desc=\"Paket Data\"]");
    private By dataP = By.xpath("//android.widget.ScrollView");
    private By back = By.xpath("//android.widget.Button[@content-desc=\"Kembali ke beranda\"]");
    private By detail = By.xpath("//android.view.View[@content-desc=\"Rincian Pembayaran\"]");
    private By historypulsa = By.xpath("//android.widget.ImageView[@content-desc=\"Telkomsel Rp. 150000 150000 Melalui MyCuan Saldo Jumat, 16 Desember 2022 Rp 150000 Berhasil\"]");
    private By list = By.xpath("//android.view.View[@content-desc=\"Riwayat Transaksi\"]");
    private By list2 = By.xpath("(//android.view.View[2])[1]");
    private By dataHis = By.xpath("//android.widget.ImageView[@content-desc=\"Paket Promo 3GB 30 Hari 23000 Melalui MyCuan Saldo Jumat, 16 Desember 2022 Rp 23000 Berhasil\"]");
    public void clickPulsa() {
        click(pulsa);
    }

    public void inputPhoneNum(String s) {
        click(num);
        inputText(num, s);
    }

    public void clickLanjutkan() {
        click(lanjutkan);
    }

    public void choseNominal() {
        click(nominal);
        scrollUp();
    }

    public void clickPaymentM() {
        scrollUp();
        click(saldo);
    }

    public void clickBayar() {
        click(bayar);
    }

    public void clickKembali() {
        click(back);
    }

    public void clickHistoryMenu() {
        click(riwayat);
    }

    public void clickOneOfList() {
        click(historypulsa);
    }

    public void historyDisplayed() {
        isDisplayed(list);

    }

    public void detailDisplayed() {
        isDisplayed(detail);
    }

    public void clickData() {
        click(data);
    }

    public void choseData() {
        click(dataP);
    }

   public void dataHistoryDisplayed() {
        isDisplayed(dataHis);
    }
}
