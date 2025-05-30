package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//create reference object for WebTable
		WebElement myTable= driver.findElement(By.id("customers"));
		List<WebElement> trs = myTable.findElements(By.tagName("tr"));
		System.out.println("No.of Rows are :" +trs.size());
		
		//to find number of td tags
		List<WebElement> tds=myTable.findElements(By.tagName("td"));
		
		for(WebElement td : tds) {
			System.out.println(td.getText());
		}


	}

}
