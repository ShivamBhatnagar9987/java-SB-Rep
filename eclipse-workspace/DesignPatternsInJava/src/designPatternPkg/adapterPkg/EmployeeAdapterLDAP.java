package designPatternPkg.adapterPkg;

public class EmployeeAdapterLDAP implements Employee {

	EmployeeLDAP employeeLDAP;

	public EmployeeAdapterLDAP(EmployeeLDAP employeeLDAP) {
		this.employeeLDAP = employeeLDAP;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return employeeLDAP.getCn();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return employeeLDAP.getGivenName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return employeeLDAP.getSurName();
	}

	@Override
	public String getProject() {
		// TODO Auto-generated method stub
		return employeeLDAP.getAllocatedTo();
	}

}
