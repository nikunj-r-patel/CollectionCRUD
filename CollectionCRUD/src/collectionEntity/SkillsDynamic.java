package collectionEntity;
import java.util.ArrayList;
import collectionUtility.AddSkills;
public class SkillsDynamic {
	private ArrayList<String> empMoreSkills;
	public SkillsDynamic(ArrayList<String> empMoreSkills) {
		super();
		this.empMoreSkills = empMoreSkills;
	}
	public SkillsDynamic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<String> getEmpMoreSkills() {
		return empMoreSkills;
	}
	public void setEmpMoreSkills(ArrayList<String> empMoreSkills) {
		this.empMoreSkills = empMoreSkills;
	}
	@Override
	public String toString() {
		return "SkillsDynamic [empMoreSkills=" + empMoreSkills + "]";
	}
}
