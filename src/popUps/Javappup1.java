package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javappup1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		String alrtmsg = driver.switchTo().alert().getText();
		System.out.println(alrtmsg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		//use Explictwait to pause execution for alert 
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		String alrtmsg2 = driver.switchTo().alert().getText();
		System.out.println(alrtmsg2);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

	}

}
