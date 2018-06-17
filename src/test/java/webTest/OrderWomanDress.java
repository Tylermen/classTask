package webTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderWomanDress {
private final static String HOME_PAGE = "http://automationpractice.com/";
private final By WOMEN = By.xpath("//a[@title='Women']");


@Test
public void orederFromWeb () {

    System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get(HOME_PAGE);

    WebElement women = driver.findElement(WOMEN);
    women.click();


    driver.quit();













    }
}
