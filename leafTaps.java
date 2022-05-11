package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafTaps {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("infy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aswin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement eleform = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1=new Select(eleform);
		dd1.selectByVisibleText("Employee");
		WebElement eleorm2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2=new Select(eleorm2);
		dd2.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aswin");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("24/06/2000");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("70000.00");
		WebElement eleform3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3=new Select(eleform3);
		dd3.selectByVisibleText("INR - Indian Rupee");
		WebElement eleform4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4=new Select(eleform4);
		dd4.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		WebElement eleform5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5=new Select(eleform5);
		dd5.selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6865");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome everyone!");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Read all the instructions carefully");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7904836951");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raviaswin2406@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Aswin");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1/151 Perarignar anna nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("pongupalayam(po),PN road");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tiruppur");
		WebElement eleform7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd7=new Select(eleform7);
		dd7.selectByVisibleText("India");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641666");
		
		WebElement eleform6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6=new Select(eleform6);
		dd6.selectByVisibleText("TAMILNADU");
		
		driver.findElement(By.className("smallSubmit")).click();
		String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text1);
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
