package openbank;

import openbank.Base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.elements;


public class OpenBank extends Base {

    @Test
    public void text() {
        searchAndAssert.writeBox("Открытие");
        searchAndAssert.button();

        System.out.println(searchAndAssert.city());

        Assert.assertEquals("www.open.ru", searchAndAssert.getCiteText("www.open.ru"));

        searchAndAssert.openNewPage("www.open.ru");
        Assert.assertTrue(exchangeRate.getMinUSD() < exchangeRate.getMaxUSD());


    }
}
