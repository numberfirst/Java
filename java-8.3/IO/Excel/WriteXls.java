package Excel;


import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class WriteXls {

	public static void main(String[] args) throws Exception {
//		File file=new File("d:/Test/demo.xls");
//		file.createNewFile();
//		System.out.print(file.exists())
		OutputStream out=new FileOutputStream("d:/Test/demo.xls");		
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet =wb.createSheet("产品信息");
		HSSFRow row=sheet.createRow(0);
		HSSFCell cell=row.createCell(0);
		cell.setCellValue("编号");
		HSSFCell cell1=row.createCell(1);
		cell1.setCellValue("名称");
		HSSFCell cell2=row.createCell(2);
		cell2.setCellValue("价格");
		
		for(int i=1;i<=3;i++) {
			HSSFRow row1=sheet.createRow(i);
			for(int j=0;j<=2;j++) {
				HSSFCell cell3=row1.createCell(j);
				cell3.setCellValue(i+"-"+j);
			}
			
		}
		
		wb.write(out);
		out.flush();
		out.close();
		

	}

}
