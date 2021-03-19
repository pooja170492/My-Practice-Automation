import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellDataType {

	public static void main(String[] args) throws EncryptedException, IllegalException, IOException;
	{
		String path=" G:\\Selenium Excelsheet Practice Script";
		FileInputStream file= new FileInputStream(path);
		Workbook book= WorkbookFactory.create(file);
		Sheet sheet =book.getSheet("Robotics Technology Pvt.Ltd.");
		Row row= sheet.getRow(1);
		Cell cell= row.getCell(0);
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			String str= cell.getStringCellValue();
			System.out.println(str);
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
