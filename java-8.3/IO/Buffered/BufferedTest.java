package Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedTest {

	public static void main(String[] args) throws Exception {
		
		
		File from=new File("d:/Test/1.mp3");
		System.out.println(from.exists());
		File to=new File("d:/Test/test/2.mp3");
		InputStream in=new FileInputStream(from);
		BufferedInputStream bufferIn=new BufferedInputStream(in);
//		OutputStream out=new FileOutputStream(to);
//		BufferedOutputStream bufferOut=new BufferedOutputStream(out);
		int b;
		
		long start=System.nanoTime();
		
		while((b=bufferIn.read())!=-1) {
			
		}
		
//		while((b=in.read())!=-1) {
//			
//		}
		System.out.println(System.nanoTime()-start);	
		

		
		
		

	}

}
