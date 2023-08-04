package collectionServiceRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import collectionEntity.Employee;
import collectionEntity.Skills;
import collectionUtility.AddSkills;
import collectionUtility.SortEmpsByAge;
import collectionUtility.SortEmpsByName;
import collectionUtility.SortEmpsBySalary;

public class EmployeeServiceRepository {
	static ArrayList<Skills> empSkills = new ArrayList<Skills>();
	static List<Employee> empList = new LinkedList<Employee>();
	Employee employee = new Employee();
	public static int addEmployeeToList(Employee employee) {
		// TODO Auto-generated method stub
		if (!findEmployee(employee.getEmpId())) {
			empList.add(employee);
		} else {
			System.out.println(" the employee " + employee.getEmpId() + " is added already");
		}
		return 0;
	}
	public static boolean findEmployee(int emp_Id) {
		// TODO Auto-generated method stub
		Iterator<Employee> empItr1 = empList.iterator();
		while (empItr1.hasNext()) {
			Employee emp1 = (Employee) empItr1.next();
			if (emp1.getEmpId() == emp_Id) {
				return true;
			}
		}
		return false;
	}
	public static int removeEmployeData(int emp_Id) {
		// TODO Auto-generated method stub
		Employee empDel = null;

		for (Employee emp2 : empList) {
			if (emp2.getEmpId() == emp_Id) {
				empDel = emp2;
			}
		}
		if (empDel == null) {
			System.out.println("the employee " + empDel.getEmpId() + " is not in list");
		} else {
			empList.remove(empDel);
			System.out.println("the employee " + empDel.getEmpId() + " is removed from list");
		}
		return 0;
	}
	public static Employee getEmployeeData(int emp_Id) {
		// TODO Auto-generated method stub
		Iterator<Employee> empItr2 = empList.iterator();
		while (empItr2.hasNext()) {
			Employee emp3 = (Employee) empItr2.next();
			if (emp3.getEmpId() == emp_Id) {
				System.out.println("the employee " + emp_Id + "'s datas are:");
				System.out.println(emp3);
				return emp3;
			}
		}
		return null;
	}
	public static Employee updateEmployeeData(int emp_Id, Scanner input1, Scanner input2) {
		// TODO Auto-generated method stub
		if (findEmployee(emp_Id)) {
			Employee emp4 = getEmployeeData(emp_Id);
			System.out.println("Please enter all new data to be updated of " + emp_Id);
			System.out.println("enter Employee new ID");
			int empIdN = input1.nextInt();
			System.out.println("enter Employee new NAME");
			String empNameN = input2.nextLine();
			System.out.println("enter Employee new Skills S1");
			String sk1N = input2.nextLine();
			System.out.println("enter Employee new Skills S2");
			String sk2N = input2.nextLine();
			System.out.println("enter Employee new Skills S3");
			String sk3N = input2.nextLine();
			System.out.println("enter Employee new Skills S4");
			String sk4N = input2.nextLine();
			System.out.println("enter Employee new Skills S5");
			String sk5N = input2.nextLine();
			System.out.println("enter Employee new AGE");
			int empAgeN = input1.nextInt();
			System.out.println("enter Employee new SALARY");
			double empSalaryN = input1.nextDouble();
			System.out.println("enter Employee new JOINDATE");
			String empJoinDateN = input2.nextLine();
			System.out.println("enter new More Skills");
			AddSkills str=new AddSkills();
			ArrayList<String> empMoreSkills=str.getSkills();
			Skills empSkillsN = new Skills(sk1N, sk2N, sk3N, sk4N, sk5N);
			emp4.setEmpId(empIdN);
			emp4.setEmpName(empNameN);
			emp4.setEmpSkills(empSkillsN);
			emp4.setEmpAge(empAgeN);
			emp4.setEmpSalary(empSalaryN);
			emp4.setEmpJoinDate(empJoinDateN);
			emp4.setEmpMoreSkills(empMoreSkills);
			System.out.println("the data of employee " + emp_Id + " is updated in list");
		} else {
			System.out.println("the  employee " + emp_Id + " is not in the list");
		}
		return null;
	}
	public static int showAllEmployeesList() {
		// TODO Auto-generated method stub

		if (empList.isEmpty()) {
			System.out.println("the employee list is not available");
		} else {
			System.out.println("the list of employee is:");
			Iterator<Employee> empItr3 = empList.iterator();
			while (empItr3.hasNext()) {
				Employee emp5 = (Employee) empItr3.next();
				System.out.println(emp5);
			}
		}
		return 0;
	}
	public static int sortEmployeeByName() {
		// TODO Auto-generated method stub
		SortEmpsByName sN = new SortEmpsByName();
		Collections.sort(empList, sN);
		Iterator<Employee> empitrSN = empList.iterator();
		while (empitrSN.hasNext()) {
			Employee empSN = (Employee) empitrSN.next();
			System.out.println(empSN);
		}
		return 0;
	}
	public static int sortEmployeeByAge() {
		// TODO Auto-generated method stub
		SortEmpsByAge sA = new SortEmpsByAge();
		Collections.sort(empList, sA);
		Iterator<Employee> empitrSA = empList.iterator();
		while (empitrSA.hasNext()) {
			Employee empSA = (Employee) empitrSA.next();
			System.out.println(empSA);
		}
		return 0;
	}
	public static int sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		SortEmpsBySalary sS = new SortEmpsBySalary();
		Collections.sort(empList, sS);
		Iterator<Employee> empitrSS = empList.iterator();
		while (empitrSS.hasNext()) {
			Employee empSS = (Employee) empitrSS.next();
			System.out.println(empSS);
		}
		return 0;
	}

}
