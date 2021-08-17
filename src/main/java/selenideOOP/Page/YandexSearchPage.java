package selenideOOP.Page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import selenideOOP.base.BaseTest;

import java.util.Iterator;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$x;


public class YandexSearchPage extends BaseTest {
    public SelenideElement linkButton = $x("//*[@class=\"path organic__path\"]//*[text() = \"market.yandex.ru\"]");

    public void clickNewWindow() {
        String windowHandFirst = WebDriverRunner.getWebDriver().getWindowHandle();

        linkButton.click();
        Set<String> windowHandles = WebDriverRunner.getWebDriver().getWindowHandles();
        Iterator<String> iterator= windowHandles.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            if(!nextValue.equals(windowHandFirst)){
                WebDriverRunner.getWebDriver().switchTo().window(nextValue);
            }
        }
    }
}
