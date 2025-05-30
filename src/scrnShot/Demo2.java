package scrnShot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//develop ATS to capture only login form
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement el = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		File myFl = ((TakesScreenshot)el).getScreenshotAs(OutputType.FILE);
		Date dt = new Date();
		DateFormat df = new SimpleDateFormat("dd mm yyyy");
		FileHandler.copy(myFl, new File("./Defects\\demo2"+df.format(dt)+".png"));
		
		

	}

}
