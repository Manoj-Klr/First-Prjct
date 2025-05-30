package practice.concepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcacebbk {

	public static void main(String[] args) throws InterruptedException {
		
		// To read login credentils
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String usrnm = sc.nextLine();
		System.out.println("Enter password");
		String pwd = sc.nextLine();
		sc.close();
		
		// To initial browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// To perform login operation 
		driver.findElement(By.name("email")).sendKeys(usrnm);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
		// To read pagetitle
		String pgtl = driver.getTitle();
		
		// To verify pgttle
		
		if (pgtl.equals("Log in to Facebook"))
		{
			System.out.println("Unsuccessfull Login operation");
		}
		
		else {
			System.out.println("Successfull login oeration");
		}
		
		

	}

}
