package Tests;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestPase {
    public WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void openUrl() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com");
        Cookie cookie = new Cookie("session-id", "140-1942916-7315111",".amazon.com" , "/", null, false,false );
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        driver.manage().window().maximize();
    }
}
