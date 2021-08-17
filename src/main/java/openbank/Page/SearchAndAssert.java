package openbank.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SearchAndAssert {

    private SelenideElement combobox = $x("//*[@name=\"q\"]");
    private SelenideElement button = $x("//*[@type=\"submit\" and @value=\"Поиск в Google\"]");
    private ElementsCollection citeText = $$x("//cite");


    public String city(){
        return citeText.toString();
    }

    public String getCiteText(String link) {
        return citeText.findBy(Condition.exactText(link)).getText();
    }

    public void openNewPage(String link) {
        citeText.findBy(Condition.exactText(link)).click();
    }

    public void writeBox(String text) {
        combobox.sendKeys(text);
    }

    public void button() {
        button.click();
    }


}
