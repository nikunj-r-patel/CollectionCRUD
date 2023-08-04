package collectionUtility;

import java.util.Comparator;

import collectionEntity.Employee;

public class SortEmpsById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId() - o2.getEmpId();
	}

}
