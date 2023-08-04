package collectionControler;
import java.util.ArrayList;
import java.util.Scanner;
import collectionEntity.Employee;
import collectionEntity.Skills;
import collectionServices.EmployeeServices;
import collectionServicesImpl.EmployeeServiceImpl;
import collectionUtility.AddSkills;
import collectionUtility.Menu;
public class EmployeeController {
	public static void main(String[] args) {
		EmployeeServices services1 = new EmployeeServiceImpl();
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Menu choice = new Menu();
		int menu=7 ;
		do {
			choice.menu();
			menu=input.nextInt();
			switch (menu) {
			case 1:
				System.out.println("please enter datas of the employee as below ");
				System.out.println("enter Employee ID");
				int empId = input1.nextInt();
				System.out.println("enter Employee NAME");
				String empName = input2.nextLine();
				System.out.println("enter Employee Skills S1");
				String sk1 = input2.nextLine();
				System.out.println("enter Employee Skills S2");
				String sk2 = input2.nextLine();
				System.out.println("enter Employee Skills S3");
				String sk3 = input2.nextLine();
				System.out.println("enter Employee Skills S4");
				String sk4 = input2.nextLine();
				System.out.println("enter Employee Skills S5");
				String sk5 = input2.nextLine();
				System.out.println("enter Employee AGE");
				int empAge = input1.nextInt();
				System.out.println("enter Employee SALARY");
				double empSalary = input1.nextDouble();
				System.out.println("enter Employee JOINDATE");
				String empJoinDate = input2.nextLine();
				System.out.println("enter More Skills");
				AddSkills str=new AddSkills();
				ArrayList<String> empMoreSkills=str.getSkills();
				Skills empSkills = new Skills(sk1, sk2, sk3, sk4, sk5);
				Employee employee = new Employee(empId, empName, new Skills(sk1, sk2, sk3, sk4, sk5), empAge, empSalary,empJoinDate,empMoreSkills);
				services1.addEmployeeToList(employee);
				System.out.println("employee" + employee.getEmpId() + " is added in list");
				break;
			case 2:
				System.out.println("enter the employee id you want to remove");
				int emp_Id = input.nextInt();
				services1.removeEmployeData(emp_Id);
				break;
			case 3:
				System.out.println("enter the employee id you want to update");
				int emp_Id2 = input.nextInt();
				services1.updateEmployeeData(emp_Id2, input1, input2);
				break;
			case 4:
				System.out.println("enter the employee id you want to find");
				int emp_Id3 = input.nextInt();
				services1.getEmployeeData(emp_Id3);
				break;
			case 5:
				services1.showAllEmployeesList();
				break;
			case 6:
				int sel = 4;
				System.out.println("select the sorting operation as below");
				System.out.println("1 to sort by name");
				System.out.println("2 to sort by age");
				System.out.println("3 to sort by salary");
				Scanner srtOptn = new Scanner(System.in);
				sel = srtOptn.nextInt();
				switch (sel) {
				case 1:
					services1.sortEmployeeByName();
					break;
				case 2:
					services1.sortEmployeeByAge();
					break;
				case 3:
					services1.sortEmployeeBySalary();
					break;

				default:
					System.out.println("there are no other sorting methods only 1,2,3");
					break;
				}
				break;
			case 7:
				System.out.println("thank you!! for using me.....");
				break;
			default:
				System.out.println(" Please select the operations as given above");
				break;
			}
		} while (menu != 7);
	}
}
