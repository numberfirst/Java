package OopTestTwo;

public class TestCompany {

	public static void main(String[] args) {
		ColaEmployee emp1=new SalariedEmployee("Tom", 3, 3000);
		ColaEmployee emp2=new SalesEmployee("Jack", 12, 30000,0.11);
		ColaEmployee emp3=new HourlyEmployee("Tina", 8, 20,170);
		ColaEmployee[] emp= {emp1,emp2,emp3};
		new Company().monthSalary(emp);

	}

}
