package PocPrincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePrincipal.BasePrin;

public class LoguinPrin extends BasePrin {

	public LoguinPrin (WebDriver driver) {
	    super (driver);
	}
	 
	/*
	 * objects
	 */
	private By txtUsuario= By.xpath("");
	private By txtPassword=By.xpath("");
	
	public void ejecucion () {
		ReporteLog("Open Browser\"OrangeHRM\" web page");
		OpenBrowser("https://opensource-demo.orangehrmlive.com/");		
	}
	
	public void loguiOragen (String arg, String args) {
	ReporteLog("login");
		
		
	}
}
