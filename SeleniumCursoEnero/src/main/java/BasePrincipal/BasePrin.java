package BasePrincipal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BasePrin {
	 
	private WebDriver driver;
	private String Gettext;
	
	public BasePrin(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void ReporteLog(String Report) {
	Reporter.log(Report);
	}
	
	public WebDriver ConfiguracionChromeDriver () {
		System.setProperty(GlobalVariablesPrin.NAME_CHROMEDRIVER,GlobalVariablesPrin.PATH_CHROMEDRIVER_);
		driver =new ChromeDriver();
		return driver;
	}
	public WebDriver SettingChrome(){
		WebDriverManager.chromedriver().setup();
		return driver;
	}
	
	public void OpenBrowser(String Url) {
		try {
		ReporteLog("Launching browser..."+Url);
		driver.get(Url);
		driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void Type(By locate, String inputext) {
		try{
		if(inputext.equals("")) {
			return;
		}
		driver.findElement(locate).sendKeys(inputext);
		}catch(Exception e) {		
		e.printStackTrace();
		}	
	}
	public void Clik (By locate) {		
	try {
		driver.findElement(locate).click();
	}catch(Exception e) {
		e.printStackTrace(); 
	    }	
    }
	
	public void implicitwait () {
	try {
	driver.manage().timeouts().implicitlyWait(GlobalVariablesPrin.STANDARD_TIMEOUT,TimeUnit.SECONDS);	     
	    }catch(TimeoutException e){
	    	e.printStackTrace();
	    }
	}
	public void Explicitwait(By locate) {
		try {
	WebDriverWait wait = new WebDriverWait(driver,GlobalVariablesPrin.STANDARD_TIME);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locate));
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public void Explicitwait(By locate, int time) {
		try {
	WebDriverWait wait = new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locate));
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public String Getext(By locate) {
	    try {	    	
		Gettext= driver.findElement(locate).getText();
		return Gettext;
	    }catch(Exception e) {
	    	e.printStackTrace();
	   return null;
	    }
	}
	
	/*
	 * Get Value from Excel
	 * @author adonai
	 * @date 03/09/2022
	 */
	public String getCellData(String excelName, int row, int column) {
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariablesPrin.PATH_EXCELDATA+excelName+".xlsx");
			// Constructs an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
	}
	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Adonai
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONData(String jsonFileObj, String jsonKey) throws FileNotFoundException {
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariablesPrin.PATH_JSONDATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	

}
