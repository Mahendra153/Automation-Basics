package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAutomationBasics {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/register.php");
		driver.findElement(By.id("inputFirstName")).sendKeys("Mahendra");
		driver.findElement(By.id("inputLastName")).sendKeys("Prasad");
		driver.findElement(By.name("email")).sendKeys("prasadmahendra1995@gmail.com");
		driver.findElement(By.name("companyname")).sendKeys("Google");
		driver.findElement(By.name("address1")).sendKeys("Bangalore");
		driver.findElement(By.name("address2")).sendKeys("Karnataka");
		driver.findElement(By.name("city")).sendKeys("Same city");
		driver.findElement(By.name("state")).sendKeys("karnataka");
		driver.findElement(By.name("postcode")).sendKeys("123456");
		driver.findElement(By.id("customfield2")).sendKeys("1234567890");
		
	
	}

}
