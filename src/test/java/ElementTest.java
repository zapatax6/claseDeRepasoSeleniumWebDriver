import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class ElementTest extends baseTest{
    ElementSteps elementSteps = new ElementSteps(webDriver);
    LandingsSteps landingsSteps =new LandingsSteps(webDriver);

    @Test
    public void testFormElements() {
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println(elementSteps.getTextFullName());
        Assert.assertEquals(elementSteps.getTextFullName(), "Full Name");
        System.out.println(elementSteps.getTextEmail());
        Assert.assertEquals(elementSteps.getTextEmail(),"Email");
        System.out.println(elementSteps.getTextCurrentAddress());
        Assert.assertEquals(elementSteps.getTextCurrentAddress(),"Current Address");
        System.out.println(elementSteps.getTextPermanentAddress());
        Assert.assertEquals(elementSteps.getTextPermanentAddress(),"Permanent Address");
        System.out.println(elementSteps.getTextSubmit());
        Assert.assertEquals(elementSteps.getTextSubmit(),"Submit");
    }

    @Test
    public void testDropDown() {
        webDriver.get("https://demoqa.com/select-menu");
        // Select by visibleText: Aqua -> Aqua
        // Select by visibleText: Black -> Black
        elementSteps.selectFavoriteColor("Black");
        System.out.println("Selected option by visible text is: " + elementSteps.getSelectedColor());
        //Select by index: 3 -> Yellow
        //Select by index: 5 -> Black
        elementSteps.selectFavoriteColorIndex(5);
        System.out.println("Selected option by index is: " + elementSteps.getSelectedColor());
        //Select by value: 9 -> Magenta
        //Select by value: 5 -> Black
        elementSteps.selectFavoriteColorValue("5");
        System.out.println("Selected option by value is: " + elementSteps.getSelectedColor());
        //Print if Select object is multiple
        System.out.println("Is Select multiple? " + elementSteps.isSelectMultiple());
    }
}
