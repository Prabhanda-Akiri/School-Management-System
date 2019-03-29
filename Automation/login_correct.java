package school_management_system.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\selenium\\\\Exe Files\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/project_new/Teacherlogin.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("radha.rani@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("radharani");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		String at =driver.getTitle();
		String et = "Teacher Home";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
	}

}
