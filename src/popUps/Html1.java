package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html1 {

	public static void main(String[] args) throws InterruptedException {
		
		//create script to enter "Mindq" in "First name" editbox box in "Signup" popup @FB application
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Mindq");
		

	}

}
