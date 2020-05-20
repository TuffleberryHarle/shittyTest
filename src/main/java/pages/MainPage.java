package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver webDriver;
    private WebDriverWait wait;


    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    @FindBy(css = "input[id='uniq15881255476551']")
    WebElement searchField;

//    @FindBy

    //@FindBy(linkText = "https://wiki2.org/ru/")

    public MainPage(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30,500);
        PageFactory.initElements(webDriver, this);
    }

    public void submitButtonClick(){
        submitButton.click();
    }

    public void putWord(String text){
        searchField.clear();
        searchField.sendKeys(text);
    }
}
