package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SecondClass extends FirstMavenClass {
	
	
	
	@Test(priority=1)
	public void InsuranceData() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("First Name")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='birthdate' ]")).sendKeys("11/12/1994");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span")).click();
		driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("abc");
	   Select sel=new Select(driver.findElement(By.xpath("//select[@id='country']")));
	   sel.selectByValue("India");
		 driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("121212");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		sel=new Select(driver.findElement(By.xpath("//select[@id='occupation']")));
		sel.selectByIndex(4);
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();
		driver.findElement(By.xpath("//input[@id='website']")).sendKeys("abc.com");
		
		
		driver.findElement(By.xpath("//button[@name='Next (Enter Product Data)']")).click();
		
		
		

}
}