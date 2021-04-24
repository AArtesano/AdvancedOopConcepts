
public abstract class Insurance{
	private String insurType;
	protected double monthCost;
	
	public Insurance(String type){
		insurType = type;
	}

	public String getInsurType(){
		return insurType;
	}

	public double getMonthCost(){
		return monthCost;
	}

	public abstract void setCost();
	public abstract void display();
} 