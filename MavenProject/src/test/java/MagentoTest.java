import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.maven.Home;
import com.abc.maven.Login;
import com.abc.maven.Logout;

public class MagentoTest {
@Test
public void magento()
{
		
		String url="http://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
      Home h=new Home(driver);
      h.ClickonMyacc();
      
      Login l1=new Login(driver);
      l1.typeEmail("nitinmanjunath1991@gmail.com");
      l1.typePass("Welcome123");
      l1.Clickonlogin();
      
      Logout l2=new Logout(driver);
      l2.ClickonLogout();
      
      driver.quit();
      
}

}
