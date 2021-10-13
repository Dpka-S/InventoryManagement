package kiranaStoreNew.inventoryManagementNew.dao;

import java.util.List;

import kiranaStoreNew.inventoryManagementNew.dto.Employee;

public interface EmployeeDao {
	
	public Boolean add(Employee emp);
	
	public Boolean update(Employee emp);
	
	public Boolean delete(Integer empId);
	
	public Employee searchById(Integer empId);
	
	public List<Employee> EmployeeList();

}