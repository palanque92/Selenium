package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doüum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.
public class _02_Soru extends BaseDriver {

    @Test
    public void Test1 ()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();
        // (//button[@value='1'])[3]
        // //input[@aria-label='Re-enter email address']

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

        // 1.Yontem // [id='reg_form_box'] > [class='hidden_elem'] -> direkt webelement i arandi. class ozelligi
        // Gorunmedigini kontrol edecek yontem
        List<WebElement> secondEmail = driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2. mail su an gozukuyor mu",(secondEmail.size()==1));
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
        email.sendKeys("Veli@gmail.com");
        MyFunc.Bekle(1);

        secondEmail=driver.findElements(By.name("reg_email__"));
        Assert.assertTrue("2. mail su an gozukuyor mu",(secondEmail.size()!=0));
        // Gorundugunu kontrol edilecegi yer.

        WebElement reEmail = driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
        reEmail.sendKeys("Veli@gmail.com");
        MyFunc.Bekle(1);

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select bselect = new Select(day);
        bselect.selectByValue("30");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select mselect = new Select(month);
        mselect.selectByValue("3");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select yselect = new Select(year);
        yselect.selectByValue("1992");

        Assert.assertFalse(email.getText().contains("Veli@gmail.com"));

        driverBekleKapat();




    }
}
