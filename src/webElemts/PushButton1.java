package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PushButton1 {

	public static void main(String[] args) {
		// To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		// To create object for login button
		WebElement btn = driver.findElement(By.name("login"));
		
		//To read visible text
		String btnlgn = btn.getText();
		System.out.println("Login button visibletext is:" +btnlgn);
		
		
		//To read "name" attribute value
		String lgnname = btn.getDomAttribute("name");
		System.out.println("Login button 'name' attribute value is: " +lgnname);
		
		// To click on login button if it enable only
		if(btn.isEnabled()) {
			System.out.println("Login button enabled");
			btn.click();
		}
		else {
			System.out.println("Login button disabled");
		}
		
		
	}

}
