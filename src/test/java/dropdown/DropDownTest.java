package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void TestSelectOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option); // to select the option
        List<String> selectedOptions= dropDownPage.getSelectedOptions();// to see the selected action that will be returned as a list
        assertEquals(selectedOptions.size(),1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
