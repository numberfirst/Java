package 试卷案例.question;

public class BlankQuestion extends Question{
	private String[] answer;

	public BlankQuestion(String title, String[] answer) {
		super(title);
		this.answer = answer;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	

}
