package collectionEntity;
public class Skills {
	private String sk1;
	private String sk2;
	private String sk3;
	private String sk4;
	private String sk5;
	public String getSk1() {
		return sk1;
	}
	public void setSk1(String sk1) {
		this.sk1 = sk1;
	}
	public String getSk2() {
		return sk2;
	}
	public void setSk2(String sk2) {
		this.sk2 = sk2;
	}
	public String getSk3() {
		return sk3;
	}
	public void setSk3(String sk3) {
		this.sk3 = sk3;
	}
	public String getSk4() {
		return sk4;
	}
	public void setSk4(String sk4) {
		this.sk4 = sk4;
	}
	public String getSk5() {
		return sk5;
	}
	public void setSk5(String sk5) {
		this.sk5 = sk5;
	}
	public Skills(String sk1, String sk2, String sk3, String sk4, String sk5) {
		super();
		this.sk1 = sk1;
		this.sk2 = sk2;
		this.sk3 = sk3;
		this.sk4 = sk4;
		this.sk5 = sk5;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Skills [sk1=" + sk1 + ", sk2=" + sk2 + ", sk3=" + sk3 + ", sk4=" + sk4 + ", sk5=" + sk5 + "]";
	}
}
