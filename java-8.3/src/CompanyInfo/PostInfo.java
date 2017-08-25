package CompanyInfo;

public class PostInfo {
	private String postName;
	private int postSalary;
	private Department deparment;
	private int bonus;
	private String welfare;
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int binus) {
		this.bonus = binus;
	}
	public String getWelfare() {
		return welfare;
	}
	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public int getPostSalary() {
		return postSalary;
	}
	public void setPostSalary(int postSalary) {
		this.postSalary = postSalary;
	}
	public Department getDeparment() {
		return deparment;
	}
	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}
	
}
