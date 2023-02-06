package traning.jan.project;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1stMaven {
	public static void main(String[] args) {
		try {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	
	String location = "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\MavenWrite.xlsx";
	
	XSSFWorkbook workbook = new XSSFWorkbook(location);
	XSSFSheet sheet = workbook.getSheetAt(0);
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(0);
	String data = cell.getStringCellValue();
	System.out.println(data);
	
	XSSFWorkbook workbook1 = new XSSFWorkbook(location);
	XSSFSheet sheet1 = workbook1.getSheetAt(0);
	XSSFRow row1 = sheet1.getRow(1);
	XSSFCell cell1 = row1.getCell(1);
	String data1 = cell1.getStringCellValue();
	System.out.println(data1);
	
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys(data);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(data1);
	

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
