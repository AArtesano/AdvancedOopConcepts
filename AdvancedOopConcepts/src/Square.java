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
		System.out.println("The of Shape is a " + type);
		System.out.println("Height of " + type + ": " + height);
		System.out.println("Width of " + type + ": " + width);
		System.out.println("Area of " + type + ": " + calArea());
	}
}