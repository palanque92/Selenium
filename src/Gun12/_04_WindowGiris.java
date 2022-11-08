package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowGiris extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("https://www.selenium.dev/");

        List <WebElement> linkler =driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:linkler)
            if (!link.getAttribute("href").contains("mailto"))
                link.click();

       // driver.getWindowHandle() --> aktif olan (window) id sini verir.
        Set <String> windowIds = driver.getWindowHandles();
        for (String id: windowIds )
            System.out.println("id = " + id);

        driverBekleKapat();



    }
}
