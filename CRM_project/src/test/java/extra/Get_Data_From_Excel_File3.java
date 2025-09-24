package extra;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class Get_Data_From_Excel_File3 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/ss582/OneDrive/Desktop/saurabh.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");

        for (Row row : sh) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "  ");
            }
            System.out.println();
        }
        wb.close();
    }
}

