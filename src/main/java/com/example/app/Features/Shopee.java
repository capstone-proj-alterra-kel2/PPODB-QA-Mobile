package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Shopee extends BasePageObject {
    private By lainya = By.xpath("//android.widget.ImageView[@content-desc=\"Lainnya\"]");
    private By shopee = By.xpath("//android.widget.ImageView[@content-desc=\"Shopeepay\"]");
    private By num = By.xpath("//android.widget.EditText");
    private By lanjutkan = By.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
    private By lanjutkan2 = By.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
    private By nominal = By.xpath("//android.widget.EditText[1]");
    private By validatePage = By.xpath("//android.widget.ImageView");

    public void clickLainnya() {
        click(lainya);
    }

    public void clickShopee() {
        isDisplayed(shopee);
        click(shopee);
    }


    public void clickLanjutkanBtn() {
        click(lanjutkan2);
    }

    public void successTopup() {
        isDisplayed(validatePage);
    }

    public void inputNum(String s) {
        click(num);
        inputText(num, s);
        onWait();
    }


    public void inputNominal(String s) {
        click(nominal);
        inputText(nominal, s);
    }
}
