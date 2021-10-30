package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClassMain {
	  static WebDriver driver;

	public static void getDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	

	public static WebElement locator(String type, String attributevalue) {
		if (type.equals("id")) {
			WebElement findElement = driver.findElement(By.id(attributevalue));
			return findElement;
		} else if (type.equals("name")) {
			WebElement findElement = driver.findElement(By.name(attributevalue));
			return findElement;
		} else {
			WebElement findElement = driver.findElement(By.xpath(attributevalue));
			return findElement;
		}
		
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static String getAttritbute(WebElement element) {
		String data = element.getAttribute("value");
		return data;
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void getTitle() {
		driver.getTitle();
	}
	public static String getText(WebElement element) {
		String data = element.getText();
		return data;
	}
	public static  void getcurrenturl() {
		driver.getCurrentUrl();
	}
	public static Select dropDown(WebElement locator) {
		Select select=new Select(locator);
		return select;
		
	}
   
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	public static  void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateBackward() {
		driver.navigate().back();
	}
	
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static  void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void setSize(int a, int b) {
		Dimension d= new Dimension(a,b);
		driver.manage().window().setSize(d);
	}
	public static void setPosition(int a, int b) {
		Point p= new Point(a,b);
		driver.manage().window().setPosition(p);
	}
	public static  void closeBrowser() {
		driver.close();
	}
	public static void closeAllBrowser() {
		driver.quit();
	}
	
	
	public static void actionsBymovetoelement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void actionsByclick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}
	public  void actionsBycontextclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	public static void actionsBydoubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element);
	}
	public static void actionsBydraganddrop(WebElement element,WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1);
	}
	public static void actionsByclickandhold(WebElement element,WebElement element1) {
		Actions a = new Actions(driver);
		a.clickAndHold(element).moveToElement(element1).release().perform();
	}
	public static void alertByAccept() {
		Alert a= driver.switchTo().alert();
		a.accept();
	}
	public static void alertByDismiss() {
		Alert a= driver.switchTo().alert();
		a.dismiss();
	}
	public static void alertByGetText() {
		Alert a= driver.switchTo().alert();
		String data = a.getText();
		System.out.println(data);
	}
	public static void alertBySendkeys(String data) {
		Alert a= driver.switchTo().alert();
		a.sendKeys(data);
	}
	public static void javascriptExecutorscrolldownByPixel(int a, int b) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(a,b)");
	}
	public static  void javascriptExecutorscrollupByPixel(int a, int b) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(a,b)");
	}
	public static void javascriptExecutorscrolldownByWebElement(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoview(true)",element);
	}
	public static void javascriptExecutorscrollupByWebElement(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoview(flase)",element);
	}
	public static void javascriptExecutorscrolldownByPassText(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].SetAttribute('value','hello')",element);
	}
	public static void javascriptExecutorscrolldownByClick(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
	}
	public static void javascriptExecutorscrolldownByHighlightinhWebElement(String data,String data1,int a,String data2,WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].SetAttribute('Style','background:data;border:data1 apx data2');",element);
	}
	
	public static void selectByIndex(WebElement element,int a) {
		Select s= new Select(element);
		s.selectByIndex(a);
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void selectByVisibleText(WebElement element,String data) {
		Select s= new Select(element);
		s.selectByVisibleText(data);
	}
	public static void selectByValue(WebElement element,String data) {
		Select s= new Select(element);
		s.selectByValue(data);
	}
	public static void deselectByIndex(WebElement element,int a) {
		Select s= new Select(element);
		s.deselectByIndex(a);
	}
	public static void deselectByVisibleText(WebElement element,String data) {
		Select s= new Select(element);
		s.deselectByVisibleText(data);
	}
	public static void deselectByValue(WebElement element,String data) {
		Select s= new Select(element);
		s.deselectByValue(data);
	}
	public static void deselectAll(WebElement element) {
		Select s= new Select(element);
		s.deselectAll();
	}
	
	public static void frameByIndex(int a) {
		driver.switchTo().frame(a);
	}
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
}
	public static String excelRead(String path , String sheetname , int rownum , int cellnum) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		
		if (cellType==1) {
			String data = cell.getStringCellValue();
			return data;	
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/YYYY");
		    String data = d.format(dateCellValue);
		    return data;
		}
		
		else {
			double numericCellValue = cell.getNumericCellValue();
		    Long l = (long) numericCellValue;
		    String data = String.valueOf(l);
		    return data; 
		}
	}
	
   public static void writeExcel(String path , String sheetname , int row , int cell , String data) throws IOException {
  	 File f = new File (path);
  	 Workbook w = new XSSFWorkbook();
  	 Sheet createSheet = w.createSheet(sheetname);
  	 Row createRow = createSheet.createRow(row);
  	 Cell createCell = createRow.createCell(cell);
  	 createCell.setCellValue(data);
  	 FileOutputStream stream = new FileOutputStream(f);
  	 w.write(stream);	
	}	
}

