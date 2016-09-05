package assignment1.arrays;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import utility.ProjectUtility;

public class StudentGradesArray {
	
	private double[] grades;
	
	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public StudentGradesArray() {
		grades = new double[10];
	}
	
	public StudentGradesArray(int classSize) {
		grades = new double[classSize];
	}
	
	public StudentGradesArray(double[] grades) {
		this.grades = grades;
	}
	
	public double getMeanGrade() {
		double totalGrade = 0;
		for (int i = 0; i < grades.length; i++) {
			totalGrade += grades[i];
		}
		
		return grades.length == 0 ? 0 : totalGrade/(double)grades.length;
	}
	
	public double getGrade(int studentNo) {
		double returnValue = 0;
		if(studentNo > 0) {
			if(studentNo <= grades.length) {
				returnValue = grades[studentNo - 1];
			}
		}
		return returnValue;
	}
	
	public void addGrade(int studentNo, double grade) {
		if(studentNo > 0) {
			if(studentNo <= grades.length) {
				grades[studentNo - 1] = grade;
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Topic: Arrays in Java
		 * Problem: For a class when we store every student's marks, we want to access any
		 * 		student's marks instantaneously.
		 * Solution: Arrays provide instantaneous access to an element inside it and you can
		 * 		store the marks of a large number of students in the class.
		 */
		StudentGradesArray class1 = new StudentGradesArray(10);
		int upperBound = 50;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		System.out.println("Class Grade Average: " + class1.getMeanGrade());
		for(int i = 1; i <= 10; i++) {
			NumberFormat formatter = new DecimalFormat("#0.00");
			System.out.println("Student " + i + " Grades: " + formatter.format(class1.getGrade(i)));
		}
	}

}
