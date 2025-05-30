package linkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText1 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//To read all the links from page
		List<WebElement> pglinks = driver.findElements(By.tagName("a"));
		
		
		if (pglinks.size()==300) {
			System.out.println("Test passed, Expected no.of links exist in page");
		}
		else {
			System.out.println("Test failed, actual no.of links are:" +pglinks.size());
		}
		
		//To read one by one links
		
		for(WebElement lnk : pglinks) {
			System.out.println(lnk.getText());
		};
	}

}
