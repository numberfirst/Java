package OopTestTwo;

public class ComputerDepartment extends Student{
	private double opertionScore;
	private double englishWriteScore;
	public ComputerDepartment(int no, String name, char sex, int age, double midtermScore, double finalScore,
		    double opertionScore, double englishWriteScore) {
		super(no, name, sex, age, midtermScore, finalScore);
		this.opertionScore = opertionScore;
		this.englishWriteScore = englishWriteScore;
	}
	public double getOpertionScore() {
		return opertionScore;
	}
	public double getEnglishWriteScore() {
		return englishWriteScore;
	}
	
	

}
