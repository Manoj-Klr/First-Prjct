package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechBox1 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//To check "remember me" check box
		driver.findElement(By.name("rememberUn")).click();
		
		//To pause the execution
		Thread.sleep(4000);
		
		//To uncheck remember me
		driver.findElement(By.name("rememberUn")).click();
		
		
		;
	}

}
