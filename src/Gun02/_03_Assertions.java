package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    @Test
    void equalsOrnek()
    {
        String s1="Merhaba";
        String s2="Merhaba1";

         //  Actual (oluşan) , Expected(beklenen)  , Mesaj(opsiyonel)
        Assert.assertEquals(s1,s2,"Karşılaştırma başarırız oldu");
      //  Assert.assertEquals(driver.getTitle(),"My Account","Login başarısız oldu");
     }
    @Test
    void notequalsOrnek() {
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        //  Actual (oluşan) , Expected(beklenen)  , Mesaj(opsiyonel)
        Assert.assertEquals(s1, s2, "Oluşan ve beklenen eşit olmadı");
    }
    @Test
    void TrueOrnek() {
        int s1 = 51;
        int s2 = 61;

        Assert.assertTrue(s1==s2,"Oluşan ve beklene eşit olmadı");// mesajıelse gibi durumlarda ki gibi düşünün
                                                                         // bekledigim olmadıgımda gözükücek
    }
    @Test
    void nullOrnek() {
        String s1 = null;
        Assert.assertNull(s1,"Oluşan null olmadı");


    }
    @Test
    void direkFail() {
        int a=55;
        if (a==55)
            Assert.fail();


    }

}
