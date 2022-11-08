package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteMultipleContainer"));

        Actions actions = new Actions(driver);

        Action action = actions
                .moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("o")
                .keyUp(Keys.SHIFT)
                .sendKeys("mer")
                        .build();


        action.perform();
        driverBekleKapat();
    }
}
