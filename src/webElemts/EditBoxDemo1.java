package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		// To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		// To focus on edit box or Text box
		driver.findElement(By.name("username")).click();
		Thread.sleep(4000);
		
		
		// To enter mindq in edit box
		driver.findElement(By.name("username")).sendKeys("Mindq");
		Thread.sleep(4000);
		
		//To read value from edit box
		String uid = driver.findElement(By.name("username")).getDomAttribute("value");
		System.out.println(uid);
		Thread.sleep(4000);
		
		//To clear data in edit box
		driver.findElement(By.name("username")).clear();
		

	}

}
