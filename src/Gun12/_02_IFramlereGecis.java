package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramlereGecis extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("http://chercher.tech/practice/frames");


        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Omer");

        // driver.switchTo().parentFrame(); // 1 kademe geri gelir default page e ulasir

        driver.switchTo().defaultContent(); // defaultpage yani asil giris sayfasina ulasir

        // driver.switchTo().defaultContent().switchTo().frame(1); // bu sekilde de direk gecis yapilabilir.2 gecis birlestirildi/
        driver.switchTo().frame(1); // ana sayfadaki 2.frame(index olarak 1) ulasildi burasi selectin oldugu yer

        WebElement animal = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
        Select select = new Select(animal);
        select.selectByVisibleText("Avatar");

        driverBekleKapat();



    }
}
