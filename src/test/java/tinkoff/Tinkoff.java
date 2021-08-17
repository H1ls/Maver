package tinkoff;

import org.testng.Assert;
import org.testng.annotations.Test;
import tinkoff.Base.Base;


public class Tinkoff extends Base {
    @Test
    public void text() throws InterruptedException {

        mainPage.searchByFooter("Платежи");
        mainPage.searchByService("Коммунальные услуги");
        mainPage.searchByCompanies("ЖКУ-Москва");

        loginPage.writeLogin("Код плательщика", "123123");
        loginPage.writeLogin("login", "123123");
        loginPage.writeLogin("password", "123123");

        Assert.assertEquals("Поле неправильно заполнено", loginPage.checkOnFilling());

        loginPage.buttonClick();
        loginPage.checkOnDisplayed();
    }
}
