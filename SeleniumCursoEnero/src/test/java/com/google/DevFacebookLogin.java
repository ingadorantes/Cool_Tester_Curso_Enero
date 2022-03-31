package com.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DevFacebookLogin {
	
	public static WebDriver driver;
  @Test
  public void faceBookTest() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://es-la.facebook.com/login/device-based/regular/login/");
	  driver.manage().window().maximize();
	  //driver.getTitle(); // Iniciar sesión en Facebook
	  Assert.assertEquals(driver.getTitle(), "Iniciar sesión en Facebook");
	  
  }
  @BeforeTest
  public void beforeTest() {//antes 
  }

  @AfterTest
  public void afterTest() {//despues
  
	  driver.close();
  }

}
