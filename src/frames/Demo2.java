package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		//to switch to frame
		driver.switchTo().frame("iframeResult");
		
		//to switch to child frame
		driver.switchTo().frame(0);
		
		//To click on "Menu"
		driver.findElement(By.linkText("Menu")).click();

	}

}
