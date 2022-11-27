package paralleltesting;

import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ParallelTesting_1 {

	    ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();

	    @Before
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "/Users/bayro/OneDrive/Documentos/Documents/Calidad_de_Software/Demo_2/chromedriver.exe/");
	        driver.set(new ChromeDriver());
	        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }

	    public WebDriver getDriver(){
	    	
	        return driver.get();       
	    }
		
		@Test
		public void testGooglePage() {
			
			getDriver().get("https://www.disneyplus.com/login");
			getDriver().findElement(By.name("email")).sendKeys("Joselito");
			getDriver().findElement(By.cssSelector("#dssLogin > div:nth-child(4) > button")).click(); /*se ubica por un copy y da click*/
	        
		}
		@Test
		public void testGooglePage1() {
			
			getDriver().get("https://www.disneyplus.com/login");
			getDriver().findElement(By.name("email")).sendKeys("Juanito");
			getDriver().findElement(By.cssSelector("#dssLogin > div:nth-child(4) > button")).click(); /*se ubica por un copy y da click*/
		}
		@After
	    public void tearDown() {
	        getDriver().quit();
	    }
		
	}
	

