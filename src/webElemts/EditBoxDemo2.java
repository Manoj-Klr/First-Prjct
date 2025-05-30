package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// To focus on edit box or to create web element for user name
		WebElement uid = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		
		// To enter user name
		uid.sendKeys("Mindq");
		Thread.sleep(3000);
		
		// To read the user name
		
		String usrnm = uid.getDomAttribute("value");
		System.out.println(usrnm);

		
		// To clear user name
		uid.clear();
		

	}

}
