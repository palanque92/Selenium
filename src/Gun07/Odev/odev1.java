package Gun07.Odev;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class odev1 extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("http://demoqa.com/text-box");

        WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullname.sendKeys("Tivorlu Ismail");
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        email.sendKeys("asd@gmail.com");
        WebElement cadress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        cadress.sendKeys("Tivorlu Ismail mah.");
        WebElement padress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        padress.sendKeys("Tivorlu Ismail mah.");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        WebElement cikanyazi1 = driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println(cikanyazi1.getText());
        WebElement cikanyazi2 = driver.findElement(By.xpath("//p[@id='email']"));
        System.out.println(cikanyazi2.getText());

        driverBekleKapat();




    }
}
