package Gun04.PROJE;

import Gun04.PROJE.Sesislemleri.Sesislemleri.Ses;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverBekleKapat;
import static Utility.MyFunc.*;

public class Proje {
    public static void main(String[] args) {


        Raporyukleniyor();

        Ses ses = new Ses();
        ses.Cal("C:\\Users\\boncu\\IdeaProjects\\SDET4\\src\\Gun04\\PROJE\\Sesislemleri\\Sesislemleri\\David Guetta - Im Good (feat Bebe Rexha).wav");

        UygulamaYukleniyor();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        // Baskentler

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement kopenhag = driver.findElement(By.id("box4"));
        WebElement seul = driver.findElement(By.id("box5"));
        WebElement roma = driver.findElement(By.id("box6"));


        // Ulkeler

        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement unitedStates = driver.findElement(By.id("box103"));


        Actions actions = new Actions(driver);
        MyFunc.Bekle(2);
        actions.dragAndDrop(oslo, norway).perform();
        MyFunc.Bekle(2);
        actions.dragAndDrop(madrid, spain).perform();
        MyFunc.Bekle(2);
        actions.dragAndDrop(stockholm, sweden).perform();
        MyFunc.Bekle(2);
        actions.dragAndDrop(washington, unitedStates).perform();
        MyFunc.Bekle(2);
        actions.dragAndDrop(kopenhag, denmark).perform();
        MyFunc.Bekle(2);
        actions.dragAndDrop(seul, southKorea).perform();
        MyFunc.Bekle(2);
        actions.dragAndDrop(roma, italy).perform();


        driverBekleKapat();
    }
}
