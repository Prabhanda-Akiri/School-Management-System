package school_management_system.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\selenium\\\\Exe Files\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/project_new/Add_student.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("sname")).sendKeys("Vasanth Kumar");
		Thread.sleep(1000);
		driver.findElement(By.name("scourse")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.name("sphone")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("sparent")).sendKeys("Kiran Kumar");
		Thread.sleep(1000);
		driver.findElement(By.name("sparentemail")).sendKeys("kumar.vasanth@gmail.com");
		Thread.sleep(1000);
		driver.findElements(By.name("gender")).get(0).click();
		Thread.sleep(1000);
		driver.findElement(By.name("paddress")).sendKeys("Srinivas Nagar, Surathkal.");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		String at =driver.getTitle();
		String et = "Admin Home";
		driver.close();
		if(!at.equalsIgnoreCase(et))
		{
			System.out.println("Invalid pattern of phone number is not accepted.\nTest Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
	}
}
