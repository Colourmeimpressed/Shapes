public class Square extends Rectangle {
	
	public Square(double side) throws Exception {
		super(side, side);
	}
	
	private ShapeArea squareArea = ()-> getWidth() * getWidth();
	
	@Override
	public double perimeter() {
		return 4 * getWidth();
	}
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + " {s=" +getWidth() + "} perimeter = " + String.format("%g", perimeter()) + " --- Area: " + String.format("%g",  squareArea.area()) + "\n");
	}
}