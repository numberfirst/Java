package 银行案例.Handler;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import 银行案例.Cache.AccountCache;

public class AccountOutputHandler {
	
	public void accountOutput() throws Exception {
        OutputStream out = new FileOutputStream("D:/Bank/BankAccounts.xls");
		HSSFWorkbook wb = new HSSFWorkbook();		
		HSSFSheet sheet = wb.createSheet("信用卡信息");	
		Set keys=AccountCache.getInstance().getWrapdata().getAccounts().keySet();
		Iterator it=keys.iterator();
		for (int i = 0; it.hasNext(); i++) {
			HSSFRow row = sheet.createRow(i);		
			String str=(String) it.next();
			for (int j = 0; j < 7; j++) {
				HSSFCell cell = row.createCell(j);		
				if(j==0) {					
					cell.setCellValue(AccountCache.getInstance().getWrapdata().getAccounts().get(str).getCardId());					
				}
				if(j==1) {
					cell.setCellValue(AccountCache.getInstance().getWrapdata().getAccounts().get(str).getCustomer().getName());
				}
                if(j==2) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getAccounts().get(str).getCustomer().getAge());
				}
                if(j==3) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getAccounts().get(str).getCustomer().getPhone());
                }
                if(j==4) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getAccounts().get(str).getPassword());
                }
                if(j==5) {
                	double balance=AccountCache.getInstance().getWrapdata().getAccounts().get(str).getBalance().doubleValue();
                	cell.setCellValue(balance);              	               }	
                if(j==6) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getAccounts().get(str).getCustomer().getId());
                }
			}
		}		
		wb.write(out);		
		out.flush();		
	}
	
	
	

}
