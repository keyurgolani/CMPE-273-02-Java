package assignment1.arrays;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import utility.ProjectUtility;

public class StudentGradesTest {

	@Test
	public void testLargeClass() {
		StudentGrades class1 = new StudentGrades(500000);
		class1.setGrades(ProjectUtility.fillWithRandomGrades(class1.getGrades()));
		
	}

	@Test
	public void testSmallClass() {
		
	}
	
	@Test
	public void testLargeValues() {
		
	}
	
	@Test
	public void testAllZeroGrades() {
		
	}
	
	@Test
	public void testAllFullGrades() {
		
	}
	
	@Test
	public void testFirstStudent() {
		
	}
	
	@Test
	public void testLastStudent() {
		
	}
	
	@Test
	public void testZeroStudents() {
		
	}

}
