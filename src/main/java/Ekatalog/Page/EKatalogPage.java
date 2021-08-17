package Ekatalog.Page;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.util.Iterator;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$x;

public class EKatalogPage {

    public SelenideElement siteLogim = $x("//*[@class=\"wu_entr\"]");
    public SelenideElement compare = $x("//*[@id=\"compared_goods_toolbar\"]");

    public void clickNewWindows() {
        String windowHandleFirst = WebDriverRunner.getWebDriver().getWindowHandle();
        compare.click();

        Set<String> windowHandles = WebDriverRunner.getWebDriver().getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            if (!nextValue.equals((windowHandleFirst))) {
                WebDriverRunner.getWebDriver().switchTo().window(nextValue);
            }
        }
    }

    public void autorization() {
        siteLogim.click();
    }
}
