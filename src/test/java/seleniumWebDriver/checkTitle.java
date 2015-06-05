package seleniumWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jerome.ho on 05/06/15.
 */
public class checkTitle {

    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("Title should be different",driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
