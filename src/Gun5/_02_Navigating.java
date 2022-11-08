package Gun5;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverBekleKapat;

public class _02_Navigating {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // web sayfasini ac


        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); // o anda bulundugun url veriyor

        MyFunc.Bekle(3);
        driver.navigate().back(); // tarayici da geri sayfaya geldim

        MyFunc.Bekle(3);
        driver.navigate().forward(); // tarayici sayfada ileri gittim

        System.out.println(driver.getCurrentUrl());

        driverBekleKapat ();


    }
}
