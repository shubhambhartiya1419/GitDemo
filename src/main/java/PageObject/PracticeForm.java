package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {
	private WebDriver driver;

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
    }
    
    public void openPracticeForm() {
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
    }
    
    public void fillForm(String firstName, String lastName, String email){
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, window.innerHeight / 2);");
        
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");
      
      
        
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        year.selectByVisibleText("2024");
        Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        month.selectByVisibleText("April");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement day15 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='15']")));
        day15.click();
        
        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subjectsInput);
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.ENTER);
        
        WebElement musicCheckbox = driver.findElement(By.xpath("//label[text()='Music']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", musicCheckbox);
        musicCheckbox.click();
        
        WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateInput);
        stateInput.sendKeys("NCR");
        stateInput.sendKeys(Keys.ENTER);
        
        WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cityInput);
        cityInput.sendKeys("Delhi");
        cityInput.sendKeys(Keys.ENTER);
        WebElement submitButton = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
        
    }
    
    

	
}
