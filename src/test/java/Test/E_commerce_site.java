package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class E_commerce_site {
	@Test
	public void E_commerce_site() throws InterruptedException{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://practice.qabrains.com/ecommerce-site");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='View Test Case']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='text-blue-600']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@qabrains.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = driver.findElement(By.xpath("//h3[normalize-space()='QA Topics']"));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", targetElement);
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement targetElement1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/h3"));
		js1.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", targetElement1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Sample Shirt Name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M528.12 30')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='user-name font-bold text-xs sm:text-[15px]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/button/div")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[5]/div[2]/button[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='user-name font-bold text-xs sm:text-[15px]']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/button[2]")).click();
		Thread.sleep(2000);
		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"radix-_r_i_\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"radix-_r_j_\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"radix-_r_k_\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"radix-_r_l_\"]")).click();
		
	}
}
