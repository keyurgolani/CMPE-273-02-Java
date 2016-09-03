package assignment1.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void zeroSideLength() {
		Square square = new Square(0);
		assertTrue(square.getArea() == 0 && square.getPerimeter() == 0);
	}
	
	@Test
	public void largeSideLength() {
		Square square = new Square(9999);
		assertTrue(square.getArea() == (9999*9999) && square.getPerimeter() == (9999*4));
	}
	
	@Test
	public void decimalSideLength() {
		Square square = new Square(2.5);
		assertTrue(square.getArea() == 6.25 && square.getPerimeter() == 10);
	}
	
	@Test
	public void negativeSideLength() {
		Square square = new Square(-5);
		assertTrue(square.getArea() == 25 && square.getPerimeter() == 20);
	}
	
	@Test
	public void irrationalSideLength() {
		Square square = new Square(Math.PI);
		assertTrue(square.getArea() == (Math.PI * Math.PI) && square.getPerimeter() == (Math.PI * 4));
	}
	
	@Test
	public void compareAreaPerimeter() {
		Square square1 = new Square(5);
		Square square2 = new Square(10);
		assertTrue(square1.getArea() <= square2.getArea() && square1.getPerimeter() <= square2.getPerimeter());
	}
	
}
