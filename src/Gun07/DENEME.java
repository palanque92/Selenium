package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DENEME extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://www.saucedemo.com/");

        driver.manage().deleteAllCookies();

       // String[] users={"standard_user", "locked_out_user", "problem_user","performance_glitch_user"};
       // String[] randomUsers = {"a","a","a","a"};

        //for (int i = 0; i < users.length; i++) {
        //    Arrays.sort(randomUsers);
        //    int secilen = (int) (Math.random() * users.length);


       //     if(Arrays.binarySearch(randomUsers,users[secilen]) >= 0){
       //         continue;
//
//
       //     }
       //     randomUsers[i] = users[secilen];
       // }

        user1();
        user2();
        user3();
        user4();


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
        MyFunc.Bekle(1);

        WebElement continiue = driver.findElement(By.xpath("//input[@type='submit']"));
        continiue.click();
        MyFunc.Bekle(1);

        WebElement order1 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        System.out.println("canta = " + order1.getText());
        MyFunc.Bekle(1);

        WebElement order2 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        System.out.println("T-hsirt = " + order2.getText());
        MyFunc.Bekle(1);

        WebElement total = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("Toplam tutar = " + total.getText());
        MyFunc.Bekle(1);

        WebElement finish = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
        finish.click();



       // for (int i = 0; i < randomUsers.length; i++) {
//
       //     if(!randomUsers[i].contains("a")){
       //         System.out.print(" - " + randomUsers[i]);
       //     }
//
//
       // }

        driverBekleKapat();
    }
    public static void user1 ()
    {
        WebElement name = driver.findElement(By.xpath(" //input[@id='user-name']"));
        name.sendKeys("standard_user");
        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);
        driver.navigate().back();
    }
    public static void user2 ()
    {
        WebElement name = driver.findElement(By.xpath(" //input[@id='user-name']"));
        name.sendKeys("locked_out_user");
        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);
        driver.navigate().back();
    }
    public static void user3 ()
    {
        WebElement name = driver.findElement(By.xpath(" //input[@id='user-name']"));
        name.sendKeys("problem_user");
        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);
        driver.navigate().back();
    }
    public static void user4 ()
    {
        WebElement name = driver.findElement(By.xpath(" //input[@id='user-name']"));
        name.sendKeys("performance_glitch_user");
        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);
    }
}
