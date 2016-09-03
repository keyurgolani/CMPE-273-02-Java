package assignment1.interfaces;

public abstract class Polygon implements ClosedFigureInterface {
	
	public int numberOfSides;
	
	public double lengthOfSides;
	
	@Override
	public double getPerimeter() {
		return Math.abs(lengthOfSides) * numberOfSides;
	}

}
