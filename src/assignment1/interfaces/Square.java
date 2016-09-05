package assignment1.interfaces;

public class Square extends Polygon {
	
	public Square() {
		this.numberOfSides = 4;
	}
	
	public Square(double lengthOfSide) {
		this.numberOfSides = 4;
		this.lengthOfSides = lengthOfSide;
	}
	
	@Override
	public double getArea() {
		return lengthOfSides * lengthOfSides;
	}
	
	public static void main(String[] args) {
		/*
		 * Topic: Interfaces in Java
		 * Problem: The figure square is a polygon and has some properties common to it.
		 * 		Also on the other hand, square and polygon both are closed figures. Now
		 * 		closed figures are concepts which has a conceptual existence but no physical
		 * 		attributes and concrete behavior. However, it does have generic behavior
		 * 		to provide with an area enclosed by it. We need to enforce all the inheritances
		 * 		of a closed figure to have this method and implement it in their own specific
		 * 		way without explicitly having an implementation for the closed figure itself.
		 * Solution: Interfaces provide with such a functionality where you can define a
		 * 		closed figure an interface where it doesn't have to implement any method but
		 * 		just declare the methods that it's inherited entities have to implement to be
		 * 		instantiated. The abstract class polygon will implement interface closed figure
		 * 		and will have enough information to implement the method for finding perimeter
		 * 		but will still not have enough to implement the method to find enclosed area.
		 * 		Hence, we will declare it as an abstract class where it will declare the method
		 * 		for finding area and the class square will extend it and implement the method in
		 * 		order to be instantiated as an object.
		 */
		
		double sideLength = 25.345;
		Square square1 = new Square(sideLength);
		System.out.println("Perimeter of a square with side length " + sideLength + " is " + square1.getPerimeter());
		System.out.println("Area of a square with side length " + sideLength + " is " + square1.getArea());
	}

}
