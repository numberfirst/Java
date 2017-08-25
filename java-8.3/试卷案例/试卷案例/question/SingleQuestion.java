package 试卷案例.question;

import 试卷案例.question.support.Options;

public class SingleQuestion extends ChoiceQuestion{
	private char answers;
	public SingleQuestion(String title, Options[] options, char answers) {
		super(title, options);
		this.answers = answers;
	}
	public char getAnswers() {
		return answers;
	}
	public void setAnswers(char answers) {
		this.answers = answers;
	}
	
	

}
