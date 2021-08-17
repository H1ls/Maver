package tinkoff.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class MainPage {

    private ElementsCollection footer = $$x("//*[@class=\"footer__i24M5o\"]//span");
    private ElementsCollection services = $$x("//*[@class=\"InnerGrid__grid_m_27V3w\"]//header");
    private ElementsCollection nameCompany=$$x("//div[@data-qa-file=\"ProvidersItem\"]");



    public void searchByFooter(String razdel) {
        footer.findBy(Condition.exactText(razdel)).click();
    }

    public void searchByService(String usluga) {
        services.findBy(Condition.exactText(usluga)).click();
    }

    public void searchByCompanies(String company) {
        nameCompany.findBy(Condition.exactText(company)).click();
    }

}