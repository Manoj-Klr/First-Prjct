package practice.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csc {

	public static void main(String[] args) throws InterruptedException {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://digitalseva.csc.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// To perform login operation
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[2]/ul/li[2]/a/strong")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("csclogin")).sendKeys("676756750013");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Mohan%12345");
		

		
		

	}

}
