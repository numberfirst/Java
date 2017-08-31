package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket client=new Socket("127.0.0.1",8888);
		OutputStream out=client.getOutputStream();
		String msg="Hello";
		out.write(msg.getBytes());
		
		
		
		InputStream in=client.getInputStream();		
		byte[] bytes=new byte[50];
		in.read(bytes);
		String str=new String(bytes);
		System.out.println("客户端收到："+str);

	}

}
