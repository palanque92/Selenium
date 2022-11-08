package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionHoverOverTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.etsy.com/");

        WebElement accept = driver.findElement(By.xpath("//*[@id='gdpr-single-choice-overlay']/div/div[2]/div[2]/button"));
        accept.click();

        WebElement jewellery = driver.findElement(By.xpath("//*[@id='desktop-category-nav']/div[1]/div/ul/li[2]/a"));
        WebElement necklaces = driver.findElement(By.xpath("//*[@id='side-nav-category-link-10873']"));
        WebElement bibNecklaces = driver.findElement(By.xpath("//*[@id='catnav-l3-10881']"));


        Actions actions = new Actions(driver);

        actions.moveToElement(jewellery).perform();
        MyFunc.Bekle(1);

        actions.moveToElement(necklaces).perform();
        MyFunc.Bekle(1);

        actions.moveToElement(bibNecklaces).perform();
        MyFunc.Bekle(1);
        bibNecklaces.click();

        Assert.assertTrue("Url de bib kolyesi yok",driver.getCurrentUrl().contains("bib"));


        driverBekleKapat();
    }
}


