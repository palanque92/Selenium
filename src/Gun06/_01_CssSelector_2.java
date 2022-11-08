package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1 ()
    {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String msg = "merhaba tester dunyasi biz geliyoruz";

        WebElement yaz = driver.findElement(By.cssSelector("input[class='form-control']"));
        yaz.sendKeys(msg);
        WebElement tikla = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        tikla.click();
        WebElement cikanYazi = driver.findElement(By.cssSelector("span[id='display']"));
        System.out.println("cikanYazi = " + cikanYazi.getText());

        //if (cikanYazi.getText().contains("merhaba tester dunyasi biz geliyoruz")){
        //    System.out.println("test passed");
        //} else {
        //    System.out.println("test failed");
        //}

        Assert.assertTrue("Mesaj bulunamadi",cikanYazi.getText().contains(msg));

        // * icinde baslayan
        // ^ ile baslayan
        // $ ile baslayan

        // +   --->  bitişik kardeş
        // ~   --->  bütün kardeşler
        // --->  direk çocucklar
        // space ->  bütün çocuklar(torunlar dahil)

        driverBekleKapat();
    }
}
