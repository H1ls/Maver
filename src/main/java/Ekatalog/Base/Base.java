package Ekatalog.Base;

import Ekatalog.Page.EKatalogPage;
import Ekatalog.Page.LoginPage;
import Ekatalog.Page.MenuPage;
import Ekatalog.Page.MobilePage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    //COMPAGE
    public EKatalogPage ekatalog;
    public LoginPage login;
    public MenuPage menu;
    public MobilePage mobile;

    @BeforeMethod
    public void setting(){
        Configuration.browser = "chrome";
        Configuration.startMaximized=true;
        open("https://www.e-katalog.ru/");

        //COMPAGE
        ekatalog = new EKatalogPage();
        login = new LoginPage();
        menu = new MenuPage();
        mobile = new MobilePage();
    }
//    @AfterMethod
//    public void exit() {
//        login.off();
//    }
}
