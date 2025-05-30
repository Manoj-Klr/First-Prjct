package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Create object for web element
		WebElement myTbl=driver.findElement(By.id("customers"));
		
		//To find no.of rows
		List<WebElement> trs = myTbl.findElements(By.tagName("tr"));
		System.out.println("No.of Rows in table :" +trs.size());
		System.out.println("Company		<----------> Contact  <---------->  Country");
		for(WebElement tr:trs) {
			List<WebElement> tds = tr.findElements(By.tagName("td"));
				for(WebElement td : tds) {
					System.out.print(td.getText() + "<---------->");
					
				}
				System.out.println();
					
		}
		
	}

}
