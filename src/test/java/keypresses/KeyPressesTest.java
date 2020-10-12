package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressPage;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTest {

    @Test
    public void testTextInputBackSpace(){
        KeyPressPage keyPressesTest = homePage.clickPressPage();
        //you cab use Keys. to mandarle fruta to a lots of things, like left, right arrows, space, ctrl, alt. etc
        //keys.Chord can be used to link Characters, to use something like "á" you need to press two keys ´ + a
        keyPressesTest.sendKeyWord("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesTest.result(),"You entered: BACK_SPACE");
    }
}
