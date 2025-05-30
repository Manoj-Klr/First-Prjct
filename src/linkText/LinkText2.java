package linkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText2 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//To read all the links from page
		List<WebElement> pglinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no.of links are:" +pglinks.size());
		
		int count = 0;
		
		for (WebElement lnk : pglinks) {
			if(!lnk.getText().isEmpty()) {
				count++;
			}
		}
		
		System.out.println("No.of visible links are :" +count);
		System.out.println("No.of invisible links are :" +(pglinks.size()-count));
	}

}
