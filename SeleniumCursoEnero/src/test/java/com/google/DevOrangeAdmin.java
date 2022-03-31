package com.google;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class DevOrangeAdmin {

	public static WebDriver driver;
	public String username, password, msgNoRecords, userNotExist, newEmployee, newUser, newpassword, UserNameAdo,
			MensajeDelect, ComboxEstatus;

	@Test
	public void TC004_Admin_DeleteUser() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]")).sendKeys(UserNameAdo);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();

		// Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]")).getText();
		Assert.assertEquals(actualValue, UserNameAdo);

		// Step 8
		Reporter.log("Select User");
		driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectAll\"]")).click();

		// Step 9
		Reporter.log("Click Delete");
		driver.findElement(By.xpath("//*[@id=\"btnDelete\"]")).click();

		// Step 10
		Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
		String actualValue1 = driver.findElement(By.xpath("//*[@id=\"deleteConfModal\"]/div[2]/p")).getText();
		Assert.assertEquals(actualValue1, MensajeDelect);

		// Step 11
		Reporter.log("Click Ok to confirm delete user");
		driver.findElement(By.xpath("//*[@id=\"dialogDeleteBtn\"]")).click();

		// Step 12
		Reporter.log("Validate in table that user was delete successfully");
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]")).sendKeys(UserNameAdo);
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		actualValue = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue, msgNoRecords);

		// Step 13
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 14
		Reporter.log("Close Browser");
		driver.close();

	}
	@Test
	public void TC005_Admin_CreateUserDisabled() throws InterruptedException {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add");
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		// Step 6
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(newEmployee);
		
		// Step 7
		Reporter.log("Enter valid username");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(newUser);
		
		// Step 8
		Reporter.log("Change Status Disabled");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]"));
		Select sel =new Select (element);
		sel.selectByVisibleText(ComboxEstatus);
		
		// Step 9
		Reporter.log("Enter new password and confirm");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys(newpassword);
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys(newpassword);
		
		// Step 10
		Reporter.log("Click Save");		
		//Hardwait para problemas de sincronizacion 
		//Thread.sleep(2000);
		WebElement elemen= driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[10].click();", elemen);
		wait.until(ExpectedConditions.invisibilityOf(elemen));
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		
		// Step 11
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);

		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// Step 13
		Reporter.log("Verify username is Disabled Status in table");
		String actualValue = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]")).getText();
		Assert.assertEquals(actualValue, ComboxEstatus );

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();

	}
	@Test
	public void TC006_Uer_Admi() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add");
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		// Step 6
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(newEmployee);
		
		// Step 7
		Reporter.log("Enter valid username");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(newUser);
		
		// Step 8
		Reporter.log("Change Status Disabled");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]"));
		Select sel =new Select (element);
		sel.selectByVisibleText(ComboxEstatus);
		
		// Step 9
		Reporter.log("Enter new password and confirm");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys(newpassword);
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys(newpassword);
		
		// Step 10
		Reporter.log("Click Save");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

		// Step 11
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);

		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// Step 13
		Reporter.log("Verify username is Disabled Status in table");
		String actualValue = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]")).getText();
		Assert.assertEquals(actualValue, ComboxEstatus );

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();

	}


	@BeforeTest
	public void beforeTest() {
		// Test Data
		username = "Admin";
		password = "admin123";
		userNotExist = "XYZ";
		msgNoRecords = "No Records Found";
		newEmployee = "Admin A";
		newUser = "adonaiprueba10";
		newpassword = "adonai123";
		UserNameAdo = "adonai3";
		MensajeDelect = "Delete records?";
		ComboxEstatus ="Disabled";
		
		
	}

	@AfterTest
	public void afterTest() {

	}

}
