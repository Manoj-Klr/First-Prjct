package webElemts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn2 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		// to click on create new account radio button
		driver.findElement(By.linkText("Create new account")).click();
		
		//To pause execution
		Thread.sleep(4000);
		
		// To read all the radio buttons from pop up
		List<WebElement> rdobtns = driver.findElements(By.className("_58mt"));
		System.out.println("No.of Radio Buttons are :" +rdobtns.size());
		
		// To read one by one radio button from collection
		for (WebElement rdobtn : rdobtns) {
			System.out.println(rdobtn.getText());
			
			// To select radio button
			rdobtn.click();
			Thread.sleep(4000);
		}

	}

}
