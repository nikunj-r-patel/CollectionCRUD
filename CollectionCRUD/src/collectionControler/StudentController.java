package collectionControler;
import collectionEntity.Student;
import collectionServices.StudentServices;
import collectionServices.StudentServicesLinkedList;
import collectionServicesImpl.StudentServiceImpl;
import collectionServicesImpl.StudentServicesLinkedListImpl;
public class StudentController {
	public static void main(String[] args) {
	//---------ArrrayList--------------------------
		StudentServices service=new StudentServiceImpl();
		service.creatStudentArrayList();
		System.out.println("0------");
		service.addStudentInArrayList(new Student(104, "sanjay", "jamnagar"));
		service.addStudentInArrayList(new Student(105, "nimesh", "rajkot"));
		service.showAllStudents();
		System.out.println("1------");
		service.checkStudentInArrayList(102);
		System.out.println("2------");
		service.getStudentDataById(103);
		System.out.println("3------");
		service.showAllStudents();
		System.out.println("4------");
		service.removeStudentFromArryList(105);
		System.out.println("5------");
		service.showAllStudents();
		System.out.println("7------");
		service.addStudentInArrayList(new Student(105, "nimesh", "rajkot"));
		System.out.println("8------");
		service.showAllStudents();
		System.out.println("9------");
		service.updateStudentDataById(101, new Student(101, "nilesh", "vadodara"));
		System.out.println("10------");
		service.showAllStudents();
		//-------------linkedList---------------------------------------
		StudentServicesLinkedList serviceL=new StudentServicesLinkedListImpl();
		serviceL.creatStudentLinkedList();
		System.out.println("0-----LinkedList----");
		serviceL.addStudentInLinkedList(new Student(105, "tushar", "udhana"));
		serviceL.addStudentInLinkedList(new Student(106, "ravi", "bardoli"));
		serviceL.showAllStudentsInLinkedList();
		System.out.println("1-----LinkedList----");
		serviceL.checkStudentInLinkedList(105);
		System.out.println("2-----LinkedList----");
		serviceL.getStudentDataByIdLinkedList(104);
		System.out.println("3-----LinkedList----");
		serviceL.removeStudentFromLinkedList(106);
		System.out.println("4-----LinkedList----");
		serviceL.showAllStudentsInLinkedList();
		System.out.println("5-----LinkedList----");
		serviceL.updateStudentDataByIdLinkedList(101, new Student(101, "ravi", "bardoli"));
		System.out.println("6-----LinkedList----");
		serviceL.showAllStudentsInLinkedList();
		System.out.println("7-----LinkedList----");
	}
}
