package pages;

import org.openqa.selenium.WebDriver;

public class YaPage {
    WebDriver webDriver;

    public YaPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public MainPage mainPage(){ return new MainPage(webDriver); }

    public SearchResultPage searchResultPage(){ return new SearchResultPage(webDriver); }

    public TheLastPage theLastPage(){ return new TheLastPage(webDriver);}
}
