public class Triangle implements Shapes{

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle (double sideA, double sideB, double sideC) throws Exception{
		if (sideA > 0.0 && sideB > 0.0 && sideC > 0.0 && (sideA+sideB) > sideC) {
			this.side1 = sideA;
			this.side2 = sideB;
			this.side3 = sideC;
		}else {
			throw new Exception("Invalid side(s)!");
		}
	}
	
	public double getSide1() {
		return side1;
	}
	
	public void setSide1(double sideA) throws Exception {
		if(sideA > 0.0) {
			this.side1 = sideA;
		}else {
			throw new Exception ("Invalid side!");
		}
	}
	
	public double getSide2() {
		return side2;
	}
	
	public void setSide2(double sideB) throws Exception {
		if(sideB > 0.0) {
			this.side1 = sideB;
		}else {
			throw new Exception ("Invalid side!");
		}
	}
	
	public double getSide3() {
		return side3;
	}
	
	public void setSide3(double sideC) throws Exception {
		if(side3 > 0.0) {
			this.side3 = sideC;
		}else {
			throw new Exception ("Invalid side!");
		}
	}
	
	@Override
	public double perimeter() {
		return getSide1() + getSide2() + getSide3();
	}
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + " {s1=" + getSide1() + ", s2= "+ getSide2() + ", s3=" + getSide3() + "} perimeter = " + String.format("%g", perimeter()) + "\n");
	}
}
