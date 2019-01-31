package WebApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import resources.base;

public class Excel_class extends base {
	Workbook workbook;

	public ArrayList<String> getdata(String fileName) throws IOException, NullPointerException {

		ArrayList<String> a = new ArrayList<String>();

		FileInputStream inputStream = new FileInputStream(
				"C:\\demo_Intelegencia_my_workspace\\Redmine_workspace\\src\\test\\java\\utility\\TimesheetDetails.xlsx");
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		System.out.println(fileExtensionName);

		try {
			if (fileExtensionName.equals(".xlsx")) {
				workbook = new XSSFWorkbook(inputStream);
			} else if (fileExtensionName.equals(".xls")) {
				workbook = new HSSFWorkbook(inputStream);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Sheet sheet = workbook.getSheetAt(0);
		 Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
		System.out.println(sheet.getLastRowNum());
		for (int i = 1; i <= sheet.getLastRowNum(); i++) 
		{
		
			
			Row row = sheet.getRow(i);
              
			// Cell cell = row.getCell(i);
			// System.out.println(cell);
			// Iterator<Row> rowIterator = sheet.iterator();
			// while (rowIterator.hasNext()) {
			// System.out.println(rowIterator.next());
			// For each row, iterate through all the columns
			Iterator<Cell> it = row.cellIterator();

			while (it.hasNext())
			{
				
				Cell c = it.next();
				if (c.getCellTypeEnum() == CellType.STRING) {

					a.add(c.getStringCellValue());

				} else {

					a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

				}

			

			}

		}
		return a;

	}
}
