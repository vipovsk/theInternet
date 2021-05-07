package dropdown;

import baseTest.BaseTestNew;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropDown extends BaseTestNew {
   @Test
    public void testSelectOptiob(){
       DropDownPage dropdownoage = homepage.clickDropdown();

       String option = "Option 1";
       dropdownoage.selectFromDropDown(option);

       List<String> selectedOptions = dropdownoage.getSelectedOption();
       Assert.assertEquals(selectedOptions.size(), 1, "Wrong number of selections");
       Assert.assertTrue(selectedOptions.contains(option), "Option not selecteed");
   }


}
