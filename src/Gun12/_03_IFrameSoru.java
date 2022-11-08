package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("http://chercher.tech/practice/frames");


        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Kanada");

        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1); // selectin oldugu frame (frame2) ,ilk sayfadaki 2. yani  index olarak 1 olan frame

        WebElement animal = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
        Select select = new Select(animal);
        select.selectByIndex(3); // 4 no lu eleman secildi : son eleman: select.getOption().size()-1

        driverBekleKapat();



    }
}
