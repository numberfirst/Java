package 试卷案例.question;

import 试卷案例.question.support.Options;

public class MultiQuestion extends ChoiceQuestion{
	private char[] answer;

	public MultiQuestion(String title, Options[] options, char[] answer) {
		super(title, options);
		this.answer = answer;
	}

	public char[] getAnswer() {
		return answer;
	}

	public void setAnswer(char[] answer) {
		this.answer = answer;
	}
	

}
