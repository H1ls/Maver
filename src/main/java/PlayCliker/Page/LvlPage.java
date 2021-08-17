package PlayCliker.Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class LvlPage {
    private SelenideElement buyMoney = $x("//*[@id=\"clickbtn\"]");
    private SelenideElement lvl1 = $x("//*[@value=\"Прокачать на 1 уровень|-100$\"]");
    private SelenideElement lvl2 = $x("//*[@value=\"Прокачать на 2 уровня|-150$\"]");
    private SelenideElement lvl3 = $x("//*[@value=\"Прокачать на 3 уровня|-250$\"]");
    private SelenideElement lvl10 =$x("//*[@value=\"Прокачать на 10 уровней|-500$\"]");
    private SelenideElement lvl99 =$x("//*[@value=\"Автокликер|-10000$\"]");

    public void clickBuyMoney() {
        buyMoney.doubleClick();
    }

    public void clickLvl1() {
        lvl1.doubleClick();
    }
    public void clickLvl2() {
        lvl2.doubleClick();
    }
    public void clickLvl3() {
        lvl3.doubleClick();
    }
    public void clickLvl10() {
        lvl10.doubleClick();
    }
    public void clickLv99() {
        lvl99.doubleClick();
    }

}
