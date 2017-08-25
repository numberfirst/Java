package Question;

public class Options {
	private char key;
	private String text;
	public Options(char key,String text) {
		this.key=key;
		this.text=text;		
	}
	public char getKey() {
		return key;
	}
	public void setKey(char key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	

}
