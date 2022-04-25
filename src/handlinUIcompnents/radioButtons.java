package handlinUIcompnents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/MyChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//As we observing when selected the round trip button the return date display is change an allowed to us to set returned date
		//we need to check whether these scenario is done or not
		String beforeClick= driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		System.out.println(beforeClick);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		String afterClick= driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
	
		System.out.println(afterClick);
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("Roundtrib is clicked and the return date is opened and allowed to set");
		}else {
			System.out.println("RoundTrip button is not worked as expected");
		}
		
	}

}
