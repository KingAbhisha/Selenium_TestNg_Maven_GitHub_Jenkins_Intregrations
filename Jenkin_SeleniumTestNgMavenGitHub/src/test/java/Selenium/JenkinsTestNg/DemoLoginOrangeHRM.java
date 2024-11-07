package Selenium.JenkinsTestNg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoLoginOrangeHRM extends BaseClass {

	@Test
	public void demoLogin() {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String actualTitle = driver.getTitle();
		String expectedTitel = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitel);
	}

	@Test
	public void DemoTC01() {
		System.out.println("This is TestCase 01");
	}

	@Test
	public void DemoTC02() {
		System.out.println("This is TestCase 02");
	}
}
