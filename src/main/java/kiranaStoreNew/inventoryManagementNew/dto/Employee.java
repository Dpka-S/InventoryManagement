package kiranaStoreNew.inventoryManagementNew.dto;

public class Employee {
	private Integer empId;
	private String empName;
	private Integer Salary;
	private String jobTitle;
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + ", jobTitle=" + jobTitle+ "]";
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Employee() 
	{
		
	}
	public Employee(Integer empId, String empName, Integer salary, String jobTitle) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
		this.jobTitle = jobTitle;
	}
		
}