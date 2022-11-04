package Gun04.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement adForm = driver.findElement(By.id("userName"));
        Actions action = new Actions(driver);
        driver.manage().window().fullscreen();

        action.click(adForm).perform();

        action.sendKeys("Sakir");
        action.sendKeys(Keys.TAB);
        action.sendKeys("ASD@GMAIL.COM");
        action.sendKeys(Keys.TAB);
        action.sendKeys("SakirSdet");
        action.sendKeys(Keys.TAB);
        action.sendKeys("Livanya , Vilnius");
        action.perform();

        WebElement button = driver.findElement(By.id("submit"));
        button.click();









    }
}
