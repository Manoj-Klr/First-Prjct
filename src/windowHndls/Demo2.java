package windowHndls;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		String w1="";
		String w2="";
		//To Initialize browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		String pgTitle=driver.getTitle();
		System.out.println(pgTitle);
		
		List<WebElement> pgLinks= driver.findElements(By.tagName("a"));
		System.out.println(pgLinks.size());
		
		 for(int i= 0; i<= pgLinks.size()-1; i++) {
			 String pgLink=pgLinks.get(i).getText();
			 if(!pgLink.isEmpty()) {
				 pgLinks.get(i).click();
				 Thread.sleep(5000);
				 Set<String> pgHandles= driver.getWindowHandles();
				 if(pgHandles.size()==2) {
					 Iterator<String>winHandles=pgHandles.iterator();
					 w1= winHandles.next();
					 w2=winHandles.next();
					 driver.switchTo().window(w2);
					 
				 }
				 pgTitle=driver.getTitle();
				 System.out.println(pgTitle);
				 if(pgHandles.size()==2) {
					 driver.close();
					 driver.switchTo().window(w1);
					 
					 
				 }
				 else {
					 
					 driver.navigate().back(); 
				 }
				 
				 driver.navigate().to("https://login.salesforce.com");
				 pgLinks= driver.findElements(By.tagName("a"));

	}

}
	}
}
