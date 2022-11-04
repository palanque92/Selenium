package Gun04.Work;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev4 {
    public static void main(String[] args) {
        //Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        //
        //Calculate'e tıklayınız.
        //
        //         İlk input'a herhangi bir sayı giriniz.
        //
        //         İkinci input'a herhangi bir sayı giriniz.
        //
        //Calculate button'una tıklayınız.
        //
        //Sonucu alınız.
        //
        //Sonucu yazdırınız.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.cssSelector("a[id='calculatetest']"));
        calculate.click();

        WebElement box1 = driver.findElement(By.cssSelector("input[id='number1']"));
        box1.sendKeys("20");

        WebElement box2 = driver.findElement(By.cssSelector("input[name='number2']"));
        box2.sendKeys("10");

        WebElement calculateButton = driver.findElement(By.cssSelector("input[id='calculate']"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.cssSelector("span[id='answer']"));
        System.out.println(answer.getText());



        MyFunc.Bekle(5);
        driver.quit();




    }
}
