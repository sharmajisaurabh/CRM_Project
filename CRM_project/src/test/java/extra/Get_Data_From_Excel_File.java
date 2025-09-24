package extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class Get_Data_From_Excel_File {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:/Users/ss582/OneDrive/Desktop/saurabh.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int lastrow = sh.getLastRowNum();
		System.out.println(lastrow);
		
		for (int i = 0; i <= lastrow; i++) {
			String v1 = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(v1);
			
		}
		wb.close();

	}

}
