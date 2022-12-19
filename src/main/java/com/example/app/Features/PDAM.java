package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class PDAM extends BasePageObject {
    private By pdam = By.xpath("//android.widget.ImageView[@content-desc=\"PDAM\"]");
    private By wilayah = By.xpath("(//android.widget.Button)[2]");
    private By userNum = By.xpath("//android.widget.EditText");
    private By errorW =By.xpath("//android.view.View[@content-desc=\"Silahkan Pilih Daerah Anda\"]");
    private By jepara = By.xpath("//android.view.View[@content-desc=\"Kab. Jepara\"]");
    private By bandung = By.xpath("//android.view.View[@content-desc=\"Kab. Badung\"]");
    private By errorNum = By.xpath("//android.view.View[@content-desc=\"Silahkan Masukkan Nomor Pelanggan Yang Benar\"]");


    public void chosePdam() {
        click(pdam);
    }

    public void selectWilaya() {
        click(wilayah);
        click(jepara);
    }

    public void inputValidUserNum(String arg0) {
        click(userNum);
        inputText(userNum, arg0);
    }

    public void inputInvalidUserNum(String arg0) {
        click(userNum);
        inputText(userNum, arg0);
    }

    public void errorNumlDisplayed() {
        isDisplayed(errorNum);
    }

    public void errorWil() {
        isDisplayed(errorW);
    }
}
