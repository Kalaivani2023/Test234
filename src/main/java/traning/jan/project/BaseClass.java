package traning.jan.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static WebDriver driver;
	public static void browserLaunch(String browser) {
		switch(browser) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		}
	}
		public static void launchUrl(String Url) {
			driver.get(Url);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void close() {
			driver.close();
		}
		public static void sleepTime(int time) throws InterruptedException{
			Thread.sleep(time);
		}
		
		public static void getAttribute(WebElement element) {
			String getAtt = element.getAttribute(null);
			System.out.println(getAtt);
			//return;
		}
		public static void PageSource() {
			String pageSrc = driver.getPageSource();
			System.out.println(pageSrc);
			//return;
		}
		public static void getWinHand() {
		String getWindowHandle = driver.getWindowHandle();
		System.out.println(getWindowHandle);
		//return;
		}
		public static void getWinHandles() {
			String parentId = driver.getWindowHandle();
			System.out.println(parentId);
			
			Set<String> WindowHandles = driver.getWindowHandles();
			for (String childId : WindowHandles) {
				System.out.println("List ot childID :"+childId);
			}
		}
		public static void navigate() {	
		driver.navigate();
		}
		public static void quit() {
		driver.quit();
	}
	
	public static Select sel;
	public static void selectByIndex(WebElement element, int index) {
		sel = new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByValue(WebElement element, String value) {
		sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element, String text) {
		sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void getAllSelectedOptions(WebElement element) {
		sel = new Select(element);
		sel.getAllSelectedOptions();
}
	public static void getOptions() {
	sel.getOptions();
	}
	public static void getFirstSelectedOption() {
	sel.getFirstSelectedOption();
	}
	public static void deselectAll() {
	sel.deselectAll();
	}
	public static void deselectByIndex() {
		sel.deselectByIndex(0);
	}
	public static void deselectByVisibleText() {
		sel.deselectByVisibleText(null);
	}
	public static void isMultiple() {
		sel.isMultiple();
	}
	public static void getText(WebElement element) {
		String data = element.getText();
		System.out.println(data);
	}
	public static void getattribute(WebElement element) {
		String data1 = element.getAttribute("value");
		System.out.println(data1);
	}

	public static void getCssValue(WebElement element) {
		String fontSize = element.getCssValue("fontSize");
		String fontColour = element.getCssValue("fontColour");		
		String fontFamily = element.getCssValue("fontFamily");
		String backgroundColour = element.getCssValue("backgroundColour");
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void dataSend(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void submit(WebElement element) {
		element.submit();
	}
	public static void isEnable(WebElement element) {
		element.isEnabled();	
	}
	
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
}
	public static void confirmAlert(String option) {
		switch(option) {
		case "accept":
			driver.switchTo().alert().accept();
			break;
		case "dimiss":
			driver.switchTo().alert().dismiss();
			break;
		case "Ok":
			driver.switchTo().alert().accept();
			break;
		}
	}
		public static void mouseOver(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element);		
		}
		public static void doubleClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element);
		}
		public static void contextClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.contextClick(element);
		}
		public static void hashCode(WebElement element) {
			int hashCode = element.hashCode();
			System.out.println(hashCode);
}
		public static void dragAndDrog(WebElement source, WebElement destiny) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destiny);
		}
		public static void javaExecutor() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("windows.ScrollBy(0,0)");
}
		public static String Date() {
 			Date d = new Date ();
 			SimpleDateFormat sdf = new SimpleDateFormat("DD_MM_YYYY_hh_mm_ss");
 			String dateAndTime = sdf.format(d);
 			return dateAndTime;
		}
		public static void scrnShot(String string) throws IOException {
			TakesScreenshot scrnShot = (TakesScreenshot) driver;
			File from = scrnShot.getScreenshotAs(OutputType.FILE);
			File to = new File (string);
			FileHandler.copy(from, to);
			
		}
		public static String readData (String path, int sheet, int rowNum, int columnNum) throws IOException {
			String location = path;
			XSSFWorkbook workBook = new XSSFWorkbook(location);
			XSSFSheet sheet1 = workBook.getSheetAt(sheet);
			XSSFRow row = sheet1.getRow(rowNum);
			XSSFCell cell = row.getCell(columnNum);
				String data = cell.getStringCellValue();
				System.out.println(data);
				return data;
		}
		
public static ExtentSparkReporter reporter;
public static ExtentReports extent;
public static ExtentTest test;
		

}

		
