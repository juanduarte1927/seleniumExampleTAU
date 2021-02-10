package tauDemo;

import browser.BrowserGetter;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

//s@TestInstance(PER_CLASS)
public class seleniumDemo {
    private static WebDriver driver;
   // private static BrowserGetter browserGetter;
    private static final BrowserGetter browserGetter = new BrowserGetter();
   // private WebDriver driver;


    @BeforeAll
    static void beforeAll(){
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll(){
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle(){
        String expectedComTitle = "Example title";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle,driver.getTitle());
    }

    @Test
    public void openTheOrgPageAndCheckTheTitle(){
        String expectedOrgTitle = "Example title";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle,driver.getTitle());
    }
}
