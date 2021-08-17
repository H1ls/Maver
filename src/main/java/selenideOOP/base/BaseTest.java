package selenideOOP.base;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.codeborne.selenide.Configuration;
import selenideOOP.Page.YandexMainPage;
import selenideOOP.Page.YandexSearchPage;

public class BaseTest {
    public YandexMainPage yandexMainPage;
    public YandexSearchPage yandexSearchPage;

    @BeforeMethod
    public void setUp(){
        yandexMainPage = new YandexMainPage();
        yandexSearchPage = new YandexSearchPage();
        Configuration.browser="chrome";
        Configuration.startMaximized=true;
        open("https://yandex.ru");
    }
    @AfterMethod
    public void close(){
        Selenide.close();
    }
}
