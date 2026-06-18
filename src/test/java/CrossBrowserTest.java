import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CrossBrowserTest {


    @Test
    public void verifyGoogleTitle() {


        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();


        // Open Google
        driver.get("https://www.google.com");


        // Get Page Title
        String title = driver.getTitle();


        System.out.println("Page Title: " + title);


        // Verify Title
        Assert.assertTrue(title.contains("Google"));


        // Close Browser
        driver.quit();

    }

}
