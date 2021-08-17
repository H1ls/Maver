package PlayCliker;

import PlayCliker.Base.Base;
import org.testng.annotations.Test;

public class PlayCliker extends Base {

    @Test
    public void test() {
        while(true) {
            int EndResult = checkMoneyPage.result();
            lvlPage.clickBuyMoney();
            if(EndResult >= 100 && EndResult <= 150) {
                lvlPage.clickLvl1();
            }
            else if (EndResult >= 150 && EndResult <= 250) {
                lvlPage.clickLvl2();
            }
            else if(EndResult >= 250 && EndResult <=500) {
                lvlPage.clickLvl3();
            }
            else if(EndResult >= 500 && EndResult <=10_000) {
                lvlPage.clickLvl10();
            }
            else if(EndResult >=10_000 && EndResult <= 100_000){
                lvlPage.clickLv99();
            }
            else if(EndResult >= 100_000) {
                break;
            }
        }
    }
}

