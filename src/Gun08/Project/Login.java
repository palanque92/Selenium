package Gun08.Project;

import Gun04.PROJE.Sesislemleri.Sesislemleri.Ses;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.MyFunc.Raporyukleniyor;
import static Utility.MyFunc.UygulamaYukleniyor;

public class Login extends BaseDriver {
    @Test
    public void Test2 ()
    {
        driver.get("https://www.akakce.com/");

        Raporyukleniyor();

        Ses ses = new Ses();
        ses.Cal("C:\\Users\\boncu\\IdeaProjects\\SDET4\\src\\Gun04\\PROJE\\Sesislemleri\\Sesislemleri\\David Guetta - Im Good (feat Bebe Rexha).wav");

        UygulamaYukleniyor();

        MyFunc.Bekle(2);


        WebElement girisButton = driver.findElement(By.xpath("//a[@href='https://www.akakce.com/akakcem/giris/']"));
        girisButton.click();
        MyFunc.Bekle(1);

        WebElement eposta = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eposta.sendKeys("asd123@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement giris = driver.findElement(By.xpath("//input[@id='lfb']"));
        giris.click();
        MyFunc.Bekle(1);

        WebElement ersantext = driver.findElement(By.linkText("Ersan"));
        Assert.assertTrue("Login failed",ersantext.getText().contains("Ersan"));
        ersantext.click();
        MyFunc.Bekle(1);

        WebElement siparislerim = driver.findElement(By.linkText("Siparişlerim"));
        siparislerim.click();
        MyFunc.Bekle(1);

        WebElement sipariYok = driver.findElement(By.xpath("//*[@id='user-order-info']/div"));
        Assert.assertTrue("Test failed",sipariYok.getText().contains("Kayıtlı siparişiniz bulunmuyor."));
        MyFunc.Bekle(1);


        WebElement anasayfa=driver.findElement(By.xpath("//a[@href='/']"));
        anasayfa.click();
        MyFunc.Bekle(1);


        WebElement ersantext1 = driver.findElement(By.linkText("Ersan"));
        ersantext1.click();
        MyFunc.Bekle(1);

        WebElement mesaj=driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        mesaj.click();
        MyFunc.Bekle(1);

        WebElement mesajbul=driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue("Mesaj var",mesajbul.getText().contains("Listelenecek mesaj bulunamadı."));
        MyFunc.Bekle(1);

        WebElement anasayfa1=driver.findElement(By.xpath("//a[@href='/']"));
        anasayfa1.click();
        MyFunc.Bekle(1);



        WebElement ersantext2 = driver.findElement(By.linkText("Ersan"));
        ersantext2.click();
        MyFunc.Bekle(1);


        WebElement hesapSil=driver.findElement(By.xpath("//a[@href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        hesapSil.click();
        MyFunc.Bekle(1);

        WebElement deleteAccount=driver.findElement(By.xpath("//input[@id='p']"));
        deleteAccount.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement delete=driver.findElement(By.xpath("//input[@id='u']"));
        delete.click();




















        driverBekleKapat();

    }
}
