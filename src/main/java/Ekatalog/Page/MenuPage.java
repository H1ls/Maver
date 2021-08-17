package Ekatalog.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MenuPage {

    private SelenideElement menu(String menuId) {
        return $x("//a[text()=\""+menuId+"\"]");
    }

    private ElementsCollection menuId2 = $$x("//*[@class=\"mainmenu-sublist\"]/a");

    public void clickMenu(String menuId) {
        menu(menuId).click();
    }
    public void clickMenuId2(String menuId) {
        menuId2.findBy(Condition.exactText(menuId)).click();
    }
}
