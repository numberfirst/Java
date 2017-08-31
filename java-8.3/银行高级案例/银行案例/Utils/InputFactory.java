package 银行案例.Utils;

import java.util.Scanner;

public class InputFactory {
	public enum TYPE{
		INT,DOUBLE,STRING
	}
	public static Object getInput(TYPE type) {
		Scanner sc=new Scanner(System.in);
		Object result=null;
		switch(type.toString()) {
		case "INT":
			result=sc.nextInt();
			break;
		case "DOUBLE":
			result=sc.nextDouble();
			break;
		case "STRING":
			result=sc.next();
			break;
		default:
			break;		
		}
		return result;
	}

}
