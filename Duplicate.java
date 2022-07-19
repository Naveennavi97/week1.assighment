package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		 //click Leads
		 driver.findElement(By.linkText("Leads")).click();
		 //click create lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Enter the company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveen kumar");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swap");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Biotechnology");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Non IT to IT");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveennavichitra97@gmail.com");
		 driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("naveennavichitra97@gmail.com");

		 WebElement source1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select drop2=new Select(source1);
		 drop2.selectByVisibleText("New York");
		 driver.findElement(By.name("submitButton")).click();
			
		 
	    driver.findElement(By.className("subMenuButton")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("surya infotech");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("surya");
	    driver.findElement(By.name("submitButton")).click();
	    String title2=driver.getTitle();
	    System.out.println(title2);
	    
	    
	    
	  
		
		

	}
	}



