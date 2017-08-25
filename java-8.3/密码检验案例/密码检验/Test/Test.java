package 密码检验.Test;

public class Test {

	public static void main(String[] args) {
		String s=" abcAsd13 ";
		s=s.trim();
		char[] c=s.toCharArray();
		boolean b1=false,b2=false,b3=false;
		if(c.length>5&&c.length<13) {
			for(int i=0;i<c.length;i++) {
				Character ch=new Character(c[i]);
				if(Character.isLetter(ch)) {
					b1=true;
					continue;
				}else if(Character.isDigit(ch)) {
					b2=true;
					continue;
				}
				else if(ch.equals('_')||ch.equals('.')) {
					b3=true;
					continue;
				}
			}
		}else {
			if(c.length<6) {
				System.out.println("输入的密码太短！");
			}else if(c.length>12) {
				System.out.println("输入的密码太长！");
			}
		}
		if((b1==true&&b2==false&&b3==false)||(b2==true&&b1==false&&b3==false)||(b3==true&&b2==false&&b1==false)) {
			System.out.println("您的密码安全级别是1星,安全级别过低！");
		}else if((b2==true&&b3==true&&b1==false)||(b1==true&&b3==true&&b2==false)||(b2==true&&b1==true&&b3==false)) {
			System.out.println("您的密码安全级别是2星,安全级别中！");
		}else if(b1==true&&b2==true&&b3==true) {
			System.out.println("您的密码安全级别是3星,安全级别高！");
		}
		

	}

}
