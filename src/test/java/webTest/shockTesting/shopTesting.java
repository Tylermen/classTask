package webTest.shockTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class shopTesting {
    private final static String HOME_PAGE = "http://automationpractice.com/";
    private final By MAIN_MENU_ITEMS = By.xpath(".//ul[@class ='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a");
    WebDriver driver;

    private final By FILTER_CHECK_BOX = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul']/li/label");
    private final By COLOR_CHECK_BOX = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul color-group']/li/label");
    private final By LOADER = By.xpath(".//ul[@class ='product_list row list']/p");
    private final By LIST_VIEW_ICON = By.className("icon-th-list");

    @Test
    public void dreessTest() {
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        selectMenuItem("WOMEN");
        

        selectFilter("Dresses", FILTER_CHECK_BOX);
        waitLoad();


        selectFilter("Orange", COLOR_CHECK_BOX);
        waitLoad();



        driver.findElement(LIST_VIEW_ICON).click();


//Список нужен для одинаковых элементов, тоесть элементы меню
        // Для xpatch "a" это линки
        // всегда использовать не дефенированный размер списка.
    }

    private void selectMenuItem(String item) {
        List<WebElement> menuItems = driver.findElements(MAIN_MENU_ITEMS);
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).equals(item)) {
                menuItems.get(i).click();
                break;

//если метод не работат, его надо выдвинуть в сам класс и не вметод WebDriver driver то что под public class shopTesting { ;
            }
        }
    }

    private void selectFilter(String filterName, By locator) {
        List<WebElement> filterItems = driver.findElements(locator);
        for (int i = 0; i < filterItems.size(); i++) {
            if (filterItems.get(i).getText().contains(filterName)) {
                filterItems.get(i).click();
                break;
            }
        }


    }

    private void waitLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));


    }
}
