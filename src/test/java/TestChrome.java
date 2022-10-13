import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class TestChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
				
			System.out.println("Inside Before Class");
			
		
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil\\eclipse-workspace\\iNEtBankingv1\\Drivers\\chromedriver.exe");
			
			System.out.println("Step 1");
			
		//	driver=new ChromeDriver();
			
			System.out.println("Step 2");
		  
			
		driver.get("https://demoqa.com/automation-practice-form");
			
		    
		    
	}

}
