package Gun10;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverBekleKapat;

public class _01_DragAndDropBy {
    public static void main(String[] args) {


        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu = driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        MyFunc.Bekle(2);

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(solSurgu,-100,0);
        MyFunc.Bekle(2);

        actions.perform();

        driverBekleKapat();


    }
}
