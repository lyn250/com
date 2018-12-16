package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inicio {

	
	WebDriver driver;
	 WebDriverWait wait;
	 
	
	
	@FindBy(name="LoginEmailId")
		WebElement login;
	
	@FindBy(id="loginPassword")
		WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginClick\"]")
		WebElement bntIngresar;


		
	
	
	public inicio (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }
	
	
	
	public void setUsuario(String usuario) {
		login.clear();
		login.sendKeys("usuario");
				
	}
	
	public void setPassword (String password) {
		this.password.clear();
		this.password.sendKeys("password");
		
	}
	public void setClickIngresar () {
		
		bntIngresar.click();
	}
	
	

		
	
	public void iniciarSesion(String usuario, String password ) {
		this.setUsuario(usuario);
		this.setPassword(password);
		this.setClickIngresar();
	}
	
	public void iniciarSesionLyn () {
		this.iniciarSesion("lyn250@gmail.com", "16006779");
	}
	
	
	
}
