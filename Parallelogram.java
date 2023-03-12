public class Parallelogram extends Rectangle {

	public Parallelogram(double width, double height) throws Exception {
		if(width > 0.0 && height > 0.0) {
			super.setHeight(height);
			super.setWidth(width);
		}else {
			throw new Exception("Invalid side(s)!");
		}
	}
	
	@Override
	public double perimeter() {
		return 2 * getWidth() + 2 * getHeight();
	}
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + " {w=" + getWidth() + ", h= "+ getHeight() + "} perimeter = " + String.format("%g", perimeter()) + "\n");
	}
}
