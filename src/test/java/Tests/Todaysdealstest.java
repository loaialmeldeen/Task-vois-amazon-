package Tests;

import amazon.Todaysdealspage;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Todaysdealstest extends TestPase{
    @Test
    public void verythataddingHeadphonesgrocerysuccessfuly()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Todaysdealspage Headphonesgrocery = new Todaysdealspage(driver);
       Headphonesgrocery.todaydealspage();
        Assert.assertTrue(Headphonesgrocery.addeditemsuccessfuly.isDisplayed());
    }
}
