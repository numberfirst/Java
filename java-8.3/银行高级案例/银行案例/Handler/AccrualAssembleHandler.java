package 银行案例.Handler;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class AccrualAssembleHandler {
	private  ArrayList<Double> yearAccrual=new ArrayList<Double>();
	public  ArrayList<Double>  loadAccrual() throws Exception {
        HSSFWorkbook wb = new HSSFWorkbook( new FileInputStream("D:/Bank/BankAccrual.xls"));		
		HSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> rows = sheet.iterator();		
        while(rows.hasNext()) {			
			Row row = rows.next();
			Iterator<Cell> cells =  row.cellIterator();	
			while(cells.hasNext()) {
				Cell cell=cells.next();
				yearAccrual.add(cell.getNumericCellValue());					
			}			
        }		
		return yearAccrual;
	}
	

}
