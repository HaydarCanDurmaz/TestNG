package Gun02;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Ornek extends BaseDriver {
    //hcndr@gmail.com pssword 1234555
    @Test
    void LoginTest1() {

        System.out.println("login test");


        driver.get("https://opencart.abstracta.us/index.php?route=account/login");



        WebElement login = driver.findElement(By.id("input-email"));
        login.sendKeys("hcndr@gmail.com");


        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234555");


        WebElement logbtn = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        logbtn.click();



       // Assert.assertTrue(driver.getTitle().equals("My Account"));

       // Assert.assertTrue(driver.getCurrentUrl().contains("route=account/account"));

    }

    @Test
    void loginTest() {
        System.out.println("Login Test");

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("hcndr@gmail.com\"");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234555");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        Assert.assertTrue(driver.getTitle().equals("My Account"));
        //Assert.assertEquals(driver.getTitle(),"My Account", "Login olamadı");
        //Assert.assertTrue(driver.getCurrentUrl().contains("account/account"));
    }
}
