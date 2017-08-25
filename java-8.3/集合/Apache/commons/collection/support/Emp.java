package Apache.commons.collection.support;



import java.text.MessageFormat;

public class Emp {
	
	private String name;
	private double age;
	private String location;
	
	@Override
	public String toString() {
		
		return MessageFormat.format("name : {0}\tage : {1}\tolocation : {2}", name , age , location);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
