package Excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ReadXls {

	public static void main(String[] args) throws Exception {
		InputStream in=new FileInputStream("d:/Test/demo.xls");
		HSSFWorkbook wb=new HSSFWorkbook(in);
		HSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row> rows=sheet.iterator();
		while(rows.hasNext()) {
			Row row=rows.next();
			Iterator<Cell> cell=row.iterator();
			while(cell.hasNext()) {
//				System.out.print(cell.next());
				Cell cells=cell.next();
				switch(cells.getCellType()){
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cells.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cells.getStringCellValue());
					default:
						break;
						
				}
				
			}
			System.out.println();
		}
		
		
		
		
		in.close();
		

	}

	

}
