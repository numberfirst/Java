package OopTest;

public class Constructor {

	public static void main(String[] args) {
		Person p1=new Person("zhangsan",33,1.73);
		Person p2=new Person("lishi",44,1.73);
		p1.sayHellow(p1.name);
		p2.sayHellow(p2.name);

	}

}
