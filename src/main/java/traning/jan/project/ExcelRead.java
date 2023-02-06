package traning.jan.project;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) {
		String location = "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx";
		try {
			XSSFWorkbook workBook = new XSSFWorkbook(location);
			XSSFSheet sheet = workBook.getSheetAt(0);
			XSSFRow row = sheet.getRow(1);
			XSSFCell cell = row.getCell(1);
				String data = cell.getStringCellValue();
				System.out.println(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
