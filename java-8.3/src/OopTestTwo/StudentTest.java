package OopTestTwo;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1=new EnglishDepartment(1,"张三", '男', 20, 90.0, 88.0, 93.0);
		Student stu2=new ComputerDepartment(2, "李四", '女', 21, 80.0, 90.0, 89.0, 92.0);
		Student stu3=new LiteratureDepartment(3, "王五", '男', 19, 85.0, 91.0, 93.0, 89.0);
		Student[] stu= {stu1,stu2,stu3};
		new Print(stu).print();
		

	}

}
