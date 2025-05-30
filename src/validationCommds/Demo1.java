package validationCommds;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		//Develop ATS to verify Telugu link displayed or not before and after click on that link in Google home page and 
		//also provide screenshot of application after click on Telugu link
		
		//Initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before selection of Telugu link");
		if(driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
		System.out.println("Telugu link visible");

		//To click on Telugu link
		driver.findElement(By.linkText("తెలుగు")).click();
		}
		else {
				System.out.println("Telugu link is invisible");
				System.exit(0);
		}
		
		System.out.println("After selection of Telugu link");
		try {
			if (driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
			System.out.println("Telugu link visible");
			
		}

	}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Telugu link is invisible");
		}
		finally {
			File myFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date dt = new Date();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy-hh/mm/ss");
			FileHandler.copy(myFile, new File("./Defects\\\\Google\"+df.format(dt)+\".png"));
			
		}
	}
}


