
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ECommerceTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (update the path to your chromedriver executable)
        System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/D/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testFlipkartPresence() {
        // Navigate to the URL
        driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
     driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();

        // Verify Flipkart is present on the page
        WebElement flipkartLink = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[1]/a/picture/img"));
        Assert.assertTrue(flipkartLink.isDisplayed(), "Flipkart link is not present on the page.");
    }

    @Test(priority = 2)
    public void testSearchAndAddToCart() {
        // Enter "Macbook air m2" in the search box and click Search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Macbook air m2");
        searchBox.submit();

        // Click on the first displayed item
        WebElement firstItem = driver.findElement(By.cssSelector("div._1AtVbE"));
        firstItem.click();

        // Click on Add To Cart button
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
        addToCartButton.click();

        // Verify item has been added to the cart
        WebElement cartSuccessMessage = driver.findElement(By.xpath("//div[contains(text(),'Added to Cart')]"));
        Assert.assertTrue(cartSuccessMessage.isDisplayed(), "Item was not added to the cart successfully.");
    }

    @AfterClass
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
