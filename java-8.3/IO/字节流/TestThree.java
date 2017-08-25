package 字节流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestThree {

	public static void main(String[] args) throws Exception {
		
		File from=new File("d:/Test/1.mp3");
		System.out.println(from.exists());
		File to=new File("d:/Test/test/5.mp3");
		InputStream in=new FileInputStream(from);
		OutputStream out=new FileOutputStream(to);

		byte[] bytes=new byte[in.available()];
		long start=System.nanoTime();
			
		in.read(bytes);
		System.out.println(System.nanoTime()-start);	
 		out.write(bytes);
	
		
		

	}

}
