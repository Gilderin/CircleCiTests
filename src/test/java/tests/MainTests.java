package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests {
    WebDriver driver;

    @Test
    public void openChromepage()
    {
        System.out.println("selenium tests");
        driver=new ChromeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();

    }

    @Test
    public void openFirefoxpage()
    {
        System.out.println("selenium tests");
        driver=new FirefoxDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();

    }

}
