package tinkoff.Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement error_correct = $x("//div[contains(text(),\"Поле\")]");
    private SelenideElement error_display = $x("//div[contains(text(),\"Неверный\")]");
    private SelenideElement button = $x("//*[@data-qa-file=\"authKit\"]");

    private SelenideElement CodUser(String name) {
        return $x("//div[@data-qa-type=\"payments/providerPayForm\"]//*[@name=\"" + name + "\"]");
    }

    public void writeLogin(String input, String login) {
        CodUser(input).sendKeys(login);
    }

    public void buttonClick() {
        button.click();
    }

    public String checkOnFilling() {
        return error_correct.getText();
    }

    public boolean checkOnDisplayed() {
        return error_display.isDisplayed();
    }
}

