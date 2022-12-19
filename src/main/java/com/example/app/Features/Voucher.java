package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Voucher extends BasePageObject {

    private By vouch = By.xpath("//android.widget.ImageView[@content-desc=\"Voucher Saya\"]");
    private By list = By.xpath("//android.view.View[@content-desc=\"Pilihan Voucher\"]");
    private By vouchP = By.xpath("(//android.view.View[@content-desc=\"Voucher\"])[2]");


    public void clickVouch() {
        click(vouch);
    }

    public void voucherListDisplayed() {
        isDisplayed(vouchP);
    }
}
