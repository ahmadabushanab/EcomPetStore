import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FourthTestCase extends Parameters{
	@BeforeTest
	public void BeforeTest() {
		Driver.get(URL);
	}
	@Test
	public void Searching_For_Random_Items() throws InterruptedException {
		//Clicking the Contact Button 
		WebElement ContactButton = Driver.findElement(By.xpath("//*[@id=\"AccessibleNav\"]/li[3]/a"));
		ContactButton.click();
		//Sending info
		WebElement Name =Driver.findElement(By.id("ContactFormName"));
		WebElement E_mail =Driver.findElement(By.id("ContactFormEmail"));
		WebElement PhoneNumber = Driver.findElement(By.id("ContactFormPhone"));
		WebElement Messeage =Driver.findElement(By.id("ContactFormMessage"));
		WebElement Submit =Driver.findElement(By.className("btn"));
		Name.sendKeys("Moath");
		E_mail.sendKeys("ABC@gmail.com");
		PhoneNumber.sendKeys("123456789");
		Messeage.sendKeys("Thenks");
		Thread.sleep(2000);
		Submit.click();
	}
	@AfterTest
	public void AfterTheTest() {
		
	}
}
