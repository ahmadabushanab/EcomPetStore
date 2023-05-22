import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
	SoftAssert myAssert = new SoftAssert();
	WebDriver Driver=new ChromeDriver();
	String  URL ="https://ecom-pet-store.myshopify.com/";
	Random rand = new Random();
	String [] RandomSerach = {"dogs","cats","fish","RABBITS"};

	

}
