package OopTestTwo;

public class Student {
	private int no;
	private String name;
	private char sex;
	private int age;
	private double midtermScore;
	private double finalScore;
	public Student(int no,String name,char sex,int age, double midtermScore,double finalScore) {
		this.no=no;
		this.age=age;
		this.name=name;
		this.sex=sex;
		this.midtermScore=midtermScore;
		this.finalScore=finalScore;		
	}	
	public double getMidtermScore() {
		return midtermScore;
	}
	public double getFinalScore() {
		return finalScore;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public char getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
}
