package assignment3.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args)
	 {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		
		String firstname=driver.getTitle();
		System.out.println(firstname);
		
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");
		
		
		
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(dropdown1);
		dropdown.selectByIndex(4);
		
		WebElement dropdownmarketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(dropdownmarketing);
		dropdown2.selectByValue("DEMO_MKTG_CAMP");
		
		WebElement dropdownindustry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown3 = new Select(dropdownindustry);
		dropdown3.selectByVisibleText("E-tailer");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("title");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local First Name");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Local Last Name");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/09/1994");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dept");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
		
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipdropdown = new Select(ownership);
		ownershipdropdown.selectByVisibleText("LLC/LLP");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ticker");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hasdhjajsdh jksdhfjdhfj");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("important note text field");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC Code");
		
		
		WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("33646");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("231");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("56");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("person");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
		
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("General Name");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Attention Name");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("General Address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("General Address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("General City");
		
		WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateprovince = new Select(statedropdown);
		stateprovince.selectByVisibleText("Arizona");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600091");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("931");
		
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countrydropdown = new Select(Country);
		countrydropdown.selectByValue("ASM");
		
		driver.findElement(By.name("submitButton")).click();
		
		WebElement viewlead = driver.findElement(By.id("sectionHeaderTitle_leads"));
		Select viewleadtitle = new Select(viewlead);
		System.out.println(viewleadtitle);
		
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}

