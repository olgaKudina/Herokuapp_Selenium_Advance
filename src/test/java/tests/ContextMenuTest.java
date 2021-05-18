package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class ContextMenuTest extends BaseTest {
    @Test
    public void alertOnContextMenuPageDisplayed(){
        contextMenuPage.openContextMenuPage();
        contextMenuPage.doubleClickOnBox();
        String alertText = contextMenuPage.findElementOnPopup();
        Assert.assertEquals(alertText, "You selected a context menu");
        contextMenuPage.closeAlertPopup();
    }
}
