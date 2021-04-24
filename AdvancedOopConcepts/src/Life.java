import javax.swing.JOptionPane;

public class Life extends Insurance{
	private final double LifeCost = 36;

	public Life(){
		super("Life");
		setCost();
	}

	public void setCost(){
		monthCost = LifeCost;
	}

	public void display(){
		JOptionPane.showMessageDialog(null, "Insurance Type: " + getInsurType() + "\nMonthly Cost: $" + getMonthCost());
	}
}