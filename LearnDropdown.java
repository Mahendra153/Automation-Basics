package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/select.xhtml;jsessionid=node01r5y80lm3w0adgehc0jqe0bnc123075.node0");
	driver.manage().window().maximize();
	Select dd = new Select(driver.findElement(By.className("ui-selectonemenu")));
	dd.selectByVisibleText("Selenium");
}
}
