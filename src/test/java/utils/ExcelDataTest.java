package utils;

import com.mysql.cj.x.protobuf.MysqlxExpr;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataTest {
    FileInputStream inputStream;
    XSSFWorkbook workbook;

    public ExcelDataTest() {
        try {
            inputStream = new FileInputStream("/Users/ritakk/Documents/FrameWork/src/test/POI.xlsx");
            workbook = new XSSFWorkbook(inputStream);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getStringData(int rownum, int colnum) {

       return workbook.getSheetAt(0).getRow(rownum).getCell(colnum).getStringCellValue();
    }

    public double getDoubleData(int rownum, int colnum) {

        return workbook.getSheetAt(0).getRow(rownum).getCell(colnum).getNumericCellValue();
    }
}


