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

}
