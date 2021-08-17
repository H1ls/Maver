package Ekatalog.Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement signIn = $x("//*[@class=\"signin-with-wrap clearfix\"]/div[3]");
    private SelenideElement emailLogin = $x("//*[@name=\"l_\"]");
    private SelenideElement password = $x("//*[@name=\"pw_\"]");
    private SelenideElement enterButton = $x("//*[@class=\"signin-actions ml-auto\"]//button[2]");

    public void clickLoginEmail() {
        signIn.click();
    }

    public  void setLogin(String email,String pass) {
        emailLogin.setValue(email);
        password.setValue(pass);
        enterButton.click();
    }

}
