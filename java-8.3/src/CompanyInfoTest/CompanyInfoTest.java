package CompanyInfoTest;


import CompanyInfo.Adds;
import CompanyInfo.CompanyInfo;
import CompanyInfo.Department;
import CompanyInfo.Emp;
import CompanyInfo.Person;
import CompanyInfo.PostInfo;

public class CompanyInfoTest {

	public static void main(String[] args) {
		Person boss=new Person();
		boss.setName("boss");
		boss.setAge(45);
		boss.setEmail("boss@qq.com");

		CompanyInfo companyInfo=new CompanyInfo();
		companyInfo.setCompanyName("东软");

		companyInfo.setCompanyTelephoneNumber(5555555);
		companyInfo.setCompanyEmail("company@qq.com");
		PostInfo postInfo=new PostInfo();
		postInfo.setPostName("president");
		postInfo.setPostSalary(100000);
		postInfo.setBonus(10000);
		postInfo.setWelfare("三亚度假7天");
		Emp empBoss=new Emp();
		empBoss.setId(1);
		empBoss.setPerson(boss);
		empBoss.setPostInfo(postInfo);
		empBoss.setSalary(postInfo.getPostSalary(),postInfo.getBonus());

		System.out.println("boss的福利是："+empBoss.getPostInfo().getWelfare());

		
		Person scott=new Person();
		scott.setAge(40);
		scott.setName("scott");
		scott.setEmail("scott@qq.com");
		

		
		Emp empScott=new Emp();
		empScott.setPerson(scott);
		empScott.setUp(empBoss);

		
		Emp[] emps= {empScott};
		empBoss.setDowns(emps);
		
		System.out.println("scott的上司是："+empScott.getUp().getPerson().getName());
		System.out.println("boss的下属的email是："+empBoss.getDowns()[0].getPerson().getEmail());
		
		
		Person jack=new Person();
		jack.setName("jack");
		jack.setEmail("jack@qq.com");
		jack.setAge(30);
		Emp empJack=new Emp();
		empJack.setPerson(jack);
		empJack.setUp(empScott);
		empJack.setId(1);
		
		
		Person tom=new Person();
		tom.setName("tom");
		tom.setEmail("jack@qq.com");
		tom.setAge(40);
		Emp empTom=new Emp();
		empTom.setPerson(tom);
		empTom.setUp(empScott);
		empTom.setId(2);
		
		Emp[] empss= {empJack,empTom};
		empScott.setDowns(empss);
		
		System.out.println("scott第二位下属的id为："+empScott.getDowns()[1].getId());
		System.out.println("jack的上司的工资是："+empJack.getUp().getSalary());
		
		
		Person tina=new Person();
		tina.setName("tina");
		tina.setAge(33);
		Emp empTina=new Emp();
		empTina.setPerson(tina);
		empTina.setUp(empBoss);
		empTina.setId(2);

		
		empJack.setUp(empTina);
	
		
		System.out.println("jack的新上司是："+empJack.getUp().getPerson().getName());
		
		
		
		Adds a1=new Adds("北京",12345);
		Adds a2=new Adds("天津",12679);
		Adds[] a= {a1,a2};
		boss.setAdds(a);
		System.out.println("boss的其中一个住处是："+boss.getAdds()[1].getAddress());
		
		Department department=new Department();
		department.setDepartmentName("人事部");
		Emp[] allEmps= {empJack,empScott};
		department.setAllEmps(allEmps);	
		for(int i=0;i<department.getAllEmps().length;i++) {
			System.out.println(department.getAllEmps()[i].getId());
		}
		allEmps=department.addEmps(empTom);
		department.setAllEmps(allEmps);
		for(int i=0;i<department.getAllEmps().length;i++) {
			System.out.println(department.getAllEmps()[i].getId());
		}
		
		
		allEmps=department.removeEmps(empJack);
		department.setAllEmps(allEmps);
		for(int i=0;i<department.getAllEmps().length;i++) {
			System.out.println(department.getAllEmps()[i].getId());
		}

	}

}
