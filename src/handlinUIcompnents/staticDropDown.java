package handlinUIcompnents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/MyChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//our first goal is to perform automated testing on these static dropdown depending on select attrbuide
		WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropDown);
		//we can select the element by index
		dropdown.selectByIndex(2);
		//we can select the element by value
		dropdown.selectByValue("USD");
		//to get the element
		Thread.sleep(2000);
		String valueSelected= dropdown.getFirstSelectedOption().getText();
		System.out.println(valueSelected);
		

	}

}
