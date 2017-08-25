package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestTwo {

	public static void main(String[] args) throws Exception {
		File from=new File("d:/Test/test.txt");
//		System.out.println(from.exists());
		File to=new File("d:/Test/test1.txt");
		InputStream in=new FileInputStream(from);
		OutputStream out=new FileOutputStream(to);
		byte[] bytes=new byte[in.available()];
		in.read(bytes);
		String str=new String(bytes,"utf-8");
		System.out.print(str);
		out.write(bytes);
		
		
		

	}

}
