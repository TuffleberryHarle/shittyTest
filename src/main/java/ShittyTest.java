import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.YaPage;

public class ShittyTest {
    WebDriver webDriver;
    YaPage yaPage;
    public final String request = "Море";

    @Before
    public void setUp() {
        W:\\sumfin\\soft\\geckodriver.exe");

        webDriver = new FirefoxDriver();
        yaPage = new YaPage(webDriver);

        webDriver.get("https://yandex.ru/search/");
        yaPage.mainPage().putWord(request);
        yaPage.mainPage().submitButtonClick();
        yaPage.searchResultPage().waitForSearchResult();
    }

    @After
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    public void testSearchURL() throws Exception {
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search/?text"));
        Thread.sleep(1000);
    }

    @Test
    public void testSearch() throws Exception {
        Assert.assertTrue(webDriver
                .findElements(By.cssSelector("div[class='organic__url-text']"))
                .size() >= 9);
        System.out.println(webDriver
                .findElements(By.cssSelector("div[class='organic__url-text']"))
                .size());
        Thread.sleep(1000);
    }

    @Test
    public void goToPage() throws Exception{
        yaPage.theLastPage().goToPage();
        webDriver.manage().window().maximize();
        yaPage.theLastPage().getTextFromPage();
    }
}
