package TestProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Case4 extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement eBook =driver.findElement(By.xpath("/html/body/div[2]/div/div/a[2]"));
        eBook.click();
        MyFunc.Bekle(1);

        WebElement addCart =driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div/a/div/div[2]/button"));
        addCart.click();
        MyFunc.Bekle(1);


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement debitCard =driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/div[3]/div/button[3]"));
        debitCard.click();
        MyFunc.Bekle(1);

        WebElement email =driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input"));
        email.sendKeys("123@gmail.com");
        MyFunc.Bekle(1);
        Actions actions = new Actions(driver);
        actions.moveToElement(email).perform();
        actions.sendKeys(Keys.TAB).perform();
        MyFunc.Bekle(1);
        actions.sendKeys("123@gmail.com").perform();
        MyFunc.Bekle(1);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Omer Boncuk").perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("0535 111 1111").perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Grup6").perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("4242 4242 4242 42421222000").perform();
        MyFunc.Bekle(1);


        WebElement payButton = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/button[1]"));
        payButton.click();

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.urlContains("https://www.fatfreecartpro.com"));

        WebElement tyMessage = driver.findElement(By.xpath("//p[@class='confirme_text']//span"));
        wait.until(ExpectedConditions.visibilityOf(tyMessage));



        driverBekleKapat();
    }
}
