package practice.concepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTLoginOper {

	public static void main(String[] args) throws InterruptedException {
		
		
		// To read login credentials 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter username");
	    String uid = sc.nextLine();
	    System.out.println("Enter password");
	    String pwd = sc.nextLine();
	    sc.close();
	    
	    // To initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To perform login operation
        driver.findElement(By.name("userName")).sendKeys(uid);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("submit")).click();
        
         
        
        
	}

}
