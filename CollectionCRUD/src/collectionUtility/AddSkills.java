package collectionUtility;
import java.util.ArrayList;
import java.util.Scanner;
public class AddSkills {
	Scanner sC = new Scanner(System.in);
	public ArrayList<String> getSkills() {
		ArrayList<String> arrStr = new ArrayList<String>();
		System.out.println("add multiple skills using enter for next skill");
		System.out.println("enter empty string when you want to stop");
		boolean flag = true;
		while (flag) {
			String strIn = sC.nextLine();
			if (strIn.isEmpty()) {
				flag = false;
			}
			arrStr.add(strIn);
		}
		return arrStr;
	}

}
