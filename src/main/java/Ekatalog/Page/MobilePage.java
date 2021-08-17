package Ekatalog.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$x;

public class MobilePage {
    private SelenideElement minPrice = $x("//*[@id=\"minPrice_\"]");
    private SelenideElement maxPrice = $x("//*[@id=\"maxPrice_\"]");
    private ElementsCollection typeOfPhone = $$x("//*[@class=\"match-li-href\"]/label");
    private SelenideElement findButton = $x("//*[@class=\"submit-button\"]");

    private SelenideElement compareLink(String namePhone) {
        return $x("//*[text()= \"" + namePhone + "\"]/ancestor::table[@class=\"model-short-block\"]//*[@class=\"ctrl-chk1 h\"]");
    }

    private SelenideElement getNameOfPhone(String getName) {
        return $x("//*[@class=\"model-short-info\"]//*[contains(text(),\"" + getName + "\")]");
    }

    public String saveNamePhone(String getName) {
        return getNameOfPhone(getName).getText();
    }

    public void filter(String typePhone) {
        typeOfPhone.findBy(Condition.exactText(typePhone)).scrollIntoView(true).click();//visibi
    }

    public void pushFing() {
        findButton.scrollIntoView(true).click();
    }

    public void clickCompare(String namePhone) {
        compareLink(namePhone).click();
    }

    public void setMinPrice(String lowPrice) {
        minPrice.setValue(lowPrice);
    }

    public void setMaxPrice(String highPrice) {
        maxPrice.setValue(highPrice);
    }
}

