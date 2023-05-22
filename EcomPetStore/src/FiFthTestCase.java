import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FiFthTestCase extends Parameters{
  @BeforeTest
  public void BeforeTheTest() {
	  Driver.get(URL);
  }
  @Test
  public void CompletePayment() throws InterruptedException, IOException {
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement CatIcon=  Driver.findElement(By.xpath("//*[@id=\"shopify-section-featured-collections\"]/div/div/div[2]/div[2]/a/div[1]"));
	CatIcon.click();
    WebElement Item =Driver.findElement(By.xpath("//*[@id=\"CollectionSection\"]/div/div[1]/div/div[1]/div/div/a"));
    Item.click();
    WebElement BuyButton =Driver.findElement(By.xpath("//*[@id=\"AddToCartForm--product-template\"]/div[2]/div/div/div/div/button[1]"));
    BuyButton.click();
    //SetUp for the payment 
    Thread.sleep(1000);
    WebElement E_mail =Driver.findElement(By.xpath("//*[@id=\"email\"]"));
    WebElement F_Name =Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/input"));
    WebElement L_Name = Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/input"));
    WebElement Address =Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/input"));
    WebElement City =Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[5]/div[1]/div/div/input"));
    WebElement Postalcode = Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[5]/div[2]/div/div/div/input"));
    WebElement Shippment =Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[2]/div[1]/button"));
    //Sending data
    E_mail.sendKeys("ABCD@gmail.com");
    F_Name.sendKeys("AB");
    L_Name.sendKeys("CD");
    Address.sendKeys("Abdon");
    City.sendKeys("Amman");
    Postalcode.sendKeys("124516");
    Thread.sleep(2000);
    Shippment.click();
    //Selecting Random Shipping Method 
    WebElement Shipping_Method =Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div/div[1]/section/div/div[2]/fieldset/div[2]"));
    List<WebElement> List_Of_Method=Shipping_Method.findElements(By.className("B4zH6"));
    int Picks_One =rand.nextInt(0, List_Of_Method.size());
    List_Of_Method.get(Picks_One).click();
    WebElement Continue_To_Payment_Button =Driver.findElement(By.xpath("//*[@id=\"Form1\"]/div[1]/div/div/div[2]/div[1]/button"));
    Continue_To_Payment_Button.click();
    
    Thread.sleep(1000);
    //TakeScreenshot
    TakesScreenshot scrShot =((TakesScreenshot)Driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File(".//"+"MyScreenShot.png");
	FileUtils.copyFile(SrcFile, DestFile);
  }
  @AfterTest
  public void AfterTheTest() {}
}
