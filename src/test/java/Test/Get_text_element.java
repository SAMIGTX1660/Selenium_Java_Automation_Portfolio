package Test;

import java.awt.print.Printable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Get_text_element {
	@Test
public void Get_text_element() {
	FirefoxDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://practice.qabrains.com/");
    
    String txt= driver.findElement(By.xpath("//h2[normalize-space()='Leave Feedback']")).getText();
    System.out.print("GOT TXT: " + txt);
    		
}
}
