package Apache.commons.collection.support;



import java.text.MessageFormat;

public class Person {
	private String name;
	private int age;
	private String occupation;
	
	@Override
	public String toString() {
		
		return MessageFormat.format("name : {0}\tage : {1}\toccupation : {2}", name , age , occupation);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	

	
}
