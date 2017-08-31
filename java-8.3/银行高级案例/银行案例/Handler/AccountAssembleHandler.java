package 银行案例.Handler;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import 银行案例.Model.Account;
import 银行案例.Model.Customer;

public class AccountAssembleHandler {
	private Map<String,Account> accounts=new TreeMap<String,Account>();
	public Map<String, Account> loadAccounts() throws Exception {
        HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("D:/Bank/BankAccounts.xls"));		
		HSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> rows = sheet.iterator();		
        while(rows.hasNext()) {			
			Row row = rows.next();
			Iterator<Cell> cells =  row.cellIterator();	
			Account account=new Account();
			Customer customer=new Customer();
			String str=null;
			double d=0;
			for(int i=0;cells.hasNext();i++) {
				Cell cell = cells.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					str=cell.getStringCellValue();
					break;
				case Cell.CELL_TYPE_NUMERIC:
					d=cell.getNumericCellValue();
					break;
				default:
					break;
				}
				if(i==0) {
					account.setCardId(str);					
				}
				if(i==1) {
					customer.setName(str);
				}
                if(i==2) {
                	
					customer.setAge((int)d);
				}
                if(i==3) {
                	customer.setPhone(str);
                }
                if(i==4) {
                	account.setPassword(str);
                }
                if(i==5) {
					BigDecimal s=new BigDecimal(d);
                	account.setBalance(s);
                }	
                if(i==6) {
					
                	customer.setId(str);
                }
			}
			account.setCustomer(customer);
			accounts.put(account.getCardId(), account);
        }		
		return accounts;
	}
	

}
