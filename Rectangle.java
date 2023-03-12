public class Rectangle implements Shapes {
	private double width;
	private double length;
	
	public Rectangle() {
		this.width = 0.0;
		this.length = 0.0;
	}
	
	public Rectangle(double width, double height) throws Exception {
		if(width > 0.0 && height > 0.0) {
		this.width = width;
		this.length = height;
		}else {
			throw new Exception("Invalid side!");
		}
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) throws Exception {
		if(width > 0.0) {
		this.width = width;
		}else {
			throw new Exception("Invalid side!");
		}
	}

	public double getHeight() {
		return length;
	}

	public void setHeight(double height) throws Exception {
		if(height > 0.0) {
		this.length = height;
		}else {
			throw new Exception("Invalid side!");
		}
	}

	private ShapeArea rectangleArea = ()-> getWidth() * getHeight();
	
	@Override
	public double perimeter() {
		return 2 * getWidth() + 2 * getHeight();
	}
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + " {w=" + getWidth() + ", h= "+ getHeight() + "} perimeter = " + String.format("%g", perimeter())  + " --- Area = " + String.format("%g",  rectangleArea.area()) + "\n");
	}
}
