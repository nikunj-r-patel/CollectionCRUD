package collectionEntity;
import java.util.ArrayList;
import java.util.Date;
public class Employee {
	private int empId;
	private String empName;
	private Skills empSkills;
	private int empAge;
	private double empSalary;
	private String empJoinDate;
	private ArrayList<String> empMoreSkills;
	public Employee(int empId, String empName, Skills empSkills, int empAge, double empSalary, String empJoinDate,
			ArrayList<String> empMoreSkills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSkills = empSkills;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empJoinDate = empJoinDate;
		this.empMoreSkills = empMoreSkills;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Skills getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(Skills empSkills) {
		this.empSkills = empSkills;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public ArrayList<String> getEmpMoreSkills() {
		return empMoreSkills;
	}
	public void setEmpMoreSkills(ArrayList<String> empMoreSkills) {
		this.empMoreSkills = empMoreSkills;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSkills=" + empSkills + ", empAge=" + empAge
				+ ", empSalary=" + empSalary + ", empJoinDate=" + empJoinDate + ", empMoreSkills=" + empMoreSkills
				+ "]";
	}
}
