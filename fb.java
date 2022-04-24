package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naresh\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("naresh30@gmail.com");
		  //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123@456");
		  //driver.findElement(By.xpath("//*[@id=\"u_0_d_cT\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Naresh");
		driver.findElement(By.name("lastname")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("7866409786");
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByValue("30");
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByValue("8");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByValue("1998");
		
	}

}
