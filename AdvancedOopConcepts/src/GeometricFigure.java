public abstract class GeometricFigure {
	double height;
	double width;
	String type;
	
	public GeometricFigure(double h, double w) {
		height = h;
		width = w; 
	}
	
	public void setType (String t) {
		type = t;
	}
	
	public void display() {
		System.out.println("Type: " + type);
		System.out.println("Area of " + type + " " +calArea());
	}
	
	abstract double calArea();
}