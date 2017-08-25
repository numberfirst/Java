package OopTest;

public class Person {
	public String name;
	public double height;
	public int age;
	public Person(String name,int age,double height) {
		this.name=name;
		this.age=age;
		this.height=height;		
	}
	public void sayHellow(String name) {
		System.out.println("Hellow,my name is "+name);
	}

}
