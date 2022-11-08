package Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverBekleKapat;


public class _01_CssSelector {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement yaz = driver.findElement(By.cssSelector("input[class='form-control']"));
        yaz.sendKeys("merhaba tester dunyasi biz geliyoruz");
        WebElement tikla = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        tikla.click();
        WebElement cikanYazi = driver.findElement(By.cssSelector("span[id='display']"));
        System.out.println("cikanYazi = " + cikanYazi.getText());

        //if (cikanYazi.getText().contains("merhaba tester dunyasi biz geliyoruz")){
        //    System.out.println("test passed");
        //} else {
        //    System.out.println("test failed");
        //}

        Assert.assertTrue("Mesaj bulunamadi",cikanYazi.getText().contains("yanlis giriyoruz"));

        driverBekleKapat();
    }
}
