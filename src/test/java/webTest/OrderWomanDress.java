package webTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderWomanDress {
private final static String HOME_PAGE = "http://automationpractice.com/";
private final By WOMEN = By.xpath("//a[@title='Women']");
private final By DRESSES = By.xpath("//ul[@id='ul_layered_category_0']/li[2]/label/a");
private final By ORANGE = By.xpath("//ul[@id='ul_layered_category_0']/li[2]/label/a");


@Test
public void orederFromWeb () {

    System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get(HOME_PAGE);

    WebElement women = driver.findElement(WOMEN);
    women.click();

    WebElement dresses = driver.findElement(DRESSES);
    dresses.click();

    Assert.assertEquals(
            "", driver.getTitle());


    driver.quit();













    }
}
