package CompanyInfo;

public class Emp {
	private int id;
	
	private Person person;
	private double salary;
	private Emp up;
	private Emp[] downs;
	private Department department;
	private PostInfo postInfo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public PostInfo getPostInfo() {
		return postInfo;
	}
	public void setPostInfo(PostInfo postInfo) {
		this.postInfo = postInfo;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int postSalary,int bouns) {
		salary=postSalary+bouns;
	}
	public Emp getUp() {
		return up;
	}
	public void setUp(Emp up) {
		this.up = up;
	}
	public Emp[] getDowns() {
		return downs;
	}
	public void setDowns(Emp[] downs) {
		this.downs = downs;
	}
	

}
