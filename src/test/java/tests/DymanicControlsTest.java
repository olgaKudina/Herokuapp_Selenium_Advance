package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DymanicControlsTest extends BaseTest {
    @Test
    public void checkboxTest () {
        dymanicControlsPage.openDynamicControlsPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dymanicControlsPage.selectCheckBoxAndRemove();
        dymanicControlsPage.waitForMessageDisplayedCheckboxGone();
        dymanicControlsPage.checkboxIsNotDisplayed(); //Проверить, что чекбокса нет
    }
      @Test
       public void inputTest(){
        dymanicControlsPage.openDynamicControlsPage();
        dymanicControlsPage.inputIsDisabled();
        dymanicControlsPage.clickEnableButton();
        dymanicControlsPage.waitForTextDisplayedEnabledButton();
        dymanicControlsPage.inputIsEnabled();



    }

}
