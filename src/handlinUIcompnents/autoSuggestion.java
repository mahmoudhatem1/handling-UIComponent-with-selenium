package handlinUIcompnents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/MyChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//first we need to insert text
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		//then we need to loop on all the results until matching expected result
		Thread.sleep(2000);
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement option:options) {
			String valuee=option.getText();
			if(valuee.equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

	}

}
