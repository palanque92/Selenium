package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // FRAME1  id , name ve webelement gecisi cok yavas
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("TURKIYE");

        // su anda frame 1 ile gosterilen sayfadayiz diger frame2 veya 3 veya ilk sayfamizdaki
        // locator lari bulamayiz cunku driver su anda frame1 isimli sayfayi DRIVE etmekte


        // 1- driver.switchTo().frame(0); --> icteki frame3 e gecis olur.
        // 2- driver.switchTo().parentFrame(); --> bir onceki sayfaya geri donerim.
        // 3- driver.switchTo().defaultContent(); --> hangi sayfa da olursan ol direk o sayfaya gecis yaparsin


        driverBekleKapat();


    }
}
