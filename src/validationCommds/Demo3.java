package validationCommds;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//To read user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Name");
		String uid = sc.nextLine();
		System.out.println("Enter password");
		String pw = sc.nextLine();
		sc.close();
		
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.xpath("/butto[@type()='submit']")).click();
		
		
		Thread.sleep(4000);
		
		try {
			if(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed()) {
				System.out.println("Successful login operation");
				//Logout
				driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
				Thread.sleep(4000);	
				driver.findElement(By.linkText("Logout")).click();
				
			}
		}
		catch (Exception e) {
			System.out.println("Unsuccessful login operation");
			//Take scrnsht
			File myFl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date dt = new Date();
			DateFormat df = new SimpleDateFormat("DD-MM-YYYY_hh-mm-ss");
			FileHandler.copy(myFl, new File("./Defects\\orng"+df.format(dt)+".png"));
		}

		
		finally {
			driver.quit();
		}
		
		
		
		
		
		
		
		
	}

}
