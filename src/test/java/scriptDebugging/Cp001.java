package scriptDebugging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageFactory.DashboardPage;
import pageFactory.inicio;

public class Cp001 {
	static String driverPath = "libs/webdriver/chromedriver.exe";	
	static String TipoWebdriver = "webdriver.chrome.driver";
	
	inicio objLogin;
	DashboardPage objDashbord;
	
	
  @Test
  public void f() throws InterruptedException {
	    System.setProperty(TipoWebdriver, driverPath);
	  	WebDriver driver = new ChromeDriver();
		try {
		  	driver.manage().window().maximize();
		  	driver.get("https://www.falabella.com/falabella-cl/");
		  	objLogin = new inicio(driver);
		  	objLogin.iniciarSesionLyn();
		  	Thread.sleep(4000);
			
			
		/*	String obtenido = objDashboard.getlinkMenuCuentaText();
			String esperado = "Welcome Admin";
			Assert.assertEquals(obtenido, esperado, "Prueba fallida debido a que el resultado obtenido y el esperado no coinciden.");*/
		  	
		} finally {
			if(driver != null) {
	           driver.quit();
			}
		}
	  }
	  
	  
	  
	  
  
}
