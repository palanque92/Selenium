package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("Omer");

        WebElement comment = driver.findElement(By.xpath("//*[@id='description']"));
        comment.sendKeys("Merhaba selenium");

        WebElement submit = driver.findElement(By.xpath("//*[@id='btn-submit']"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Form submited Successfully!']"),"Form submited Successfully!"));

        WebElement txt = driver.findElement(By.xpath("//div[text()='Form submited Successfully!']"));
        Assert.assertEquals("Form submited Successfully!",txt.getText());




    }
}
