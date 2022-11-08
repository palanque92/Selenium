package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToButtomOfThePage extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://triplebyte.com/");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);"); // sayfanin en asagisina gitti


        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0,0);"); // ve geri geldi

        driverBekleKapat();
    }
}
