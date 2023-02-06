package traning.jan.project;

import java.io.IOException;

public class ErrorFixing extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserLaunch("chrome");
		excelGetCellData(2, 1);
		System.out.println();
	}

}
