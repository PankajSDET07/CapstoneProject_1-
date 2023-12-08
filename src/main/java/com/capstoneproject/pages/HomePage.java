
package com.capstoneproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFlipkartPresent() {
        return driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[1]/a/picture/img")).isDisplayed();
    }

    public void searchProduct(String product) {
        driver.findElement(By.name("q")).sendKeys(product);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
