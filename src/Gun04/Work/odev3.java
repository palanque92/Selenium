package Gun04.Work;

import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev3 {
    public static void main(String[] args) {
        //1) Bu siteye gidin. -> https://www.snapdeal.com/
        //
        //2) "teddy bear" aratın ve  Search butonuna tıklayın.
        //
        //3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com//");

        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search products & brands']"));
        searchBox.sendKeys("teddy bear");

        WebElement button = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']"));
        button.click();

        WebElement sentence = driver.findElement(By.cssSelector("span[class='nnn']"));
        String cikanYazi = "We've got 242 results for teddy bear";

        Assert.assertTrue("Yanlis mesaj",sentence.getText().contains(cikanYazi));


        MyFunc.Bekle(5);
        driver.quit();

    }
}
