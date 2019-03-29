package school_management_system.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int x=3000;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\selenium\\\\Exe Files\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/project_new/Adminhome.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(x);
		driver.findElement(By.linkText("Add Teacher")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("Add Student")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("Add Course")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("View/Edit Details")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("Student Details")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("View Feedback")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("about teacher")).click();
		Thread.sleep(x);
		driver.findElement(By.linkText("Upload Events")).click();
		Thread.sleep(x);
		String at =driver.getTitle();
		String et = "Upload events";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Navigation through 6 different pages is matching.\nTest Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
	}
}
