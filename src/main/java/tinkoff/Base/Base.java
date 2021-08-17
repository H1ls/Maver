package tinkoff.Base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tinkoff.Page.MainPage;
import tinkoff.Page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class Base {
    public MainPage mainPage;
    public LoginPage loginPage;

    @BeforeMethod
    public void setting() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://www.tinkoff.ru/");

        mainPage = new MainPage();
        loginPage = new LoginPage();
    }

}
