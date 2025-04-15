package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {
		
		private WebDriver driver;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }
	        
	     public void goToFormsSection()
	     {
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    	 js.executeScript("window.scrollBy(0,500)");
	    	 driver.findElement(By.xpath("//h5[text()='Forms']")).click();
	     }
	     
	     public void goToBookStoreSection() {
	         driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
	      
	    }
	}
