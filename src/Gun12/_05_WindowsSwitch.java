package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSwitch extends BaseDriver {
    @Test
    public void Test () {
        driver.get("https://www.selenium.dev/");

        String anaSayfaId = driver.getWindowHandle(); // bulundugum ana sayfanin id window id sini aldim.

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mailto"))
                link.click();

        // driver.getWindowHandle() --> aktif olan (window) id sini verir.
        Set<String> windowIds = driver.getWindowHandles(); // acik olan tum sayfalarin id sini verir.
        for (String id : windowIds)
            System.out.println(id + "-Title=" + driver.getTitle() + " -URL: " + driver.getCurrentUrl());

        driver.switchTo().window(anaSayfaId);

        for (String id : windowIds) {
            if (id.equals(anaSayfaId))
                continue; // sadece adimi pass gecti , kendinden sonra gelenleri calistirmadi

        driver.switchTo().window(id);
        driver.close(); // sadece bulundugum window u kapatir.
    }
        driverBekleKapat();
    }
}
