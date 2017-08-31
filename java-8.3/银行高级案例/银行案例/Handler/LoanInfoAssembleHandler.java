package 银行案例.Handler;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import 银行案例.Cache.AccountCache;
import 银行案例.Model.LoanInfo;



public class LoanInfoAssembleHandler {
	private  Map<String , LoanInfo> loanInfoRecords=new HashMap<String,LoanInfo>();
	public  Map<String , LoanInfo> loadLoanInfos() throws Exception {
        HSSFWorkbook wb = new HSSFWorkbook( new FileInputStream("D:/Bank/BankLoanInfo.xls"));		
		HSSFSheet sheet = wb.getSheetAt(0);
		String cardId=null;
		Iterator<Row> rows = sheet.iterator();		
        while(rows.hasNext()) {			
			Row row = rows.next();
			Iterator<Cell> cells =  row.cellIterator();	
			LoanInfo loanInfo=new LoanInfo();
			String str=null;
			double d=0;
			int num=0;
			for(int i=0;cells.hasNext();i++) {
				Cell cell = cells.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					str=cell.getStringCellValue();
					break;
				case Cell.CELL_TYPE_NUMERIC:
					d= cell.getNumericCellValue();
					num=(int) d;
					str=String.valueOf(num);
					break;
				default:
					break;
				}
				if(i==0) {
					cardId=str;
				}
				if(i==1) {
					loanInfo.setSalary(d);					
				}
				if(i==2) {
					loanInfo.setDate(str);
				}
                if(i==3) {               	
                	loanInfo.setLoanYears(num);
				}
                if(i==4) {
                	BigDecimal loanNum=new BigDecimal(d);
                	loanInfo.setLoanNum(loanNum);
				}
                if(i==5) {
                	BigDecimal repayment=new BigDecimal(d);
                	loanInfo.setRepayment(repayment);
				}
                if(i==6) { 
                	if(num==1)
                	    loanInfo.setHasHouse(true);
                	else
                		loanInfo.setHasHouse(false);
				}
                if(i==7) { 
                	if(num==1)
                	    loanInfo.setMortHouse(true);
                	else
                		loanInfo.setMortHouse(false);
				}
                if(i==8) { 
                	loanInfo.setGrade(num);
				}
			}
			loanInfo.setAccount(AccountCache.getInstance().getWrapdata().getAccount());
			loanInfoRecords.put(cardId,loanInfo);
        }		
		return loanInfoRecords;
	}

}
