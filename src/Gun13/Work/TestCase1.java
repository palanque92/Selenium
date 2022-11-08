package Gun13.Work;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

         for (int i = 0; i < 5; i++) {
             Actions actions = new Actions(driver);

            int secilen1 = (int) (Math.random() * 100);
            String secilenSayi1 = String.valueOf(secilen1);

            int secilen2 = (int) (Math.random() * 100);
            String secilenSayi2 = String.valueOf(secilen2);


            WebElement sayi1 = driver.findElement(By.id("number1Field"));
            sayi1.sendKeys(secilenSayi1);
            MyFunc.Bekle(1);

            WebElement sayi2 = driver.findElement(By.id("number2Field"));
            sayi2.sendKeys(secilenSayi2);
            MyFunc.Bekle(1);

            WebElement calculateButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
            calculateButton.click();
            MyFunc.Bekle(1);



            WebElement sonuc = driver.findElement(By.id("numberAnswerField"));




             actions.sendKeys(sayi1).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
             actions.sendKeys(sayi2).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();




         }


        driverBekleKapat();

    }
}
