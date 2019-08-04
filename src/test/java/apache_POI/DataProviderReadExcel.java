package apache_POI;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderReadExcel {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/ritakk/Desktop/Presentation.xlsx"); // path to the excel sheet
        FileInputStream file = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0); // name or index of the worksheet

        System.out.println(sheet.getLastRowNum());
        System.out.println(sheet.getRow(2).getCell(2));
        for (Row row: sheet ){
            for(Cell cell : row ){

                System.out.print(" "+ cell);
            }
            System.out.println();
        }
        System.out.println(" *****");

    }
}