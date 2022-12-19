package com.example.app.Features;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class BPJS extends BasePageObject {
    private By bpjs = By.xpath("//android.widget.ImageView[@content-desc=\"BPJS\"]");
    private By va = By.xpath("//android.widget.EditText");
    private By invalidVa =By.xpath("//android.view.View[@content-desc=\"Silahkan masukkan nomor yang valid\"]");

    public void inputValidVa(String arg0) {
        click(va);
        inputText(va, arg0);
    }

    public void choseBpjs() {
        click(bpjs);
    }

    public void inputInvalidVa(String arg0) {
        click(va);
        inputText(va, arg0);
    }
}
