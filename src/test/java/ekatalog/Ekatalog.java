package ekatalog;

import org.testng.annotations.Test;
import Ekatalog.Base.Base;
import static com.codeborne.selenide.Selenide.*;

public class Ekatalog extends Base {

    @Test
    public void test() throws InterruptedException {
        ekatalog.autorization();
        login.clickLoginEmail();
        login.setLogin("rost-xxx93@mail.ru","70elitiZ");
        menu.clickMenu("Гаджеты");
        menu.clickMenuId2("Мобильные");
        mobile.setMinPrice("20000");
        mobile.setMaxPrice("25000");
        mobile.filter("смартфоны");
        mobile.filter("64 ГБ");
        mobile.filter("128 ГБ");
        mobile.filter("256 ГБ");
        mobile.filter("NFC (бесконтактная оплата)");
        mobile.filter("USB C");
        mobile.pushFing();
        //mb sleep
        mobile.clickCompare("Samsung Galaxy A71");
        mobile.clickCompare("Xiaomi Redmi Note 9 Pro");
        mobile.pushFing();
        sleep(5000);
    }
}
