package assignment1.arrays;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import utility.ProjectUtility;

public class StudentGradesArrayTest {

	@Test
	public void testLargeClass() {
		StudentGradesArray class1 = new StudentGradesArray(500000);
		int upperBound = 50;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		double classAverage = class1.getMeanGrade();
		assertTrue((classAverage >= 0) && (classAverage <= upperBound));
	}

	@Test
	public void testSmallClass() {
		StudentGradesArray class2 = new StudentGradesArray(5);
		int upperBound = 50;
		class2.setGrades(ProjectUtility.fillWithRandomGrades(class2.getGrades(), upperBound));
		double classAverage = class2.getMeanGrade();
		assertTrue((classAverage >= 0) && (classAverage <= upperBound));
	}
	
	@Test
	public void testLargeValues() {
		StudentGradesArray class1 = new StudentGradesArray(50);
		int upperBound = 500000;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		double classAverage = class1.getMeanGrade();
		assertTrue((classAverage >= 0) && (classAverage <= upperBound));
	}
	
	@Test
	public void testAllZeroGrades() {
		StudentGradesArray class1 = new StudentGradesArray(50);
		int upperBound = 0;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		double classAverage = class1.getMeanGrade();
		assertTrue(classAverage == 0);
	}
	
	@Test
	public void testAllFullGrades() {
		StudentGradesArray class1 = new StudentGradesArray(50);
		int upperBound = 50;
		class1.setGrades(ProjectUtility.fillWithFullGrades(class1.getGrades(), upperBound));
		double classAverage = class1.getMeanGrade();
		assertTrue(classAverage == upperBound);
	}
	
	@Test
	public void testFirstStudent() {
		StudentGradesArray class1 = new StudentGradesArray(50);
		int upperBound = 50;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		assertTrue((class1.getGrade(0) >= 0) && (class1.getGrade(0) <= upperBound));
	}
	
	@Test
	public void testLastStudent() {
		StudentGradesArray class1 = new StudentGradesArray(50);
		int upperBound = 50;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		assertTrue((class1.getGrade(50) >= 0) && (class1.getGrade(50) <= upperBound));
	}
	
	@Test
	public void testZeroStudents() {
		StudentGradesArray class1 = new StudentGradesArray(0);
		int upperBound = 50;
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades(), upperBound));
		assertTrue(class1.getMeanGrade() == 0);
	}

}
