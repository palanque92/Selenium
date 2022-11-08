package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart3 extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");


        WebElement clickMe = driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(6) > div.panel-body > button"));
        clickMe.click();
        MyFunc.Bekle(1);

        driver.switchTo().alert().sendKeys("Omer");
        driver.switchTo().alert().accept();
        MyFunc.Bekle(1);

        WebElement txt = driver.findElement(By.xpath("//*[@id='prompt-demo']"));
        MyFunc.Bekle(1);
        Assert.assertTrue("Beklenen yazi gozukmedi",txt.getText().contains("Omer"));

        driverBekleKapat();
    }
}
