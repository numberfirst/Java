package CompanyInfo;

public class Department {
	private int departmentId;
	private String departmentName;
	private String managerName;
	private Emp[] allEmps;
	
	public Emp[] addEmps(Emp emp) {
		Emp[] result=new Emp[allEmps.length+1];
		System.arraycopy(allEmps, 0, result, 0, allEmps.length);
		result[allEmps.length]=emp;
		return result;
	}
	public Emp[] removeEmps(Emp emp) {
		Emp[] result=new Emp[allEmps.length-1];
		int i;
		for(i=0;i<allEmps.length;i++) {
			if(allEmps[i].getId()==emp.getId()) {
				break;
			}
		}
		System.arraycopy(allEmps, 0, result, 0, i);
		System.arraycopy(allEmps, i+1, result, i, allEmps.length-i-1);
		return result;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Emp[] getAllEmps() {
		return allEmps;
	}
	public void setAllEmps(Emp[] allEmps) {
		this.allEmps = allEmps;
	}
	
	
	

	

}
