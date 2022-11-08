package TestProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case1 extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().deleteAllCookies();

        WebElement eBook =driver.findElement(By.xpath("/html/body/div[2]/div/div/a[2]"));
        eBook.click();
        MyFunc.Bekle(1);

        WebElement addCart =driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div/a/div/div[2]/button"));
        addCart.click();
        MyFunc.Bekle(1);

        driver.switchTo().frame(5);
        WebElement promoCode = driver.findElement(By.cssSelector("#Overlay > div > div.container.Cart > div > div.column.one-half.LeftColumn > div.Actions > button.Apply-Button.Show-Promo-Code-Button"));
        promoCode.click();
        // Actions actions = new Actions(driver);
        // actions.moveToElement(promoCode).perform();
        // actions.click(promoCode).perform();
        MyFunc.Bekle(1);

        WebElement promoCodegir =driver.findElement(By.xpath("//input[@placeholder='Promo Code']"));
        promoCodegir.sendKeys("123");
        MyFunc.Bekle(1);

        WebElement applyButton =driver.findElement(By.xpath("//*[@id='Overlay']/div/div[2]/div/div[1]/div[4]/div/button"));
        applyButton.click();
        MyFunc.Bekle(1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement txt =driver.findElement(By.xpath("//*[@id='SnackBar']/span"));
        MyFunc.Bekle(3);
        Assert.assertTrue(txt.getText().contains("Invalid promo code"));


        driverBekleKapat();



    }
}
