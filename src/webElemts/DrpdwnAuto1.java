package webElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrpdwnAuto1 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//To click on close pop up
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(4000);
		//from
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(4000);
		//To enter input in drop down
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("kurnool");
		Thread.sleep(4000);
		//To select kurnool from suggested drop downs
		driver.findElement(By.xpath("//span[text()='Kurnool']")).click();
		Thread.sleep(4000);
		
		
		//To
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(4000);
		//To enter mumbai
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("Mumbai");
		//To select mumbai
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
		
		
		
		
		

	}

}
