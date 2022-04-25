package handlinUIcompnents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/MyChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//we will use the method isSelected to check whether the element is selected or not the type of return is boolean(true or false)
		boolean checkBefore=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.println(checkBefore);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(2000);
		boolean checkAfter=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.println(checkAfter);
		//we need to get the total number of check boxes in this page
		//the way to doing that is by access to generic locator that is located in all checkboxes elements
		//type checkbox is generic locator in all checkboxes elements
		int totalNumberOfCheckBoxes= driver.findElements(By.cssSelector("input[type='checkbox']")).size();

		System.out.println( totalNumberOfCheckBoxes);
	}

}
