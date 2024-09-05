import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver edge = new EdgeDriver();
		//FirefoxDriver firefox = new FirefoxDriver();
		
		//automation sederhana untuk membuka situs ebay dan memasukan kata kunci mobile pada kolom pencarian
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("mobile");
		//lebih sederhana:  driver.findElement(By.id("gh-ac")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		//code sederhana : driver.findElement(By.id("gh-btn")).click();
		driver.close();
	}
}
