package traning.jan.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\MavenWrite.xlsx";
		try {
		File f = new File(location);
		FileInputStream fileInp = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInp);
		XSSFSheet sheet = workbook.createSheet("Project4");
		XSSFRow rows = sheet.createRow(0);
		XSSFCell cell= rows.createCell(0);
		cell.setCellValue("Kalai");
	
		File f1 = new File(location);
		FileOutputStream f3 = new FileOutputStream(f1);
		workbook.write(f3);
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
