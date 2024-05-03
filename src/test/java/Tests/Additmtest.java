package Tests;

import amazon.AddItem;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Additmtest extends TestPase {
    @Test
    public void verifythattheusercanadditemsucceddfuly(){
       AddItem newitem = new AddItem(driver);
       newitem.Addingnewitem();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      //  Assert.assertTrue(newitem.Addedtocard.isDisplayed());
        Assert.assertTrue(newitem.addedsuccessfuly.isDisplayed());

    }
}
