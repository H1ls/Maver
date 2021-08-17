package openbank.Base;

import com.codeborne.selenide.Configuration;
import openbank.Page.ExchangeRate;
import openbank.Page.SearchAndAssert;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Base {
    public SearchAndAssert searchAndAssert;
    public ExchangeRate exchangeRate;
    @BeforeMethod
    public void setting() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://www.google.com/");

        searchAndAssert = new SearchAndAssert();
        exchangeRate = new ExchangeRate();
    }
}
