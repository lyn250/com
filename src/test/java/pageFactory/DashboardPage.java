package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	

	@FindBy(xpath="//*[@id=\"header\"]/nav/div[1]/div/div[2]/a[2]/i")
		WebElement bntcuenta;
	
	
	
	
	
	public void setClickCuenta() {
		bntcuenta.click();
		
	}
	

	
	public DashboardPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
           
       
    }
	
	
	public void clickInicio() {
		this.setClickCuenta();
	}
}
