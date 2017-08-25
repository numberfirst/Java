package 试卷案例.question;

import 试卷案例.question.support.Options;

public abstract class ChoiceQuestion extends Question{
	private Options[] options;
	public ChoiceQuestion() {
		super();
	}
	public ChoiceQuestion(String title, Options[] options) {
		super(title);
		this.options = options;
	}
	public Options[] getOptions() {
		return options;
	}
	public void setOptions(Options[] options) {
		this.options = options;
	}
	

	
	

}
