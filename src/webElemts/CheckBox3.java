package webElemts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox3 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		//To perform scroll bar operation by using javascript executor
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(4000);
		
		//To address all the check boxes
		List<WebElement> chkbxs = driver.findElements(By.name("Checkbox"));
		System.out.println("No.of Check Boxes are :" +chkbxs.size());
		
		//To read all check boxes one by one
		for (WebElement chkbx : chkbxs) {
			if (!chkbx.isSelected()) {
				chkbx.click();
				Thread.sleep(4000);
				
			}
		}
		

	}

}
