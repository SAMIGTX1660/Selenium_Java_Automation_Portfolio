package Test;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SendKey {
	@Test
 public void SendKey() throws InterruptedException {
	 FirefoxDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://practice.qabrains.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//textarea[@placeholder='Write Comment...']")).sendKeys("Saminium");
     
     JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//h3[normalize-space()='QA Topics']")));
	
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Saminium@gmail.com");
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Saminium12345");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
}
}
