package Gun04.Work;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Odev1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");

        WebElement currentEmail = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        currentEmail.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.cssSelector("button[id='submit']"));
        submit.click();

        WebElement sonucYazi = driver.findElement(By.cssSelector("div[class='border col-md-12 col-sm-12']"));
        System.out.println("*** sonucYazi *** \n" + sonucYazi.getText());





        MyFunc.Bekle(3);
        driver.quit();
    }
}
