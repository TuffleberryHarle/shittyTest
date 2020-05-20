package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheLastPage {
    WebDriver webDriver;
    WebDriverWait wait;

    @FindBy(css = "a[href='https://travelify.ru/spisok-morey.html']")
    public static WebElement wikiLink;

//    @FindBy(tagName = "p")
//    public List<WebElement> thatPart;

    public TheLastPage(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30, 500);
        PageFactory.initElements(webDriver, this);
    }

    public void goToPage(){
        webDriver.get("https://travelify.ru/spisok-morey.html");
        //PageFactory.initElements(webDriver, this);
    }

    public void getTextFromPage(){
        short s = 0;
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='card-text']")));
        System.out.println(webDriver.findElements(By.tagName("p")).get(1).getText());
    }
}
