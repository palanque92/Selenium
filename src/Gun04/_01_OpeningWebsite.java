package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("http://www.techno.study/"); // web sayfasini ac

        MyFunc.Bekle(5);
        driver.quit();
    }
}
