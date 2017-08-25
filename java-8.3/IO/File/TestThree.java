package File;

import java.io.File;

public class TestThree {

	public static void main(String[] args) {
		File file=new File("d:/Test/新建文件夹");
		foundTxt(file);

	}
	public static void foundTxt(File file) {
		String f1=file.toString();
		if(file.isDirectory()) {
			File[] f=file.listFiles();
			for(int i=0;i<f.length;i++) {
				if(file.isDirectory())
					foundTxt(f[i]);					
			}
		}
		System.out.println(new File(f1).getAbsolutePath());		
	}

}
