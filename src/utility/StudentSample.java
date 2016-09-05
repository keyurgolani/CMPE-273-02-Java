package utility;

public class StudentSample {
	
	public String name;
	public String id;
	public String dept;
	
	public StudentSample(String name, String id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		String toString = "";
		toString = toString + "Name:" + "\t" + "\t" + this.name + "\n";
		toString = toString + "ID:" + "\t" + "\t" + this.id + "\n";
		toString = toString + "Department:" + "\t" + dept + "\n";
		return toString;
	}

}
