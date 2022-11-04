package Gun04.Work;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev6 {
    public static void main(String[] args) {
        //Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        //
        //Fake Alerts'e tıklayınız.
        //
        //Show modal dialog buttonuna tıklayınız.
        //
        //Ok'a tıklayınız.
        //
        //Alert kapanmalıdır.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        WebElement fakeAlert = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakeAlert.click();


        WebElement showButton = driver.findElement(By.cssSelector("input[id='modaldialog']"));
        showButton.click();


        WebElement okButton = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        okButton.click();


        MyFunc.Bekle(5);
        driver.quit();
    }
}
