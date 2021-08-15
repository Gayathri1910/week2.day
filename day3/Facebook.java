package assignment3.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Create New Account").click();
		driver.findElement(By.name("firstname")).sendKeys("first name");
		driver.findElement(By.name("lastname")).sendKeys("last name");
		driver.findElement(By.name("reg_email__")).sendKeys("ggayathri091@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("vedith1910");
		
		WebElement day = driver.findElement(By.id("day"));
		Select daydropdown = new Select(day);
		daydropdown.selectByValue("2");
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthdropdown = new Select(month);
		monthdropdown.selectByIndex(10);
		
		WebElement year = driver.findElement(By.id("year"));
		Select yeardropdown = new Select(year);
		yeardropdown.selectByVisibleText("1994");
		
		WebElement radio = driver.findElement(By.id("u_6_4_a9"));
		radio.click();
		
		
	}

}
