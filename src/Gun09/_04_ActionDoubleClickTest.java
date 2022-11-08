package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1 ()
    {

        driver.get("https://demoqa.com/buttons");
        WebElement element =driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element).doubleClick().build();
        action.perform();

        driverBekleKapat();
    }
}
