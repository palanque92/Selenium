package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByld {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://form.jotform.com/221934510376353"); // web sayfasini ac

        WebElement name = driver.findElement(By.id("first_8"));
        name.sendKeys("omer");

        WebElement surname = driver.findElement(By.id("last_8"));
        surname.sendKeys("BONCUK");
        
        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelSurName = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelSurName = " + labelSurName.getText());




        MyFunc.Bekle(5);
        driver.quit();
    }
}
