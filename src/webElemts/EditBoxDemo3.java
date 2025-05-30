package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//To create object for user name
		WebElement usr = driver.findElement(By.name("username"));
		
		
		// To clear data from edit box
		usr.clear();
		
		// To enter Mindq in edit box
		usr.sendKeys("Mindq");
		Thread.sleep(4000);
		
		usr.sendKeys("Mindq");
		
		// To read the data from edit box 
		String usrnm = usr.getDomAttribute("value");
		if(usr.equals("MindqSystems")) {
			System.out.println("sendkeys() method will not overwrite the existing value");
		}
		else {
			System.out.println("sendkeys() method will overwrite the existing value");
		}

	}

}
