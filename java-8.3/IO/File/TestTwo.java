package File;

import java.io.File;

public class TestTwo {
	public static void main(String[] args) {
		File file=new File("d:/Test/新建文件夹");
		System.out.println(deleteTxt(file));
	}	
	public static boolean  deleteTxt(File file) {
		String f1=file.toString();
		if(file.isDirectory()) {
			File[] f=file.listFiles();
			for(int i=0;i<f.length;i++) {
				if(file.isDirectory())
					deleteTxt(f[i]);					
			}
		}
		return new File(f1).delete();		
	}

}
