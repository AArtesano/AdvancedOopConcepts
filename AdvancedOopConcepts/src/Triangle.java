public class Triangle extends GeometricFigure{

	private static double Area;
	private static String type = "Triangle";
	
	public Triangle(double height, double width) {
		super(height, width);
		setType(type);
	}
	
	public double calArea() {
		Area = height * width * 0.5;
		return Area;
	}
	
	public void display() {
		System.out.println("\nType: " + type);
		System.out.println("Height of the " + type + ": " + height);
		System.out.println("Width of the " + type + ": " + width);
		System.out.println("Area of the " + type + ": " + calArea());
	}
}