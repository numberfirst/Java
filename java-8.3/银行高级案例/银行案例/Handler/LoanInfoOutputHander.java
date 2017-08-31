package 银行案例.Handler;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import 银行案例.Cache.AccountCache;

public class LoanInfoOutputHander {
	public void loanInfoOutput() throws Exception {
        OutputStream out = new FileOutputStream("D:/Bank/BankLoanInfo.xls");
		HSSFWorkbook wb = new HSSFWorkbook();		
		HSSFSheet sheet = wb.createSheet("贷款信息");	
		Set keys=AccountCache.getInstance().getWrapdata().getLoanInfoRecords().keySet();
		Iterator it=keys.iterator();
		for (int i = 0; it.hasNext(); i++) {
			HSSFRow row = sheet.createRow(i);		
			String str=(String) it.next();
			for (int j = 0; j < 9; j++) {
				HSSFCell cell = row.createCell(j);		
				if(j==0) {					
					cell.setCellValue(str);					
				}
				if(j==1) {
					cell.setCellValue(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getSalary());
				}
                if(j==2) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getDate());
				}
                if(j==3) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanYears());
				}
                if(j==4) {
                	double loanNum=AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanNum().doubleValue();
                	cell.setCellValue(loanNum);
                }
                if(j==5) {
                	double repayment=AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getRepayment().doubleValue();
                	cell.setCellValue(repayment);
                }
                if(j==6) {
                	if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).isHasHouse())
                		cell.setCellValue(1);
                	else
                		cell.setCellValue(0);
                }	
                if(j==7) {
                	if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).isMortHouse())
                		cell.setCellValue(1);
                	else
                		cell.setCellValue(0);
                }
                if(j==8) {
                	cell.setCellValue(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getGrade());
                }
			}
		}		
		wb.write(out);		
		out.flush();		
	}

}
