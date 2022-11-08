package TestProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserStory4 extends BaseDriver {
    @Test
    public void Test ()
    {
        driver.get("https://campus.techno.study/");


        WebElement userName = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        userName.sendKeys("omer_boncuk");
        MyFunc.Bekle(1);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("3jvP4HvRsYs24A8").perform();
        MyFunc.Bekle(1);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/form/button/span[1]"));
        login.click();
        MyFunc.Bekle(1);

        WebElement gridButton = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[6]"));
        gridButton.click();
        MyFunc.Bekle(1);

        WebElement message = driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-84\"]/div/span[2]/span/button/span"));
        message.click();
        MyFunc.Bekle(1);

        WebElement newMessage = driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-88\"]/div/span[1]/span/button/span"));
        newMessage.click();
        MyFunc.Bekle(1);

        WebElement receivers = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-button mat-icon-button mat-button-base mat-badge-accent mat-basic mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']"));
        actions.click(receivers).perform();
        MyFunc.Bekle(1);

        WebElement volkanAltintas = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-button mat-icon-button mat-button-base mat-badge-accent mat-basic mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']"));
        actions.click(volkanAltintas).perform();
        MyFunc.Bekle(1);

        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"ms-table-3\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[7]/td[3]"));
        actions.click(addButton).perform();
        MyFunc.Bekle(1);

        actions.sendKeys(Keys.ESCAPE);
        MyFunc.Bekle(1);

        WebElement messageWrite = driver.findElement(By.xpath("//*[@id=\"tiny-angular_26525231667657070327_ifr\"]"));
        messageWrite.sendKeys("Merhaba Volkan :) bu test icin gonderilmis bir mesaj o yuzden ciddiye alma.");
        MyFunc.Bekle(1);

        WebElement sendMessage = driver.findElement(By.xpath("/html/body/app/student-layout/div/footer/user-message-buttons/button-bar/div/div[1]/ms-button[2]/button"));
        sendMessage.click();
        MyFunc.Bekle(1);

        driverBekleKapat();




    }
}
