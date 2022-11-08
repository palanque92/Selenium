package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_RobotGiris extends BaseDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

        Robot robot = new Robot();

        // Accept cookies icin
        for (int i = 0; i < 6; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // ************************** //
        for (int i = 0; i < 22; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        driverBekleKapat();
    }
}
