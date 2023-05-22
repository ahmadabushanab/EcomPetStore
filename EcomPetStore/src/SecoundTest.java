import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecoundTest extends Parameters{
	@BeforeTest
	public void BeforeTest() {
		Driver.get(URL);
	} 
	@Test
	public void Select_One_Item_Randomly_Test() {
		
		WebElement DogTab = Driver.findElement(By.xpath("//*[@id=\"shopify-section-featured-collections\"]/div/div/div[2]/div[1]"));
		DogTab.click();
		//Finding Product Containers to choose randomly from them 
		WebElement ProductsContainer =Driver.findElement(By.xpath("//*[@id=\"CollectionSection\"]/div"));
		List<WebElement> DIVSizes = ProductsContainer.findElements(By.className("collage-grid__row"));
		//Choosing the random container 
		int WhichCartToChooes = rand.nextInt(0, DIVSizes.size());
		//	After we choose the container we choose the product randomly based on the number of the items in it 
		WebElement ChoosenCart = DIVSizes.get(WhichCartToChooes).findElement(By.className("grid"));
		List<WebElement> ProductLsit =ChoosenCart.findElements(By.className("large--two-thirds"));
		int WhichProductToChooes = rand.nextInt(0, ProductLsit.size());
		ProductLsit.get(WhichProductToChooes).click();
		//Finding Color Containers to choose randomly from them 
		WebElement Color_Container = Driver.findElement(By.id("ProductSelect-option-0"));
		List<WebElement>Coolers= Color_Container.findElements(By.tagName("label"));
		//Choosing random color 
		int Which_Color_To_Chooes = rand.nextInt(0, Coolers.size());
		Coolers.get(Which_Color_To_Chooes).click();
		//choosing the size randomly 
		WebElement Size_Container =Driver.findElement(By.id("ProductSelect-option-1"));
		List<WebElement>Sizes =Size_Container.findElements(By.tagName("label"));
		int Which_Size_To_Choose = rand.nextInt(0, Sizes.size());
		Sizes.get(Which_Size_To_Choose).click();
	}
	@AfterTest
    public void After() {
		
	}
}
/*
 * WebElement ProductsContainer =Driver.findElement(By.xpath("//*[@id=\"CollectionSection\"]/div"));
		List<WebElement> DIVSizes = ProductsContainer.findElements(By.className("grid__row-separator"));
//		System.out.print("**********"+DIVSizes.size());
		int WhichCartToChooes = rand.nextInt(0, DIVSizes.size());
		System.out.print("**********"+WhichCartToChooes);
		WebElement ChoosenCart = DIVSizes.get(WhichCartToChooes).findElement(By.className("grid"));
		List<WebElement> ProductLsit =ChoosenCart.findElements(By.className("large--two-thirds"));
		int WhichProductToChooes = rand.nextInt(0, DIVSizes.size());
		 ProductLsit.get(WhichProductToChooes).click();
 */
