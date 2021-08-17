package selenideOOP.Page;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class YandexMainPage {
    private SelenideElement searchTextField = $x(" //*[@aria-label=\"Запрос\"] ");
    private SelenideElement searchButton = $x("//*[@type=\"submit\"]");

    public void inputSearchAndClickSearch(String text){
        searchTextField.setValue(text);
        searchButton.click();
    }
}
