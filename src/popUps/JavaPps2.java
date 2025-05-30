package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaPps2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().sendKeys("Manoj kumar");
		System.out.println("Value entered");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//To verify entered value and values in page are same or not
		//To read value from page
		String actvl = driver.findElement(By.id("result")).getText();
		if (actvl.contains("Manoj kumar")) {
			System.out.println("entered value and page value both are same");
			
		}
		
		else {
			System.out.println("Expected value does not exist");
		}

	}

}
