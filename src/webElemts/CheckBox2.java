package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		//To perform scroll bar operation by using java script executor
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(4000);
		
		//To Uncheck the 2nd checkbox
		driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
		
		

	}

}
