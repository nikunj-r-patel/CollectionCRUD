package collectionServices;
import collectionEntity.Student;
public interface StudentServicesLinkedList {
	public void creatStudentLinkedList();
	public void addStudentInLinkedList(Student student);
	public void showAllStudentsInLinkedList();
	public boolean checkStudentInLinkedList(int stdl_id);
	public Student getStudentDataByIdLinkedList(int stdl_id);
	public void removeStudentFromLinkedList(int stdl_id);
	public void updateStudentDataByIdLinkedList(int stdl_id, Student student);
}
