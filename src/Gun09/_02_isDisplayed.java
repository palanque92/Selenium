package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_isDisplayed extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement cookie = driver.findElement(By.xpath("(//button[@value='1'])[3]"));
        cookie.click();
        MyFunc.Bekle(1);

        WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createAcc.click();
        MyFunc.Bekle(1);

        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("Ali");
        MyFunc.Bekle(1);

        WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
        surName.sendKeys("Veli");
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(email.isDisplayed());
        MyFunc.Bekle(1);

        WebElement reemail = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
        reemail.sendKeys("Veli@gmail.com");
        MyFunc.Bekle(1);

        email=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertTrue(email.isDisplayed());



        driverBekleKapat();
    }
}
