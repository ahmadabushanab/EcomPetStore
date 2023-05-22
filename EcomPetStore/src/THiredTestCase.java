import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class THiredTestCase extends Parameters{
	@BeforeTest
	public void BeforeTest() {
		Driver.get(URL);
	}
	@Test
	public void Searching_For_Random_Items() {
		//Searching Process
		WebElement SearchIcon =	Driver.findElement(By.xpath("//*[@id=\"AccessibleNav\"]/li[4]/a/span/span[1]"));
		WebElement InputField =Driver.findElement(By.xpath("//*[@id=\"SearchModal\"]/form/input"));
		WebElement SearchIcon2=Driver.findElement(By.xpath("//*[@id=\"SearchModal\"]/form/span/button"));	
		SearchIcon.click();
		int RandomSearchItem = rand.nextInt(0, RandomSerach.length);
		InputField.sendKeys(RandomSerach[RandomSearchItem]);
		SearchIcon2.click();
		//Counting items
		WebElement Items_Container = Driver.findElement(By.xpath("//*[@id=\"PageContainer\"]/main/div/div/div/div"));
		List<WebElement> Items =Items_Container.findElements(By.className("grid__item"));
		System.out.println("Number of items is "+Items.size());
	}
	@AfterTest
	public void AfterTheTest() {
		
	}

}
