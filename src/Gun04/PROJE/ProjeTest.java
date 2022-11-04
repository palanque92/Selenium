package Gun04.PROJE;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjeTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().deleteAllCookies();

        WebElement eBook = driver.findElement(By.xpath("/html/body/div[2]/div/div/a[2]"));
        eBook.click();
        MyFunc.Bekle(1);

        WebElement addCart = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div/a/div/div[2]/button"));
        addCart.click();
        MyFunc.Bekle(1);

        driver.switchTo().frame(5);
        WebElement promoCode = driver.findElement(By.cssSelector("#Overlay > div > div.container.Cart > div > div.column.one-half.LeftColumn > div.Actions > button.Apply-Button.Show-Promo-Code-Button"));
        promoCode.click();
        // Actions actions = new Actions(driver);
        // actions.moveToElement(promoCode).perform();
        // actions.click(promoCode).perform();
        MyFunc.Bekle(1);

        WebElement promoCodegir = driver.findElement(By.xpath("//input[@placeholder='Promo Code']"));
        promoCodegir.sendKeys("123");
        MyFunc.Bekle(1);

        WebElement applyButton = driver.findElement(By.xpath("//*[@id='Overlay']/div/div[2]/div/div[1]/div[4]/div/button"));
        applyButton.click();
        MyFunc.Bekle(1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement txt = driver.findElement(By.xpath("//*[@id='SnackBar']/span"));
        MyFunc.Bekle(3);
        Assert.assertTrue(txt.getText().contains("Invalid promo code"));


        driverBekleKapat();
    }

    @Test
    public void Test2() {
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement addcard = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addcard.click();

        MyFunc.Bekle(2);
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        MyFunc.Bekle(1);
        driver.switchTo().frame(frame);


        WebElement paycard = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));

        MyFunc.Bekle(1);
        paycard.click();
        MyFunc.Bekle(1);


        WebElement paybutton = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        paybutton.click();

        driver.switchTo().defaultContent();
        MyFunc.Bekle(1);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));

        WebElement invalidmsj = driver.findElement(By.xpath("//*[@id=\"SnackBar\"]/span"));
        Assert.assertTrue(invalidmsj.getText().equals("Invalid Email\n" +
                "Invalid Email\n" +
                "Invalid Billing Name"));
        driverBekleKapat();
    }

    @Test
    public void Test3() {
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement addToCart = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        addToCart.click();

        MyFunc.Bekle(1);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));

        MyFunc.Bekle(1);
        WebElement payDebit = driver.findElement(By.xpath("//button[@class=\"Payment-Button CC\"]"));
        payDebit.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Stripe-Element\"]/div/iframe")));
        MyFunc.Bekle(1);

        WebElement cardNumber = driver.findElement(By.cssSelector("[name=cardnumber]"));
        cardNumber.sendKeys("1111 1111 1111 1111");

        driver.switchTo().defaultContent();
        MyFunc.Bekle(1);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));


        WebElement invalid = driver.findElement(By.xpath("//*[@id=\"SnackBar\"]/span"));

        Assert.assertTrue(invalid.getText().equals("Kart numaranız geçersiz."));
        driverBekleKapat();
    }

    @Test
    public void Test4() {
        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement eBook = driver.findElement(By.xpath("/html/body/div[2]/div/div/a[2]"));
        eBook.click();
        MyFunc.Bekle(1);

        WebElement addCart = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div/a/div/div[2]/button"));
        addCart.click();
        MyFunc.Bekle(1);


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement debitCard = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/div[3]/div/button[3]"));
        debitCard.click();
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input"));
        email.sendKeys("123@gmail.com");
        MyFunc.Bekle(1);
        Actions actions = new Actions(driver);
        actions.moveToElement(email).perform();
        actions.sendKeys(Keys.TAB).perform();
        MyFunc.Bekle(1);
        actions.sendKeys("123@gmail.com").perform();
        MyFunc.Bekle(1);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Omer Boncuk").perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("0535 111 1111").perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Grup6").perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("4242 4242 4242 42421222000").perform();
        MyFunc.Bekle(1);

        // WebElement expDate = driver.findElement(By.cssSelector("input[name='exp-date']"));
        // expDate.sendKeys("12/22");
//
        // WebElement cvc = driver.findElement(By.cssSelector("input[name='cvc']"));
        // cvc.sendKeys("000");

        WebElement payButton = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/button[1]"));
        payButton.click();

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.urlContains("https://www.fatfreecartpro.com"));

        WebElement tyMessage = driver.findElement(By.xpath("//p[@class='confirme_text']//span"));
        wait.until(ExpectedConditions.visibilityOf(tyMessage));

        driverBekleKapat();
    }
    @Test
    public void Test5(){

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement contactUs=driver.findElement(By.xpath("//a[@class='contact']"));
        contactUs.click();

        WebElement name=driver.findElement(By.xpath("//input[@id='sender_name']"));
        name.sendKeys("Group6");

        WebElement email=driver.findElement(By.xpath("//input[@id='sender_email']"));
        email.sendKeys("Group6@group.com");

        WebElement subject=driver.findElement(By.xpath("//input[@id='sender_subject']"));
        subject.sendKeys("Group Project");

        WebElement message=driver.findElement(By.xpath("//*[@id='sender_message']"));
        message.sendKeys("Group Project is DONE!");

        WebElement sendButton=driver.findElement(By.xpath("//*[@id='send_message_button']"));
        sendButton.click();

        MyFunc.Bekle(3);
        System.out.println(driver.switchTo().alert().getText());

        MyFunc.Bekle(3);
        driver.switchTo().alert().accept();


        driverBekleKapat();
    }

}
