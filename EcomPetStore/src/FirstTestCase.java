import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase extends Parameters {
	@BeforeTest
	public void BeforeTheTest() {
		Driver.get(URL);
	}
	@Test
	public void FistTest() throws InterruptedException {
//		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Searching for cat
		WebElement SearchIcon =	Driver.findElement(By.xpath("//*[@id=\"AccessibleNav\"]/li[4]/a/span/span[1]"));
		WebElement InputField =Driver.findElement(By.xpath("//*[@id=\"SearchModal\"]/form/input"));
		WebElement SearchIcon2=Driver.findElement(By.xpath("//*[@id=\"SearchModal\"]/form/span/button"));	
		SearchIcon.click();
		InputField.sendKeys("Cat");
		SearchIcon2.click();
//		Getting all product title from the items 
		WebElement Items_Container=	Driver.findElement(By.xpath("//*[@id=\"PageContainer\"]/main/div/div/div/div"));
		List<WebElement> AllItems = Items_Container.findElements(By.className("grid-product__title"));
		for(int i = 0 ; i<AllItems.size() ;i++) {
//			;
//			myAssert.assertEquals(AllItems.get(i).getText().toString(), AllItems.get(i).getText().toString().contains("cat"));
			boolean k = false;
			if(AllItems.get(i).getText().toString().contains("Cat")||AllItems.get(i).getText().toString().contains("cat")) 	
			{
			k  = true;
			myAssert.assertEquals(k, true);
			System.out.println(AllItems.get(i).getText().toString());
			}
			
		}
		
	}
	@AfterTest
	public void AfterTest() {
			myAssert.assertAll();
	}
}
/*
 * Thread.sleep(2000);
		WebElement PageContainer = Driver.findElement(By.className("page-container"));
		WebElement Main =PageContainer.findElement(By.className("main-content"));
		WebElement DIv = Main.findElement(By.className("wrapper"));
		WebElement DIV2 =DIv.findElement(By.className("grid"));
		WebElement DIV3 = DIV2.findElement(By.className("grid-uniform"));
		List<WebElement> Container = DIV3.findElements(By.className("medium--one-half"));
//		List<WebElement> DIVS =Main.findElements(By.className("medium--one-half")); 
//		List<WebElement> Texts = ((By) DIVS).findElements(By.className("grid-product__title"));
		//Sending Data*/
 