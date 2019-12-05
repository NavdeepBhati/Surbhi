package EmployeeCollection;

public class Employee {

	String empId;
	String empName;
	int salary;
	public Employee(String empId, String empName,int salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary=salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public static int  compareById(Employee e1, Employee e2){
		return e1.empId.compareTo(e2.empId);
	}
	
}
