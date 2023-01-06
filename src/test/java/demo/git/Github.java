package demo.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Github {

WebDriver driver;
	@BeforeMethod
	public void one() {
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	}
@Test
public void tast() {
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.linkText("compendiumdev")).click();
	String text = driver.findElement(By.id("para1")).getText();
	System.out.println(text);
}
}
