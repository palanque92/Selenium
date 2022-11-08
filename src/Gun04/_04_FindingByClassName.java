package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

// Chrome ctrl+f ye basıldığında inspect bölümünde
// first_name yazarsak bütün kelimelerde arar
// #first_name yazarsak bütün ID paramtrelerinde arar
// .first_name yazarsak bütün CLASS paramatrelerinde arar
// birden fazla ani locator a sahip eleman bulursa findelemets ne yapar?
// cevap : ilk element i bulur.

public class _04_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://form.jotform.com/221934510376353"); // web sayfasini ac

        WebElement submitButton1 = driver.findElement(By.className("form-sub-label"));
        System.out.println("submitButton.getText() = " + submitButton1.getText());


        WebElement submitButton = driver.findElement(By.className("form-submit-button"));
        System.out.println("submitButton.getText() = " + submitButton.getText());


        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        for (WebElement e : labels) {
            System.out.println("e.getText = " + e.getText());
        }

        // aranilan eleman bulunmazsa : findelements NoSuchElement hatasi verir.
        // findElements ise size i 0 olan List verir , yani hata vermez.
        MyFunc.Bekle(5);
        driver.quit();

    }
}
