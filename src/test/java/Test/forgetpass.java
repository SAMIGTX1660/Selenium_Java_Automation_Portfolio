package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class forgetpass {
	@Test
	public void forgetpass() throws InterruptedException{
		FirefoxDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://practice.qabrains.com/forgot-password");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bodda_Sami@gmail.com");
	     driver.findElement(By.xpath("//textarea[@placeholder='Write Comment...']")).sendKeys("Saminium");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}
}
