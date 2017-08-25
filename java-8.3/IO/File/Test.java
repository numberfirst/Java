package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws IOException {

		File file=new File("d:/Test/test/test");
//		File fileOne=new File("d:/Test/test/test");
//		System.out.println(file.createNewFile());
//		System.out.println(fileOne.createNewFile());
//		System.out.println(file.exists());
//		System.out.println(file.getAbsolutePath());
//		是否为目录
//		System.out.println(fileOne.isDirectory());
//		System.out.println(file.canWrite());
//		最后一次修改时间
//		System.out.println(new Date(file.lastModified()));
//		System.out.println(file.getCanonicalPath());
//		System.out.println(file.length());
//		剩余空间
//		System.out.println(file.getFreeSpace()/1024/1024/1024);
		File[] f=file.listFiles();
		for(File file2 : f) {
			System.out.println(file2);
		}
//		System.out.println(file.getParentFile());
//		System.out.println(file.canExecute());
		
//		System.out.println(fileOne.delete());

	}

}
