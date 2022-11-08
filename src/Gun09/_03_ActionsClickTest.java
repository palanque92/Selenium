package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsClickTest extends BaseDriver {
    @Test
    public void Test1 ()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        // element.click();

        Actions actions = new Actions(driver);
        System.out.println("aksiyon oncesi tum aksiyonlari calistiracagimiz ana aksiyonlar sinifi olusturuldu");

        Action action =actions.moveToElement(element).click().build();
        // elementin uzerine gidildi ,Click aksiyonu hazirda bekliyor, henuz clixk olmadi
        System.out.println("Aksiyon hazirlandi");
        MyFunc.Bekle(1);

        action.perform();
        System.out.println("Aksiyon gerceklesti");

        // actions.moveToElement(element).click().build().perform(); // kisa hali

        driverBekleKapat();

    }
}
