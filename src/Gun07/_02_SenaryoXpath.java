package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_SenaryoXpath extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://www.saucedemo.com/");



        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);
        WebElement canta = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        canta.click();
        MyFunc.Bekle(1);
        WebElement tshirt = driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[2]"));
        tshirt.click();
        MyFunc.Bekle(1);
        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunc.Bekle(1);
        WebElement checkout = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkout.click();
        MyFunc.Bekle(1);
        WebElement username1 = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
        username1.sendKeys("ersan");
        MyFunc.Bekle(1);
        WebElement lastname= driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        lastname.sendKeys("kuneri");
        MyFunc.Bekle(1);
        WebElement zipcode = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
        zipcode.sendKeys("123");
        WebElement continiue = driver.findElement(By.xpath("//input[@type='submit']"));
        continiue.click();
        MyFunc.Bekle(1);
        WebElement total = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("Toplam tutar = " + total.getText());
        MyFunc.Bekle(1);
        WebElement finish = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
        finish.click();



        driverBekleKapat();
    }
}
