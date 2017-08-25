package OopTest;




public class StuTest {

	public static void main(String[] args) {
		StuInfo stu1= new StuInfo("zhansan",1,87);
		StuInfo stu2= new StuInfo("lisi",2,88);
		StuInfo stu3= new StuInfo("wangwu",3,90);
		StuInfo stu4= new StuInfo("chenliu",4,89);
		StuInfo[] stu= {stu1,stu2,stu3,stu4};
		StuInfo s=new StuInfo();
		s.sortByScore(stu);
	}


}
