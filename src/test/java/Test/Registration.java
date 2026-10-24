package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
    @Test
	public void name() throws InterruptedException {
	
	 FirefoxDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://practice.qabrains.com/registration");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bodda Sami");
     Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
     dropdown1.selectByIndex(2);
     Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='account']")));
     dropdown2.selectByIndex(4);
     driver.findElement(By.xpath("//textarea[@placeholder='Write Comment...']")).sendKeys("Saminium");
     JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//button[@type='submit']")));
		
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Saminium@gmail.com");
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Saminium12345");
     driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("Saminium12345");
     driver.findElement(By.xpath("//textarea[@placeholder='Write Comment...']")).sendKeys("Saminium");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
}
}
