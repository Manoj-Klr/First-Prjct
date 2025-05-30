package linkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText3 {

	public static void main(String[] args) {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		//create object for language links
		WebElement mylngs = driver.findElement(By.id("SIvCob"));
		
		//To find No.of language links in page
		List<WebElement> lnglinks = mylngs.findElements(By.tagName("a"));
		System.out.println("No.of language links are:" +lnglinks.size());
		System.out.println(mylngs.getText());

	}

}
