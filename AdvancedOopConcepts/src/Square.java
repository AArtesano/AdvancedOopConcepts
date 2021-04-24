public class Square extends GeometricFigure{
	
	private static double Area;
	private static String type = "Square";
	
	public Square(double height, double width) {
		super(height, width);
		setType(type);
	}
	
	public double calArea() {
		Area = height * width;
		return Area;
	}
	
	public void display() {
		System.out.println("Type: " + type);
		System.out.println("Height of the " + type + ": " + height);
		System.out.println("Width of the " + type + ": " + width);
		System.out.println("Area of the " + type + ": " + calArea());
	}
}