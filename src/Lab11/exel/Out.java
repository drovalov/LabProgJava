package Lab11.exel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

//import org.jetbrains.annotations.Nullable;

public class Out {
//    public static void main(String[] args) throws IOException {
//        Out root1 = readFromExcel();
//        System.out.println(root1);
//    }

    //    @Nullable
    public static Out readFromExcel() throws IOException {
        XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream("student.xlsx"));
        XSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
        XSSFRow row = null;
        int x= 0;
        do {
            x++;
            row = myExcelSheet.getRow(x);

            if (row.getCell(0).getCellType() == CellType.STRING) {
                String name = row.getCell(0).getStringCellValue();
                System.out.println("name : " + name);
            }

            if (row.getCell(1).getCellType() == CellType.STRING) {
                String Lastname = row.getCell(1).getStringCellValue();
                System.out.println("Lastname : " + Lastname);
            }

            if (row.getCell(2).getCellType() == CellType.NUMERIC) {
                Number note = row.getCell(2).getNumericCellValue();
                System.out.println("Note :" + note);
            }
        } while (x<7);



            myExcelBook.close();

            return null;
        }
    }

