package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class drag_drop {
	@Test
	public void drag_drop() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://practice.qabrains.com/drag-drop");
	     Thread.sleep(8000);
	     
	  // 1. Find and store the source element (Drag Me box)[cite: 3]
	        WebElement sourceElement = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[2]/div[1]"));
	        
	        // 2. Find and store the target element (Drop Here box)[cite: 3]
	        WebElement targetElement = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[2]/div[2]"));
	        
	        // 3. Perform the action using the WebElement objects
	        Actions actions = new Actions(driver);
	        actions.clickAndHold(sourceElement)
	               .moveToElement(targetElement)
	               .release()
	               .build()
	               .perform();
	}
}
