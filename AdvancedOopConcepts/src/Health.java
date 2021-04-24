import javax.swing.JOptionPane;

public class Health extends Insurance{
	
	private final double HealthCost = 196;

	public Health(){
		super("Health");
		setCost();
	}

	public void setCost(){
		monthCost = HealthCost;
	}

	public void display(){
		JOptionPane.showMessageDialog(null, "Insurance Type: " + getInsurType() + "\nMonthly Cost: $" + getMonthCost());
	}
}
