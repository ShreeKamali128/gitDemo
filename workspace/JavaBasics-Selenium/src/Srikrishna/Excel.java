package Srikrishna;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {

	public static void main(String[] args) throws Exception, Throwable {
		// TODO Auto-generated method stub

		File f = new File("./Files\\Book1.xls");
		FileInputStream inputStream = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

	//	HSSFRow row1 = sheet.getRow(1);
	//	HSSFCell cell = row1.getCell(1);

		for (int i = 0; i <= rowCount; i++) {
			int cellcount = sheet.getRow(i).getLastCellNum();
			System.out.println("Row"+ i+" data is :");
			for (int j = 0; j < cellcount; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}    //column end
			System.out.println();

		}  //row end
		
		System.out.println();
		System.out.println();
	}

}
