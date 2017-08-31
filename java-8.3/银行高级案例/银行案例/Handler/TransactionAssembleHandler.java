package 银行案例.Handler;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import 银行案例.Model.Transaction;

public class TransactionAssembleHandler {
	private  MultiMap records=new MultiValueMap();
	public  MultiMap loadTransactions() throws Exception {
        HSSFWorkbook wb = new HSSFWorkbook( new FileInputStream("D:/Bank/BankTrans.xls"));		
		HSSFSheet sheet = wb.getSheetAt(0);
		String cardId=null;
		Iterator<Row> rows = sheet.iterator();		
        while(rows.hasNext()) {			
			Row row = rows.next();
			Iterator<Cell> cells =  row.cellIterator();	
			Transaction transaction=new Transaction();
			String str=null;
			double d=0;
			for(int i=0;cells.hasNext();i++) {
				Cell cell = cells.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					str=cell.getStringCellValue();
					break;
				case Cell.CELL_TYPE_NUMERIC:
					d= cell.getNumericCellValue();
					break;
				default:
					break;
				}
				if(i==0) {
					cardId=str;					
				}
				if(i==1) {
					transaction.setCard(str);					
				}
				if(i==2) {
					BigDecimal s=new BigDecimal(d);
					transaction.setAmount(s);
				}
                if(i==3) {               	
					transaction.setTransferTime(str);
				}			
			}
			records.put(cardId,transaction);
        }		
		return records;
	}

}
