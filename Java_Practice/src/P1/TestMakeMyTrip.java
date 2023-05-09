package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMakeMyTrip {
	@BeforeClass
	public static void main(String[] args)
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("WWW.Makemytrip.com");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.sendKeys("Mumbai");
		WebElement fromcity =driver.findElement(By.xpath("//p[text()='Mumbai, India']"));
		fromcity.click();
		WebElement to = driver.findElement(By.xpath("//label[@for='toCity']"));
		to.sendKeys("Bangaluru");
		WebElement tocity =driver.findElement(By.xpath("//p[text()='Bengaluru, India']"));
		tocity.click();
	}

}
