package Gun04;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_ContactUs extends BaseDriver {
    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
  3- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
  4- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.
 */
    @Test
    @Parameters("mesaj")
    void contactUs(String gelenMesaj){
        // String gelenmesaj : method için gerekli tanımlama ayn olmak zorunda degilllll


        WebElement contacyusBtn= driver.findElement(By.linkText("Contact Us"));
        contacyusBtn.click();

        WebElement enwuriyArea= driver.findElement(By.id("input-enquiry"));
        enwuriyArea.sendKeys(gelenMesaj);

        WebElement submitBtn= driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));


    }
}

