package collectionServicesImpl;
import java.util.Scanner;
import collectionEntity.Employee;
import collectionServiceRepository.EmployeeServiceRepository;
import collectionServices.EmployeeServices;
public class EmployeeServiceImpl implements EmployeeServices {
	@Override
	public int addEmployeeToList(Employee employee) {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.addEmployeeToList(employee);
	}
	@Override
	public boolean findEmployee(int emp_Id) {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.findEmployee(emp_Id);
	}
	@Override
	public int removeEmployeData(int emp_Id) {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.removeEmployeData(emp_Id);
	}
	@Override
	public Employee getEmployeeData(int emp_Id) {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.getEmployeeData(emp_Id);
	}
	@Override
	public Employee updateEmployeeData(int emp_Id, Scanner input1, Scanner input2) {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.updateEmployeeData(emp_Id, input1, input2);
	}
	@Override
	public int showAllEmployeesList() {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.showAllEmployeesList();
	}
	@Override
	public int sortEmployeeByName() {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.sortEmployeeByName();
	}
	@Override
	public int sortEmployeeByAge() {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.sortEmployeeByAge();
	}
	@Override
	public int sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		return EmployeeServiceRepository.sortEmployeeBySalary();
	}
}
