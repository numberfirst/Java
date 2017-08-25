package 试卷案例.answer;

public class ChoiceAnswer extends Answer{
	private char[] choice;

	public ChoiceAnswer(char[] choice) {
		super();
		this.choice = choice;
	}

	public char[] getChoice() {
		return choice;
	}

	public void setChoice(char[] choice) {
		this.choice = choice;
	}
	
	

}
