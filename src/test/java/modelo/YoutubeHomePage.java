package modelo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class YoutubeHomePage {
    private WebDriver driver;
    private By searchBox = By.name("search_query");

    public YoutubeHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.youtube.com");
    }

    public void enterSearchText(String searchText) {
        driver.findElement(searchBox).sendKeys(searchText);
    }

    public void performSearch() {
        driver.findElement(searchBox).sendKeys(Keys.RETURN);
    }
}
