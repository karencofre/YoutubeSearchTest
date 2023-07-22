package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import modelo.YoutubeHomePage;

public class YoutubeSearchTest {
    private WebDriver driver;
    private YoutubeHomePage youtubeHomePage;

    @Before
    public void setUp() {
        // Cambia la siguiente ruta al directorio donde tengas el controlador ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        youtubeHomePage = new YoutubeHomePage(driver);
        youtubeHomePage.open();
    }

    @Test
    public void testYoutubeSearch() {
        String searchText = "Selenium Java";
        youtubeHomePage.enterSearchText(searchText);
        youtubeHomePage.performSearch();

        // Agregamos una pausa para que podamos ver los resultados de la búsqueda
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

