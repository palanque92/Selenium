package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("https://triplebyte.com/");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("(//*[text()='Get a demo'])[5]"));
        // scroll u bi elemente kadar , yani o gorunene kadar nasil kaydiririm.
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        MyFunc.Bekle(1);

        js.executeScript("arguments[0].click();",element); // 1.yontem

        // 2. yontem
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // sayfanin kaydirma sonrasi tekrar yuklenmesi icin tetikleme
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();



        MyFunc.Bekle(2);
        js.executeScript("arguments[0].click();", element);
        // TODO : element.click();


        driverBekleKapat();
    }
}
