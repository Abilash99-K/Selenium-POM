package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UTubeSearch {

	public static void main(String[] args) {
		//1)open the web browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver   driver = new ChromeDriver();
		
		//2)open URL https://www.opencart.com/
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("pawan");
		WebElement button= driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		button.click();
		
	}

}
