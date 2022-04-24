package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naresh\\Desktop\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.clickAndHold(source).moveToElement(des).release(des).perform();
	}

}
