package 字符流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {

	public static void main(String[] args) throws Exception {
		Reader reader=new InputStreamReader(new FileInputStream("d:/Test/test.txt"));
		BufferedReader bufferRead=new BufferedReader(reader);
		while(reader.ready()) {
			System.out.println(bufferRead.readLine()); 
			
		}

	}

}
