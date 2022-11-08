package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_SenaryoTest extends BaseDriver {

    @Test
    public void Test1 ()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement button = driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        button.click();
        MyFunc.Bekle(1);
        WebElement button2 = driver.findElement(By.cssSelector("div[id='section_1']>*:nth-child(5)"));
        button2.click();
        MyFunc.Bekle(1);
        WebElement button3 = driver.findElement(By.cssSelector("select[aria-required='true']>*:nth-child(4)"));
        button3.click();
        MyFunc.Bekle(1);
        WebElement button4 = driver.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
        button4.click();
        MyFunc.Bekle(1);
        WebElement button5 = driver.findElement(By.cssSelector("input[type='radio'][value='Good']"));
        button5.click();
        MyFunc.Bekle(1);
        WebElement button6 = driver.findElement(By.cssSelector("div[id='section_1']>*:nth-child(9)"));
        button6.click();
        MyFunc.Bekle(1);
        WebElement button7 = driver.findElement(By.cssSelector("div[id='section_1']>*:nth-child(9)>*:nth-child(4)"));
        button7.click();




        driverBekleKapat();
    }
}
