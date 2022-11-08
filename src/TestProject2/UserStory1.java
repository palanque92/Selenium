package TestProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserStory1 extends BaseDriver {
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

        syllabuses();

        driverBekleKapat();










    }
    public static void syllabuses ()
    {
        WebElement syllabus1 = driver.findElement(By.xpath("//*[@id=\"container-3\"]/courses/ms-browse/div/mat-grid-list/div/mat-grid-tile[5]/div/mat-card/mat-card-footer/div[2]/button/span[1]"));
        syllabus1.click();
        MyFunc.Bekle(1);

        WebElement syllabus2 = driver.findElement(By.xpath("//*[@id=\"container-3\"]/courses/ms-browse/div/mat-grid-list/div/mat-grid-tile[4]/div/mat-card/mat-card-footer/div[2]/button/span[1]"));
        syllabus2.click();
        MyFunc.Bekle(1);

        WebElement syllabus3 = driver.findElement(By.xpath("//*[@id=\"container-3\"]/courses/ms-browse/div/mat-grid-list/div/mat-grid-tile[3]/div/mat-card/mat-card-footer/div[2]/button/span[1]"));
        syllabus3.click();
        MyFunc.Bekle(1);

        WebElement syllabus4 = driver.findElement(By.xpath("//*[@id=\"container-3\"]/courses/ms-browse/div/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/mat-card-footer/div[2]/button/span[1]"));
        syllabus4.click();
        MyFunc.Bekle(1);

        WebElement syllabus5 = driver.findElement(By.xpath("//*[@id=\"container-3\"]/courses/ms-browse/div/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/mat-card-footer/div[2]/button/span[1]"));
        syllabus5.click();
        MyFunc.Bekle(1);

    }
}
