package designPatternPkg.adapterPkg;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		 Employee employeeDB = new EmployeeDB("1", "Shivam", "Bhatnagar", "Java");
		 employees.add(employeeDB);
		EmployeeLDAP employeeLDAP = new EmployeeLDAP("2", "Claus", "Mikaelson", "DotNet");
		employees.add(new EmployeeAdapterLDAP(employeeLDAP));
		return employees;
	}
}
