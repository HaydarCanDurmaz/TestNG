package Gun03;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AdressFunctionality extends BaseDriver {
    @Test
    void aaAddres(){
        WebElement adressBook= driver.findElement(By.linkText("Address Book"));
        adressBook.click();

        WebElement newadress= driver.findElement(By.linkText("New Address"));
        newadress.click();

        WebElement firstname= driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("haydarcan");

        WebElement lastname= driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("durmaz");


        WebElement company= driver.findElement(By.id("input-company"));
        company.sendKeys("TecnoStudy");

        WebElement adress1= driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("Berlin 36 krezeuberg");

        WebElement adress2= driver.findElement(By.id("input-address-2"));
        adress2.sendKeys("rhgj ksjd");

        WebElement city= driver.findElement(By.id("input-city"));
        city.sendKeys("İstanbul");


        WebElement postode= driver.findElement(By.id("input-postcode"));
        postode.sendKeys("2534");

        WebElement webCountry= driver.findElement(By.id("input-country"));
        Select country = new Select(webCountry);
        country.selectByVisibleText("Turkey");
        // 2. ci Secenek
        wait.until(ExpectedConditions.elementToBeClickable(webCountry));


        // state yani şehir seçimi
        // 1.Seçenek
//        WebElement options=driver.findElement(By.cssSelector("select[id='input-zone']>option"));
//        wait.until(ExpectedConditions.stalenessOf(options));


        // yeni state secimi
       // WebElement options = driver.findElement(By.cssSelector("select[id='input-zone']>option"));
       // wait.until(ExpectedConditions.stalenessOf(options));



        WebElement webCity= driver.findElement(By.id("input-zone"));
        Select state = new Select(webCity);
        //state.selectByVisibleText("Ankara");

        //state.selectByVisibleText("Ankara");
         state.selectByValue("3321");
        //state.selectByIndex(7);

        /************/
        // stale element hatası : tez buldum erken kaybettim

        //selectByVisibleText, selectByValue : findElement gibi çalıştığından
        //                                     implictly wait i kullanır.
        // selectByIndex : implicitlyWait ie çalışMIYOR. ancak ExplicitWait ile çalışır
        /************/

        WebElement continu1Yes= driver.findElement(By.xpath("//input[@value='1']\n"));
        continu1Yes.click();


        WebElement continu= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        continu.click();



        Tools.Bekle(5);

        Tools.successMessageValidation();

    }
    @Test(dependsOnMethods = {"aaAddres"})
    void  editAdress(){
        WebElement adressBook= driver.findElement(By.linkText("Address Book"));
        adressBook.click();
        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit= editAll.get(editAll.size()-1); // son edit
        sonEdit.click();

        WebElement firstname= driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys("haydarcan1");

        WebElement lastname= driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("durmaz1");

        WebElement continu= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        continu.click();

        Tools.successMessageValidation();

    }
    @Test
    void  deletAdress(){

    }


}

