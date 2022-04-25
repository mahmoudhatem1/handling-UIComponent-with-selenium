package handlinUIcompnents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/MyChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//we have to put thread
		Thread.sleep(2000);
		
		/*
		//now we need to select element in the dropdown that opened dynmically based on user action
		//the problem is the element have the same locator
		//so we will use the concept of parent child relationship THE below we use indexing
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		//we can use also traversing
		//by cssSelector or xpath
		//using xpath
		
		*/
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		//USING CSSsELECTOR and regular expression
		 
		 Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id*='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='BLR']" )).click();
		//WE CANT USE REGULAR EXPRESSION because it matching with 2 elements so we need to be more specfiy

	}

}
