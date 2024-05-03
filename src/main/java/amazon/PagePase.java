package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagePase {
    public WebDriver driver;
    public PagePase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
