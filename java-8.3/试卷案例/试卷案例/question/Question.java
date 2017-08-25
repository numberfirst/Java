package 试卷案例.question;
public abstract class Question {
	protected String title;
	public Question() {
		
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
