package collectionServicesImpl;
import java.util.ArrayList;
import java.util.Iterator;
import collectionEntity.Student;
import collectionServices.StudentServices;
public class StudentServiceImpl implements StudentServices {
	ArrayList<Student> arrListStd1;
	@Override
	public void creatStudentArrayList() {
		// TODO Auto-generated method stub
		arrListStd1 = new ArrayList<Student>();
		arrListStd1.add(new Student(101, "nikunj", "Surat"));
		arrListStd1.add(new Student(102, "mayank", "G'nagar"));
		arrListStd1.add(new Student(103, "divyesh", "A'bad"));
		System.out.println("Array List of Student created successfully");
	}
	@Override
	public void addStudentInArrayList(Student student) {
		// TODO Auto-generated method stub
		if (!checkStudentInArrayList(student.getStrollNo())) {
			arrListStd1.add(student);
			System.out.println("the Student " + student.getStrollNo() + " is added successfully");
		} else {
			System.out.println("the Student " + student.getStrollNo() + " is alredy added");
		}
	}
	@Override
	public void showAllStudents() {
		// TODO Auto-generated method stub
		if (arrListStd1.isEmpty()) {
			System.out.println("there is no data in Arraylist");
		} else {
			arrListStd1.forEach(std -> {
				System.out.println(std.getStrollNo() + " " + std.getStName() + " " + std.getStAdd());
			});
		}
	}
	@Override
	public boolean checkStudentInArrayList(int std_id) {
		// TODO Auto-generated method stub
		arrListStd1.forEach(std0 -> {
			if (std0.getStrollNo() == std_id) {
				System.out.println(std0 + " is present ");
				return;
			}
		});
		return false;
	}
	@Override
	public Student getStudentDataById(int std_id) {
		// TODO Auto-generated method stub
		arrListStd1.forEach(std1 -> {
			if (std1.getStrollNo() == std_id) {
				System.out.println(std1.getStrollNo() + " " + std1.getStName() + " " + std1.getStAdd());
			}
		});
		return null;
	}
	@Override
	public void removeStudentFromArryList(int std_id) {
		// TODO Auto-generated method stub
		Iterator<Student> itrStd = arrListStd1.iterator();
		while (itrStd.hasNext()) {
			Student student = (Student) itrStd.next();
			if (student.getStrollNo() == std_id) {
				itrStd.remove();
				System.out.println("student " + student.getStrollNo() + " is removed");
				break;
			}
		}
	}
	@Override
	public void updateStudentDataById(int std_id, Student student) {
		// TODO Auto-generated method stub
		Iterator<Student> itrStd1 = arrListStd1.iterator();
		while (itrStd1.hasNext()) {
			Student student1 = (Student) itrStd1.next();
			if (student1.getStrollNo() == std_id) {
				itrStd1.remove();
				addStudentInArrayList(student);
				System.out.println("student " + student1.getStrollNo() + " is updated");
				break;
			} else {
				System.out.println("ther is no student with " + std_id);
			}
		}

	}

}
