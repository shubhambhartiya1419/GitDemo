package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePage {
	private WebDriver driver;

    public BookStorePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void openBookStore() {
        driver.findElement(By.xpath("//span[text()='Book Store']")).click();
    }
    
    public void openBookByAuthor(String authorName) throws InterruptedException {
    	driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(authorName);
    	Thread.sleep(5000);
    	WebElement book = driver.findElement(By.xpath("//a[text()='Eloquent JavaScript, Second Edition']"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", book);
    	book.click();
    }
    
  
}
