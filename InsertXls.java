import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InsertXls{
    public static void main(String[] args) {
        try
        {
            FileInputStream myxls = new FileInputStream("iris.xls");
            HSSFWorkbook studentsSheet = new HSSFWorkbook(myxls);
            HSSFSheet worksheet = studentsSheet.getSheetAt(0);
            int lastRow=worksheet.getLastRowNum();
            Row row = worksheet.createRow((short)++lastRow);
            row.createCell(0).setCellValue((int)1);
            row.createCell(1).setCellValue((int)2);
            row.createCell(2).setCellValue((int)3);
            row.createCell(3).setCellValue((int)5);
            row.createCell(4).setCellValue("iris-setosa");



            myxls.close();
            FileOutputStream output_file =new FileOutputStream(new File("output.xls"));
            //write changes
            studentsSheet.write(output_file);
            output_file.close();
            System.out.println(" is successfully written");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
