package windowHndls;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		//to read first window title
		String pgTitle1=driver.getTitle();
		System.out.println("1st page title is: "+pgTitle1);
		
		//to click on Help
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(3000);
		//to read opened window handles
		Set<String> pgHandles=driver.getWindowHandles();
		//to read each window handle
		Iterator<String> winHandles = pgHandles.iterator();
		//to read window handle into variable
		String win1=winHandles.next();
		String win2=winHandles.next();
		
		System.out.println(win1);
		System.out.println(win2);
		//to focus on 2nd window
		driver.switchTo().window(win2);
		//to read second window title
		String pgTitle2=driver.getTitle();
		System.out.println("2nd page title is: "+pgTitle2);

		

	}

}
