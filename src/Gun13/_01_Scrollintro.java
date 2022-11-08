package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scrollintro extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("https://triplebyte.com/");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000);");
        // (0,3000) -> (x,y) Sayfayi saga x kadar ve asagi y kaydirir
        // 3000 px kadar asagi kaydiracak

        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0,-3000);");
        // scrollTo :Verilen pixele kadar gider.
        // scrollBy :Verilen kadar daha ileri gider.


        MyFunc.Bekle(2);
        driverBekleKapat();
    }
}
