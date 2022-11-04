package Gun04.Work;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev5 {
    public static void main(String[] args) {
        //Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        //
        //Fake Alerts' tıklayınız.
        //
        //Show Alert Box'a tıklayınız.
        //
        //Ok'a tıklayınız.
        //
        //Alert kapanmalıdır.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlert = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakeAlert.click();

        WebElement showAlerts = driver.findElement(By.cssSelector("input[class='styled-click-button']"));
        showAlerts.click();

        WebElement okAlerts = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        okAlerts.click();

        MyFunc.Bekle(5);
        driver.quit();

    }
}
