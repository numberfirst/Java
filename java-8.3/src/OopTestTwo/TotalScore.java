package OopTestTwo;

public class TotalScore {
	private Student student;
	private double totalScore;
	
	
	public TotalScore(Student student) {
		super();
		this.student = student;
	}

	
	public double getTotalScore() {
		return totalScore;
	}

	public void totalScore() {
		if(student instanceof EnglishDepartment) {
			EnglishDepartment engStu=(EnglishDepartment)student;
			totalScore=engStu.getSpeechScore()*0.5+engStu.getMidtermScore()*0.25+engStu.getFinalScore()*0.25;
		}else if(student instanceof ComputerDepartment) {
			ComputerDepartment comStu=(ComputerDepartment)student;
			totalScore=comStu.getEnglishWriteScore()*0.2+comStu.getOpertionScore()*0.4+comStu.getMidtermScore()*0.2+comStu.getFinalScore()*0.2;
		}else if(student instanceof LiteratureDepartment) {
			LiteratureDepartment litStu=(LiteratureDepartment)student;
			totalScore=litStu.getOpusScore()*0.35+litStu.getLiteratureSpeech()*0.35+litStu.getMidtermScore()*0.15+litStu.getFinalScore()*0.15;
		}				
	}
	

}
