package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html2 {

	public static void main(String[] args) throws InterruptedException {
		// develop ATS to enter mobile number and to close popup in makemytrip applicaiton popup window
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='font14 fullWidth']")).sendKeys("9848761579");
		driver.findElement(By.xpath("//*[@class='commonModal__close']")).click();

	}

}
