package OopTestTwo;

public class EnglishDepartment extends Student{
	private double speechScore;
	public EnglishDepartment(int no, String name, char sex, int age, double midtermScore, double finalScore,
		    double speechScore) {
		super(no, name, sex, age, midtermScore, finalScore);
		this.speechScore = speechScore;
	}
	public double getSpeechScore() {
		return speechScore;
	}
	
}
