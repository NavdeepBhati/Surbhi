package PredicatesDemo;

public class Employee {

	public int getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", gender=" + gender + ", fName=" + fName + ", lName="
				+ lName + "]";
	}
	public Employee(int empId, int age, String gender, String fName, String lName) {
		super();
		this.empId = empId;
		this.age = age;
		this.gender = gender;
		this.fName = fName;
		this.lName = lName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	int empId,age;
	String gender,fName,lName;
}