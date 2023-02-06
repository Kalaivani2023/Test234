package traning.jan.project;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllDataExcel {
	public static void main(String[] args) {
		String location = "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx";
		try {
			XSSFWorkbook workbook = new XSSFWorkbook (location);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int noOfRows = sheet.getLastRowNum();
			System.out.println(noOfRows);
			for (int i = 0; i<noOfRows; i++) {
				XSSFRow row = sheet.getRow(i);
			int noOfCell = row.getLastCellNum();
				for (int j =0; j<noOfCell; j++) {
					XSSFCell cell = row.getCell(j);
					String data = cell.getStringCellValue();
					System.out.println(data);
				}
		}	
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
