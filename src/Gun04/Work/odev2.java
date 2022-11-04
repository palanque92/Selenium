package Gun04.Work;

import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
        password.sendKeys("techno123.");

        WebElement signIn = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        signIn.click();

        WebElement sonucYazi = driver.findElement(By.cssSelector("h6[style='text-align: center;font-size: x-large;color:red']"));
        String cikanYazi = "Your nearest branch closes in: 30m 5s";
        // String sonuc = sonucYazi.getText();
        // if (cikanYazi.equals(sonuc)){
        //     System.out.println("Test passed");
        // } else {
        //     System.out.println("Test failed");
        // }
        Assert.assertTrue("Yanlis mesaj",sonucYazi.getText().contains(cikanYazi));

        MyFunc.Bekle(5);
        driver.quit();


        //Your nearest branch closes in: 30m 5s


    }
}
