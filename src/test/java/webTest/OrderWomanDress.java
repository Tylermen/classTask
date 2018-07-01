package webTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class OrderWomanDress {
    private final static String HOME_PAGE = "http://automationpractice.com/";
    private final By WOMEN = By.xpath("//a[@title='Women']");
    //private final By DRESSES = By.xpath("//ul[@id='ul_layered_category_0']/li[2]/label/a");
    private final By DRESSES = By.xpath("//label/a[text()='Dresses']");
    private final By ORANGE = By.xpath("//label/a[text()='Orange']");
    private final By ADDDRESS1 = By.xpath("//div[@id='center_column']/ul/li/div/div[2]/div[2]/a/span");
    private final By ADDDRESSTOCARD1 = By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span");
    private final By ADDTOCART = By.xpath("//*[@title='Add to cart']/span");
    private final By ICONLIST = By.className("icon-th-list");
    // private  final By CONTINUESHOPPING = By.xpath("//*[@title='Continue shopping']");
    private final By CONTINUESHOPPING = By.xpath("//*[@class='button-container']/span");
    private final By CLICKCROSS = By.xpath("//*[@class ='cross']");
    private final By POPUP = By.id("layer_cart");
//private final By ADDDRESS2 = By.xpath();
//private final By GOBACKTOTHECLOSES = By.xpath();


    @Test
    public void orederFromWeb() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        WebElement women = driver.findElement(WOMEN);
        women.click();

        WebElement dresses = driver.findElement(DRESSES);
        dresses.click();

        Thread.sleep(10000);
        // WebDriverWait wait = new WebDriverWait(driver, 10000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(ORANGE));


        WebElement orange = driver.findElement(ORANGE);
        orange.click();

        //  WebElement dress1 = driver.findElement(ADDDRESS1);
        // dress1.click();


        // WebElement addtocard1 = driver.findElement(ADDDRESSTOCARD1);
        // addtocard1.click();
        //Assert.assertEquals("", driver.getTitle());


        WebElement iconlist = driver.findElement(ICONLIST);
        iconlist.click();
        // Thread.sleep(10000);
        List<WebElement> listOfElements = new ArrayList<WebElement>();
        listOfElements = driver.findElements(ADDTOCART);
        listOfElements.get(0).click();

        //WebElement continueshopping = driver.findElement(CONTINUESHOPPING);
        // continueshopping.click();


        Thread.sleep(10000);

        WebElement contuniesopping = driver.findElement(CONTINUESHOPPING);
        contuniesopping.click();
       // driver.get("http://automationpractice.com/index.php?id_category=3&controller=category#/categories-dresses");
      //  WebDriverWait wait = new WebDriverWait(driver, 10000);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(POPUP));

       // WebElement popup = driver.findElement(POPUP);
      //  driver.switchTo().defaultContent();



        List<WebElement> listOfElements2 = new ArrayList<WebElement>();
        listOfElements2 = driver.findElements(ADDTOCART);
        listOfElements2.get(1).click();




        //driver.switchTo().frame(popup);
        //((FirefoxDriver) driver).getKeyboard().pressKey(ESK);


        // driver.switchTo.frame("Frame_ID");
       // WebElement clickcross = driver.findElement(CLICKCROSS);
        //clickcross.click();
//

        //Thread.sleep(10000);
        //// List<WebElement> listOfElements2 = new ArrayList<WebElement>();
        // listOfElements2 = driver.findElements(CONTINUESHOPPING);
        // listOfElements2.get(3).click();


        //WebElement addToCard = driver.findElement(CLICKONDRESS1);
        // addToCard.click();


        // driver.quit();


    }
}
