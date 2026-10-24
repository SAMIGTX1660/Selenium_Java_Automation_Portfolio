package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Form_Submission {
	@Test
	public void naForm_Submissionme() throws InterruptedException{
		FirefoxDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://practice.qabrains.com/form-submission");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bodda Sami");
	     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Saminium@gmail.com");
	     driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("017110422314");
	     driver.findElement(By.xpath("//input[@id='date']")).sendKeys("2026-10-25");
	     driver.findElement(By.xpath("//textarea[@placeholder='Write Comment...']")).sendKeys("Saminium");
	     
	     JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("//button[@type='submit']")));
			
//	     driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
//	     WebElement uploadBox = driver.findElement(By.xpath("//input[@id='file']"));
//	     uploadBox.click();
		driver.findElement(By.xpath("//label[@for='Blue']")).click();
		
		WebElement pastaCheckbox = driver.findElement(By.xpath("//label[@for='Pasta']"));
		pastaCheckbox.click();
		WebElement pizzaCheckbox = driver.findElement(By.xpath("//label[@for='Burger']"));
		pizzaCheckbox.click();
		Select coutry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		coutry.selectByIndex(4);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
