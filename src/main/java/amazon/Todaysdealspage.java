package amazon;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Todaysdealspage extends PagePase{

    public Todaysdealspage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='nav-main']/div[1]/div/div/div[3]/span[1]/span/input")
    WebElement dismiss;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[1]")
    WebElement todaydealslink;
    @FindBy(xpath = "//*[@id='grid-main-container']/div[2]/span[3]/ul/li[25]/label/span")
    WebElement grocery;
    @FindBy(xpath = "//*[@id='grid-main-container']/div[2]/span[3]/ul/li[27]/label/span")
    WebElement headfones;
    @FindBy(xpath = "//*[@id='grid-main-container']/div[2]/span[6]/ul/li[2]/div/a/span")
    WebElement discount;
    @FindBy(xpath = "//*[@id='dealsGridLinkAnchor']/div/div[4]/div/ul/li[4]/a")
    WebElement finalbage;
    @FindBy(xpath = "//*[@id='grid-main-container']/div[3]/div/div[1]/div/div/a")
    WebElement selectitem;
    @FindBy (id = "add-to-cart-button")
    WebElement Addtocart;
    @FindBy (xpath =" //*[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1")
   public WebElement addeditemsuccessfuly;





    public void todaydealspage()  {
        dismiss.click();
        todaydealslink.click();
        grocery.click();
        headfones.click();
        discount.click();
       finalbage.click();
       selectitem.click();
        Addtocart.click();
        addeditemsuccessfuly.getText();
    }
}
