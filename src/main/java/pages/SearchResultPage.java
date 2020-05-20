package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
    WebDriver webDriver;
    WebDriverWait wait;

    public SearchResultPage(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30, 500);
    }

    public void waitForSearchResult() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .cssSelector("div[class='organic__url-text']")));
    }
}
