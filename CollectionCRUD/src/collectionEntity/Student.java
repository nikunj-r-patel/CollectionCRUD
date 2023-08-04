package collectionEntity;
public class Student {
	private int strollNo;
	private String stName;
	private String stAdd;
	public Student(int strollNo, String stName, String stAdd) {
		super();
		this.strollNo = strollNo;
		this.stName = stName;
		this.stAdd = stAdd;
	}
	public int getStrollNo() {
		return strollNo;
	}
	public void setStrollNo(int strollNo) {
		this.strollNo = strollNo;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStAdd() {
		return stAdd;
	}
	public void setStAdd(String stAdd) {
		this.stAdd = stAdd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [strollNo=" + strollNo + ", stName=" + stName + ", stAdd=" + stAdd + "]";
	}
}
