package scrnShot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Write program to take screenshot of FB application home page and save file with date stamp
		
		
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		File mFl= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//save File
		FileHandler.copy(mFl, new File("./Defects\\demo.png"));
		
		

	}

}
