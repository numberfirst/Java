package Question;



public class MultiChoice extends Question{
	private char[] answers;
	public MultiChoice(String title, char[] answers,Options[] options) {
		super(title,options);
		this.answers = answers;
	}
	public boolean check(char[] answers) {
		boolean result=false;
		int count=0;
		if(this.answers.length==answers.length) {
		    for(int i=0;i<this.answers.length;i++) {
			    for(int j=0;j<answers.length;j++) {
				    if(this.answers[i]==answers[j]) {
					    count++;
					    break;					
				    }
			    }			
		    }
		}
		if(count==this.answers.length) {
			result=true;
		}
		
		return result;
	}

	

}
