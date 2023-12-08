package com.capstoneproject.pages;

import org.openqa.selenium.By;
//BaseTest.java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
 protected WebDriver driver;

 @BeforeSuite
 public void setUp() throws InterruptedException {
     // Initialize WebDriver (update the path to your chromedriver executable)
     System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/D/chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(5000);
     driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
 }

 @AfterSuite
 public void tearDown() {
     // Quit WebDriver
     if (driver != null) {
         driver.quit();
     }
 }
}
