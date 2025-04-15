package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import PageObject.HomePage;
import PageObject.PracticeForm;
import PageObject.BookStorePage;

public class DemoQATest extends BaseTest {
	
	@Test
	public void testPracticeFormAndBookStore() throws InterruptedException {
        driver.get("https://demoqa.com");

        HomePage homePage = new HomePage(driver);
        homePage.goToFormsSection();
        
        PracticeForm formPage = new PracticeForm(driver);
        formPage.openPracticeForm();
        formPage.fillForm("Shub", "bhartiya", "shubham@gmail.com");
        Thread.sleep(8000);
        
        driver.navigate().to("https://demoqa.com/books"); // Back to home
        //homePage.goToBookStoreSection();
        
        BookStorePage bookStore = new BookStorePage(driver);
       // bookStore.openBookStore();
        bookStore.openBookByAuthor("Marijn Haverbeke");

        String expectedUrl = "https://demoqa.com/books?book=9781593275846";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("URL validation passed.");
        } else {
            System.out.println("URL validation failed.");
            System.out.println("Expected: " + expectedUrl);
            System.out.println("Actual: " + actualUrl);
        }
       

}

}