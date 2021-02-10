package tauDemo;

import browser.BrowserGetter;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class withConfigurationTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll(){
        driver = browserGetter.getDriver();

    }

    @AfterAll
    public void afterAll(){
        driver.quit();
    }

    @Test
    public void justAAtest(){
        driver.get("https://www.example.com");
        assertEquals("Example Domain",driver.getTitle());

    }
}
