package OopTestTwo;

public class LiteratureDepartment extends Student{
	private double literatureSpeech;
	private double opusScore;
	public LiteratureDepartment(int no, String name, char sex, int age, double midtermScore, double finalScore,
			double literatureSpeech, double opusScore) {
		super(no, name, sex, age, midtermScore, finalScore);
		this.literatureSpeech = literatureSpeech;
		this.opusScore = opusScore;
	}
	public double getLiteratureSpeech() {
		return literatureSpeech;
	}
	public double getOpusScore() {
		return opusScore;
	}
	


}
