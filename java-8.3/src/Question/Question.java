package Question;
public abstract class Question {
	protected String title;
	private Options[] options;
	public Question() {
		
	}
	
	public Question(String title, Options[] options) {
		super();
		this.title = title;
		this.options = options;
	}

	public Question(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
