package OopTestTwo;

public class Company {
	
	
	
	public void monthSalary(ColaEmployee[] colaEmp) {
		
		for(int i=0;i<colaEmp.length;i++) {
			double monthSalary = 0;
			monthSalary=colaEmp[i].getSalary(monthSalary);
			if(colaEmp[i] instanceof SalariedEmployee) {
				SalariedEmployee salarEmp=(SalariedEmployee)colaEmp[i];
				monthSalary+=salarEmp.getMonthSalary();
			}else if(colaEmp[i] instanceof SalesEmployee) {
				SalesEmployee saleEmp=(SalesEmployee)colaEmp[i];
				monthSalary+=saleEmp.getMonthSalesVolume()*saleEmp.getRoyaltyRate();						
			}else if(colaEmp[i] instanceof HourlyEmployee) {
				HourlyEmployee hourEmp=(HourlyEmployee)colaEmp[i];
				if(hourEmp.getHours()<=160)
				monthSalary+=hourEmp.getHourlySalary()*hourEmp.getHours();
				else if(hourEmp.getHours()>160)
				monthSalary+=hourEmp.getHourlySalary()*160+hourEmp.getHourlySalary()*1.5*(hourEmp.getHours()-160);			
			}
			System.out.println(monthSalary);
		}
		
	}

}
