package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddItem extends PagePase {
     public AddItem(WebDriver driver){
         super(driver);
     }

            @FindBy(id = "twotabsearchtextbox")
            WebElement Writecaraccessories;
            @FindBy(id = "nav-search-submit-button")
            WebElement Searchingicon;
            @FindBy(xpath = "//a[@class= 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
            WebElement Fristitem;
            @FindBy (id = "add-to-cart-button")
            WebElement Addtocart;
//            @FindBy (id = "NATC_SMART_WAGON_CONF_MSG_SUCCESS")
//            public WebElement Addedtocard;
           @FindBy(id = "sw-gtc")
            WebElement gotocard;
            @FindBy(xpath = "//div[@class= 'sc-item-content-group']")
           public WebElement addedsuccessfuly;


     public void  Addingnewitem(){

            Writecaraccessories.sendKeys("car accessories");
             Searchingicon.click();
             Fristitem.click();
             Addtocart.click();
//             Addedtocard.getText();
             gotocard.click();
             addedsuccessfuly.isDisplayed();










     }
}
