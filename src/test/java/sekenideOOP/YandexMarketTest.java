package sekenideOOP;

import org.testng.annotations.Test;
import selenideOOP.base.BaseTest;

public class YandexMarketTest extends BaseTest {
    @Test
    public void test(){
        yandexMainPage.inputSearchAndClickSearch("яндекс маркет");
        yandexSearchPage.clickNewWindow();
    }
}
