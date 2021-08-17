package openbank.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExchangeRate {
    private SelenideElement MinUSD = $x("//tr[2]/td[2]//*");
    private SelenideElement MaxUSD = $x("//tr[2]/td[4]//*");

    private SelenideElement MinEUR = $x("//tr[3]/td[2]//*");
    private SelenideElement MaxEUR = $x("//tr[3]/td[4]//*");

    public float swapToFloat(SelenideElement selenideElement) {
        return Float.parseFloat((selenideElement)
                .getText()
                .replace(',', '.'));

    }


    public float getMinUSD() {
        return swapToFloat(MinUSD);
    }

    public float getMaxUSD() {
        return swapToFloat(MaxUSD);
    }

    public float getMinEUR() {
        return swapToFloat(MinEUR);
    }

    public float getMaxEUR() {
        return swapToFloat(MaxEUR);
    }

}
