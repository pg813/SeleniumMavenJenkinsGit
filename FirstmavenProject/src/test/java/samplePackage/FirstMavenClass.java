package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstMavenClass {
	



	  WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumclass\\Drivers\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://sampleapp.tricentis.com/");
		
		}
	
	@Test(priority=0)
	public void test1() throws InterruptedException {
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Automobile']")).click();
		
		Select sel =new Select(driver.findElement(By.xpath("//select[@id='make']")));
		sel.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("323");
		driver.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("03/02/2020");
		sel=new Select(driver.findElement(By.xpath("//select[@id='numberofseats']")));
		sel.selectByIndex(4);
		sel=new Select(driver.findElement(By.xpath("//select[@id='fuel']")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath("//input[@id='listprice']")).sendKeys("2332");
		driver.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("3233323");
		driver.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("3233");
		driver.findElement(By.xpath("//button[ text()='Next »' ]")).click();
		
	}

}
