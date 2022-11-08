package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://www.hepsiburada.com/"); // web sayfasini ac

        WebElement link = driver.findElement(By.linkText("Siparişlerim")); // sadece a TAG lari icin ozel Locator bulma yontemi
        System.out.println("link.getText() = " + link.getText());

        System.out.println("link.getAttribute(href) = " + link.getAttribute("href"));
        System.out.println("link.getAttribute(title) = " + link.getAttribute("title"));
        System.out.println("link.getAttribute(rel) = " + link.getAttribute("rel"));

        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat")); // Linkin gorunen textinin bir kismi ile bulma
        // sadece a TAG leri icin ozel Locator bulma yontemi
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.Bekle(5);
        driver.quit();
    }
}
