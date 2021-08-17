package PlayCliker.Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CheckMoneyPage {

    private SelenideElement score = $x("//*[@id=\"score\"]");

    public int result() {
       return Integer.parseInt(score.getText());
    }

    public int trans(String result){
        return Integer.parseInt(result.trim());
    }

}
