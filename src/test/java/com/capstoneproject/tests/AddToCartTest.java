package com.capstoneproject.tests;

//AddToCartTest.java
import org.testng.Assert;
import org.testng.annotations.Test;

import com.capstoneproject.pages.BaseTest;
import com.capstoneproject.pages.HomePage;
import com.capstoneproject.pages.ProductPage;
import com.capstoneproject.pages.SearchResultsPage;

public class AddToCartTest extends BaseTest {

 @Test
 public void testAddToCart() {
     HomePage homePage = new HomePage(driver);
     Assert.assertTrue(homePage.isFlipkartPresent(), "Flipkart not found on the page.");

     homePage.searchProduct("Macbook air m2");

     SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
     searchResultsPage.clickOnFirstResult();

     ProductPage productPage = new ProductPage(driver);
     productPage.addToCart();

     
 }
}
