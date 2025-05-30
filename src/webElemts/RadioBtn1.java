package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn1 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver .get("https://facebook.com");
		driver.manage().window().maximize();
		
		// To click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		
		//To select custom radio button
		driver.findElement(By.xpath("//lable[text()]='Custom'")).click();
		
		
		

	}

}
