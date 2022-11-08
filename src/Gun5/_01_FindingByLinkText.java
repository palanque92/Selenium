package Gun5;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://www.hepsiburada.com/"); // web sayfasini ac

        List<WebElement>  linkler = driver.findElements(By.tagName("a")); // tag ina gore bulma
        // bu bana sayfadaki tum linkleri verir

        for ( WebElement a : linkler ) {
            if (a.getText()=="") // kriik Link : Yani ekranda gorunen kismi yok
            {
                System.out.println("a.getAttribute(href) = " + a.getAttribute("href"));
                System.out.println("a.getAttribute(title) = " + a.getAttribute("title"));
                System.out.println("a.getAttribute(rell) = " + a.getAttribute("rell"));

            }
        }




        MyFunc.Bekle(5);
        driver.quit();
    }
}
