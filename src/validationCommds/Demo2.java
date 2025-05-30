package validationCommds;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// To initialize Browser
				WebDriver driver = new ChromeDriver();
				driver.get("https://google.co.in");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				System.out.println("Before click on Telugu link");
				if (driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
					System.out.println("Telugu link is Visible in page");
				}
				else 
				{
					System.out.println("Telugu link invisible in page");
				}
				
				//To click on telugu link
				driver.findElement(By.linkText("తెలుగు")).click();
				System.out.println("After click on telugu link");
				List<WebElement> tlglinks = driver.findElements(By.linkText("తెలుగు"));
				int n = tlglinks.size();
				if (n != 0) {
					System.out.println("Telugu link is Visible in page");
				}
				else {
					System.out.println("Telugu link invisible in page");
				}
				
				File myFl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Date dt = new Date();
				DateFormat df = new SimpleDateFormat("DD-MM-YYYY....hh-mm-ss");
				FileHandler.copy(myFl, new File("./Defects\\ggl"+df.format(dt)+".png"));

	}

}
