package Question;



public class SingleChoice extends Question{

	private char answers;
	public SingleChoice(String title, char answers,Options[] options) {
		super(title,options);
		this.answers = answers;
	}
    public boolean check(char[] answers) {
    	boolean result=false;
    	if(answers.length==1&&this.answers==answers[0]) {
    		result=true;
    	}
    	return result;
		
	}

	

}
