package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Listrik extends BasePageObject {

    private By listrik = By.xpath("//android.widget.ImageView[@content-desc=\"Listrik\"]");
    private By id = By.xpath("//android.widget.EditText");
    private By invalidId = By.xpath("//android.view.View[@content-desc=\"Silahkan masukkan nomor yang valid\"]");

    private By mycuan = By.xpath("(//android.widget.Button)[2]");
    private By bayarrBtn = By.xpath("//android.widget.Button[@content-desc=\"Bayar Sekarang\"]");
    private By go = By.xpath("//android.widget.Button[@content-desc=\"Masuk ke aplikasi\"]");
    private By validatePage = By.xpath("//android.view.View[@content-desc=\"Pembayaran Berhasil!\"]");


    public void choseListrik() {
        click(listrik);
    }

    public void inputValidId(String arg0) {
        click(id);
        inputText(id, arg0);
    }

    public void inputInvalidId(String arg0) {
        click(id);
        inputText(id, arg0);
    }

    public void paymentFailed(String result) {
        isDisplayed(invalidId);
    }

    public void paymentM() {
        scrollUp();
        click(mycuan);
        onWait();

    }

    public void bayyarBtn() {
       click(bayarrBtn);
       isDisplayed(validatePage);
    }
}
