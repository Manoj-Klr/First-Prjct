package webTables;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		
		
		boolean myStatus= false;
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter ");
	    String expData = sc.nextLine();
		sc.close();
		
		
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//create object for web table
		WebElement myTable= driver.findElement(By.id("customers"));
		
		//To find number of rows in a table
		List<WebElement> tds=myTable.findElements(By.tagName("td"));
		
		for(WebElement td : tds) {
			if(td.getText().equalsIgnoreCase(expData)) {
				System.out.println("Expected data exist in a table");
				myStatus= true;
				break;
			}
		}
		
		if(myStatus== false) {
			System.out.println("Expected cell data doesn't exist");
		}
		
	}

		

	}


