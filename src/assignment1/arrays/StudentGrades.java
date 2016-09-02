package assignment1.arrays;

public class StudentGrades {
	
	private double[] grades;
	
	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public StudentGrades() {
		grades = new double[10];
	}
	
	public StudentGrades(int classSize) {
		grades = new double[classSize];
	}
	
	public StudentGrades(double[] grades) {
		this.grades = grades;
	}
	
	public double getMeanGrade() {
		double totalGrade = 0;
		for (int i = 0; i < grades.length; i++) {
			totalGrade += grades[i];
		}
		return totalGrade/(double)grades.length;
	}
	
	public double getGrade(int studentNo) {
		double returnValue = 0;
		if(studentNo > 0) {
			if(studentNo < grades.length) {
				returnValue = grades[studentNo + 1];
			}
		}
		return returnValue;
	}
	
	public void addGrade(int studentNo, double grade) {
		if(studentNo > 0) {
			if(studentNo < grades.length) {
				grades[studentNo - 1] = grade;
			}
		}
	}

}
