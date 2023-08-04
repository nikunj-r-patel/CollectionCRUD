package collectionServicesImpl;

import java.util.Iterator;
import java.util.LinkedList;
import collectionEntity.Student;
import collectionServices.StudentServicesLinkedList;

public class StudentServicesLinkedListImpl implements StudentServicesLinkedList {
	LinkedList<Student> linkdList1;

	@Override
	public void creatStudentLinkedList() {
		// TODO Auto-generated method stub
		linkdList1 = new LinkedList<Student>();
		linkdList1.add(new Student(101, "nikunj", "bhagal"));
		linkdList1.add(new Student(102, "manish", "beshan"));
		linkdList1.add(new Student(103, "sandeep", "selvas"));
		linkdList1.add(new Student(104, "prashant", "dandi"));
		System.out.println("Linked List of Student created successfully");
	}
	@Override
	public void addStudentInLinkedList(Student student) {
		// TODO Auto-generated method stub
		linkdList1.add(student);
	}
	@Override
	public void showAllStudentsInLinkedList() {
		// TODO Auto-generated method stub
		if (linkdList1.isEmpty()) {
			System.out.println("there is no data in Linked list");
		} else {
			linkdList1.forEach(std -> {
				System.out.println(std.getStrollNo() + " " + std.getStName() + " " + std.getStAdd());
			});
		}
	}
	@Override
	public boolean checkStudentInLinkedList(int stdl_id) {
		// TODO Auto-generated method stub
		linkdList1.forEach(stdl0 -> {
			if (stdl0.getStrollNo() == stdl_id) {
				System.out.println(stdl0 + " is present ");
				return;
			}
		});
		return false;
	}
	@Override
	public Student getStudentDataByIdLinkedList(int stdl_id) {
		// TODO Auto-generated method stub
		linkdList1.forEach(stdl1 -> {
			if (stdl1.getStrollNo() == stdl_id) {
				System.out.println(stdl1.getStrollNo() + " " + stdl1.getStName() + " " + stdl1.getStAdd());
			}
		});
		return null;
	}
	@Override
	public void removeStudentFromLinkedList(int stdl_id) {
		// TODO Auto-generated method stub
		Iterator<Student> itrStdl = linkdList1.iterator();
		while (itrStdl.hasNext()) {
			Student student = (Student) itrStdl.next();
			if (student.getStrollNo() == stdl_id) {
				itrStdl.remove();
				System.out.println("student " + student.getStrollNo() + " is removed");
				break;
			}
		}
	}
	@Override
	public void updateStudentDataByIdLinkedList(int stdl_id, Student student) {
		// TODO Auto-generated method stub
		Iterator<Student> itrStd1 = linkdList1.iterator();
		while (itrStd1.hasNext()) {
			Student student1 = (Student) itrStd1.next();
			if (student1.getStrollNo() == stdl_id) {
				itrStd1.remove();
				addStudentInLinkedList(student);
				System.out.println("student " + student1.getStrollNo() + " is updated");
				break;
			}
		}
	}

}
