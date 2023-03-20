package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SofAssertVsHardAssert {
    @Test
    void hardAssert() {
        String s1 = "Merhaba";
        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba123", s1, "Oluşanla beklenen eşit degil");// test kırılıyor
        System.out.println("Hard assert sonrası");


    }

    @Test
    void softAssert() {
        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccount = "www.facebook.com/editaccountpage";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage); // true
        System.out.println("soft Assert 1");

        _softAssert.assertEquals("www.facebook.com/homepage", strCartPage); // False
        System.out.println("soft Assert 2");


        _softAssert.assertEquals("www.facebook.com/setting", strEditAccount); // False
        System.out.println("soft Assert 3");


        _softAssert.assertAll(); // bütün assertlerin sonuçlarını işlmem koy
        System.out.println("soft AsserAll : aktiflik sonrası");
        // bu bölüm assertAll sonra


    }
}
