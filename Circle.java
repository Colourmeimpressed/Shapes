public class Circle implements Shapes {

	private double radius;
	
	public Circle(double radius) throws Exception {
		if(radius > 0.0) {
		this.radius = radius;
		}else
			throw new Exception("Invalid radius!");
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) throws Exception {
		if(radius > 0.0) {
		this.radius = radius;
		}else {
			throw new Exception("Invalid radius!");
		}
	}
	
	private ShapeArea circleArea = ()-> Math.PI * getRadius() * getRadius();
	
	@Override
	public double perimeter() {
		return 2* Math.PI * getRadius();
	}
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + " {r=" +getRadius() + "} perimeter = " + String.format("%g", perimeter())  + " --- Area: " + String.format("%g",  circleArea.area()) + "\n");
	}
}
