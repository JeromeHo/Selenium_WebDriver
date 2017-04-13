package seleniumWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logIn {

    @Test
    public void startWebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.virgingames.com");
        Assert.assertTrue(driver.getTitle().startsWith("Deposit £10 & Get £30 | Virgin Games"));
        Assert.assertTrue(driver.findElement(By.id("loginSubmit")).isDisplayed());
        driver.findElement(By.id("usernameField")).sendKeys("jimmyace");
        driver.findElement(By.id("passwordField")).sendKeys("basson55");
        driver.findElement(By.id("loginSubmit")).click();
        driver.findElement(By.id("doubleOptInClose")).click();
        //driver.findElement(By.id("pagelink_0")).click();
        driver.close();
        driver.quit();
    }
}