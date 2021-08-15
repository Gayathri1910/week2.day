package assignment3.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("First");
		driver.findElement(By.name("UserLastName")).sendKeys("Last");
		driver.findElement(By.name("UserEmail")).sendKeys("ggayathri091@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Sales Force Selenium");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select jobtitledropdown = new Select(jobtitle);
		jobtitledropdown.selectByValue("Customer_Service_Manager_AP");
		
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select employeesdropdown = new Select(employees);
		employeesdropdown.selectByValue("250");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countrydropdown = new Select(country);
		countrydropdown.selectByValue("AQ");
		
		WebElement checkbox = driver.findElement(By.className("checkbox-ui"));
		checkbox.click();
		
		driver.quit();
		
		
	}
	
	
	
}
