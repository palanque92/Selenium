package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverBekleKapat;

public class _01_ElemaninStatusu {
    public static void main(String[] args) {


        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());
        System.out.println("sali.isEnabled() = " + sali.isEnabled());
        System.out.println("sali.isSelected() = " + sali.isSelected());
        
        sali.click();

        System.out.println("sali.isSelected() = " + sali.isSelected());


        driverBekleKapat();
    }
}
