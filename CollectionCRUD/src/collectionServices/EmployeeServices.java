package collectionServices;
import java.util.Scanner;
import collectionEntity.Employee;
public interface EmployeeServices {
	public int addEmployeeToList(Employee employee);
	public boolean findEmployee(int emp_Id);
	public int removeEmployeData(int emp_Id);
	public Employee getEmployeeData(int emp_Id);
	public Employee updateEmployeeData(int emp_Id, Scanner input1, Scanner input2);
	public int showAllEmployeesList();
	public int sortEmployeeByName();
	public int sortEmployeeByAge();
	public int sortEmployeeBySalary();
}
