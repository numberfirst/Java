package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;

public class TestOne {

	public static void main(String[] args) throws IOException {
		File file=new File("test.txt");
//		System.out.println(file.exists());
		FileInputStream f=new FileInputStream(file);
//		int i= f.read();
//		System.out.println(i);
		System.out.println(f.available());
//		一堆看不懂
//		for(int j=0;j<=f.available()+1;j++) {
//			System.out.println(f.read());
//		}
		
//		byte[] b=new byte[f.available()];
//		f.read(b);
//		System.out.println(ArrayUtils.toString(b));
//		String s=new String(b,"utf-8");
//		System.out.println(s);
//		byte[] datas = new byte[f.available()];
//		f.read(datas);
//		
//		System.out.println(ArrayUtils.toString(datas));
//		
//		
//		String str = new String(datas , "utf-8");
//		System.out.println(str);
		f.skip(2);
		
		System.out.println(f.read());
		

	}

}
