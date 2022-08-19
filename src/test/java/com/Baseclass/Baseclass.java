package com.Baseclass;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static Actions a;
	public static Alert al;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;
	public static WebElement w;
	public static TakesScreenshot ts;
	
	// 1.method for creating driver launch(WEBDRIVER INTERFACE)
	public static void driverLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	}
	
	//1.a(browser close)
	public static void driverClose() {
	 driver.close();

	}
	//2.method for url(WEBDRIVER INTERFACE)
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	//3.getting current url(WEBDRIVER INTERFACE)
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
	}
	//4.maximize the window(WEBDRIVER INTERFACE)
	public static void maxiMize() {
		driver.manage().window().maximize();

	}
	//5.gettitle(WEBDRIVER INTERFACE)
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	//6.getText(WEBELEMENT INTERFACE)
	public static void getText(WebElement text) {
		String text2 = w.getText();
		System.out.println(text2);

	}
	//7.getattribute(WEBELEMENT INTERFACE)
	public static void getAttribute(WebElement text) {
		String attribute = w.getAttribute("value");
		System.out.println(attribute);

	}
	//8.sendkeys(WEBELEMENT INTERFACE)
	public static void sendKeys(WebElement e,String Stringname) {
		e.sendKeys(Stringname);

	}
	//9.click(WEBELEMENT INTERFACE)
	public static void click(WebElement element) {
		element.click();

	}
	//10.mouse movement(ACTIONS CLASS)
	public static void mouseHover(WebElement target ) {
		a= new Actions(driver);
		a.moveToElement(target).perform();
		
	}
	//11.dragdrop(ACTIONS CLASS)
	public static void dragandDrop(WebElement source,WebElement target) {
		a=new Actions(driver);
		a.dragAndDrop(source, target);

	}
	//12.mouse key up (ACTIONS CLASS)
	/*private void upKey(WebElement target) {
		a= new Actions(driver);
		a.keyUp(target).perform();

	}
	//13.mouse down move(ACTIONS CLASS)
	private void keyDown(WebElement target) {
		a= new Actions(driver);
		a.keyDown(target).perform();

	}*/
	//14.doubleclick(ACTIONS CLASS)
	public static void twoClick(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();

	}
	//15.contextclick(ACTIONS CLASS)
	public static void rightClick(WebElement target) {
		a= new Actions(driver);
		a.doubleClick(target);

	}
	//16.aceept alert(ALERT CLASS)
	public static void alertAceept() {
		al=driver.switchTo().alert();
		al.accept();

	}
	//17.dismiss alert(ALERT CLASS)
	public static void alertDismiss() {
		al=driver.switchTo().alert();
		al.dismiss();

	}
	//18.alertsendkeys(ALERT CLASS)
	public static void alertSendkeys(String text) {
		al=driver.switchTo().alert();
		al.sendKeys(text);

	}
	//19.alertgettext(ALERT CLASS)
	public static void alertGettext() {
		al=driver.switchTo().alert();
	 String text = al.getText();
     System.out.println(text);
	}
	//20.javascript(JAVASCRIPT EXECUTOR INTERFACE)
	public static void javascript(String scriptkey,WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object script = js.executeScript(scriptkey, ref);

	}
	//21.javascript getattributes(JAVASCRIPT EXECUTOR INTERFACE)
	public static void getAttribute(String scriptkey,WebElement ref) {
		js=(JavascriptExecutor) driver;
		Object get = js.executeScript(scriptkey, ref);
		System.out.println(get);

	}
	
	//22.screenshots(SCREENSHOTS)
	public static void screenShots(String image) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\screenshot"+image+".png");
		FileUtils.copyFileToDirectory(source, dest);

	}
	//23.selectbyvisibiletext(SELECT CLASS)
	 public static void selectbyvisibleTEXT(WebElement element,String text) {
		 s = new Select(element);
		 s.selectByVisibleText(text);
		

	}
	 //23.select by index(SELECT CLASS)
	 public static void selectbyIndex(WebElement e,int i) {
		s= new Select(e);
		s.selectByIndex(i);

	}
	 //24.select by value(SELECT CLASS)
	 public static  void selectbyValue(WebElement element,String i) {
		 s = new Select(element);
		 s.selectByValue(i);

	}
	//25.ismultiple(SELECT CLASS)
	 public static void isMultiple(WebElement element) {
		s = new Select(element);
		if (s.isMultiple()) {
			System.out.println("multiple selection");
		}
		else {
			System.out.println("single selection");
		}
	}
	 //26.getallselected options(SELECT CLASS)
	 public static void getallselectedOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
for (WebElement links : allSelectedOptions) {
	System.out.println(links.getText());
	
}
	}
	 //27.getfirstselectedoptions(SELECT CLASS)
	public static void getfirstselectedOptions(WebElement element) {
		s = new Select(element);
WebElement option = s.getFirstSelectedOption();
System.out.println(option.getText());
	}
	//28.deselect by value(SELECT CLASS)
	public static void deselectbyValue(WebElement element,String i) {
		s = new Select(element);
		s.deselectByValue(i);

	}
	//29.deselect by index(SELECT CLASS)
	public static void deselectbyIndex(WebElement element,int e) {
		s = new Select(element);
		s.deselectByIndex(e);

	}
	//30.deselect by visibletext(SELECT CLASS)
	public static void deselectbyvisibleText(WebElement element,String text) {
		s= new Select(element);
		s.deselectByVisibleText(text);

	}
	//31.deselectall(SELECT CLASS)
	public static void deselectAll(WebElement element) {
		s= new Select(element);
		s.deselectAll();

	}
	// 32.datadriven
	 public static String excelgetData(int rownumber,int cellnumber ,String sheetname,String filename) throws IOException {
		//to locate the file
			File file = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\"+filename+".xlsx");
			
			//to read the ile
			FileInputStream fin = new FileInputStream(file);
			
			//define the workbook
			Workbook w = new XSSFWorkbook(fin);
			
			//to get the sheet
			Sheet sheet = w.getSheet(sheetname);
			
			
				
				Row row = sheet.getRow(rownumber);
				String value = "";
				
		
					Cell cell = row.getCell(cellnumber);
					
					int cellType = cell.getCellType();
					
					
					//celltypes=1---->stringcell
					//celltype other than one---->numeric or data cell value
					if (cellType==1) {
						
						 value = cell.getStringCellValue();
						
						
					}
					else if (DateUtil.isCellDateFormatted(cell)) {
						
						//to get the date cell value
						java.util.Date dateCellValue = cell.getDateCellValue();
						//define the date format
						
						SimpleDateFormat sim = new SimpleDateFormat("dd-MMMM-yyyy");
						
						//fetch into cell
						 value = sim.format(dateCellValue);
						 
						
					}else {
						double numericCellValue = cell.getNumericCellValue();
						//doublesize--->8//long size----->8
						//new datatype variable = (newdatatype)variable;
						long l = (long) numericCellValue;
						//convert to string
						 value = String.valueOf(l);
					}
					System.out.println(value);
				
				
			
			return value;
		}

	}

		

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

