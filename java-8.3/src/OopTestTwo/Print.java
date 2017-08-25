package OopTestTwo;

public class Print {
	private Student[] stu;
	
	public Print(Student[] stu) {
		super();
		this.stu = stu;
	}

	public void print() {
		for(int i=0;i<stu.length;i++) {
			TotalScore totalScore= new TotalScore(stu[i]);
			totalScore.totalScore();
			System.out.println("学号："+stu[i].getNo()+" 姓名："+stu[i].getName()+" 性别："+stu[i].getSex()+" 年龄："+stu[i].getAge()+" 总成绩："+totalScore.getTotalScore());			
		}
			
		
	}

}
