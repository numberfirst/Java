package Server;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server=new ServerSocket(8888);
		
		System.out.println("服务端启动");		
		Socket socket=server.accept();
		
		System.out.println("有人访问");	
		InputStream in=socket.getInputStream();	
		OutputStream out=socket.getOutputStream();	
		byte[] bytes=new byte[in.available()];
		in.read(bytes);
		String str=new String(bytes);
		System.out.println("服务端收到："+str);
		
		
		
		String msg="Hello";
		out.write(msg.getBytes());

	}

}
