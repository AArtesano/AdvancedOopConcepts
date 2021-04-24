
public class UseGeometric {
	
	public static void main (String[] args) {
		GeometricFigure[] fig = new GeometricFigure[2];
		fig[0]= new Square (4,4);
		fig[1]= new Triangle (3,3);
		
		for(int i = 0; i < 2; i++) {
			fig[i].display();
		}
	}
}