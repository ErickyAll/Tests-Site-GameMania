
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSitesSenai {
	private WebDriver driver;
	
	@Before
	public void openWebBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://game-mania-br.netlify.app/");
		driver.findElement(By.className("info-link")).click();
		driver.findElement(By.id("login-submit")).click();
	}

@Test
public void testWebbrowser() {
	
	String[] keyList = {"key1", "xpt", "anotherKey", "12345"};
	
	
	for(int t = 0; t < keyList.length; t++) {
		
		try {
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("password")).clear();
			
			driver.findElement(By.id("email")).sendKeys("erick@almeida.com");
			driver.findElement(By.id("password")).sendKeys(keyList[t]);
			
			driver.findElement(By.id("signin")).click();
			
			Thread.sleep(3000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
			
	
	}
	

}
}
