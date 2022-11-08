package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart2 extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");


        WebElement clickMe = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button"));
        clickMe.click();
        MyFunc.Bekle(1);

        driver.switchTo().alert().dismiss();
        MyFunc.Bekle(1);

        driverBekleKapat();
    }
}
