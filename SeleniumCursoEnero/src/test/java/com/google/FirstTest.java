package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	public static WebDriver driver;

  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void googleTest() {//throws InterruptedException {
	  
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://computer-database.gatling.io/computers");
		driver.manage().window().maximize();
		 String res;
		for (int i=1;i<4;i++) {
			if(i==1) {
			res =driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]/td["+i+"]/a")).getText();
			}else {
	        res =driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]/td["+i+"]")).getText();
	    }
		System.out.println(res);
		}
		
		
	    //driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]/td[1]/a")).getText();
		//driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]/td[2]")).getText();
		//driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]/td[3]")).getText();
		//driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]/td[4]")).getText();
		
		//Assert.assertEquals(driver.getTitle(), "Google");

  }
  @Test
  public void googleTest1() {//throws InterruptedException {
	  	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
