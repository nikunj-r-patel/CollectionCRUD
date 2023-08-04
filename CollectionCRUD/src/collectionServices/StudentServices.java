package collectionServices;
import collectionEntity.Student;
public interface StudentServices {
	public void creatStudentArrayList();
	public void addStudentInArrayList(Student student);
	public void showAllStudents();
	public boolean checkStudentInArrayList(int std_id);
	public Student getStudentDataById(int std_id);
	public void removeStudentFromArryList(int std_id);
	public void updateStudentDataById(int std_id, Student student);
}
