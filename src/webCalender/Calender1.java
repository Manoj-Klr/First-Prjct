package webCalender;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Develop ATS to select 25th October in TSRTC online application
		
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

	}

}
