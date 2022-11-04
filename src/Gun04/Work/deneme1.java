package Gun04.Work;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverBekleKapat;

public class deneme1 {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/");

        WebElement button = driver.findElement(By.xpath("(//div[@class='card-body'])[5]"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("(//span[@class='text'])[25]"));
        button2.click();
        WebElement alti = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[6]"));
        WebElement bir = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[1]"));
        WebElement alti2 = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[6]"));
        WebElement iki = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[2]"));
        WebElement alti3 = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[6]"));
        WebElement uc = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[3]"));
        WebElement alti4 = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[6]"));
        WebElement dort = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[4]"));
        WebElement alti5 = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[6]"));
        WebElement bes = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[5]"));





        Actions actions = new Actions(driver);
        actions.dragAndDrop(alti,bir).perform();
        actions.dragAndDrop(alti2,iki).perform();
        actions.dragAndDrop(alti3,uc).perform();
        actions.dragAndDrop(alti4,dort).perform();
        actions.dragAndDrop(alti5,bes).perform();


        driverBekleKapat();



    }
}
