package PlayCliker.Base;

import PlayCliker.Page.CheckMoneyPage;
import PlayCliker.Page.LvlPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Base {
    public LvlPage lvlPage;
    public CheckMoneyPage checkMoneyPage;

    @BeforeMethod
    public void setting() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("http://d999852b.beget.tech/");

        lvlPage = new LvlPage();
        checkMoneyPage = new CheckMoneyPage();

    }
}
