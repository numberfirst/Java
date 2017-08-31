package 银行案例.Handler;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import 银行案例.Cache.AccountCache;
import 银行案例.Model.Transaction;

public class TransactionOutputHandler {
	public void transactionOutput() throws Exception {
        OutputStream out = new FileOutputStream("D:/Bank/BankTrans.xls");
		HSSFWorkbook wb = new HSSFWorkbook();		
		HSSFSheet sheet = wb.createSheet("转账信息");		
		Set keys=AccountCache.getInstance().getWrapdata().getTransactionRecords().keySet();
		Iterator it=keys.iterator();		
		int i = 0;
	    while(it.hasNext()) {
			HSSFRow row = sheet.createRow(i);
			
			
			String str=(String) it.next();
			
			List values=(List) AccountCache.getInstance().getWrapdata().getTransactionRecords().get(str);
			
			
			
			for (int j = 0; j < 3; j++) {
				System.out.print(values.get(j));
				
				
			}
				
					
				
			
			
//			for (int j = 0; j < 4; j++) {
//				HSSFCell cell = row.createCell(j);
//				if(j==0) {
//					cell.setCellValue(str);	
//				}
//				if(j==1) {
//					cell.setCellValue(map.get(str).getCard());
//				}
//                if(j==2) {
//                	double amount=map.get(str).getAmount().doubleValue();
//                	cell.setCellValue(amount);
//				}
//                if(j==3) {
//                	cell.setCellValue(map.get(str).getTransferTime());
//                }
                
//			}
			i++;
		}
//		wb.write(out);		
//		out.flush();		
	}

	

}
