import javax.swing.JOptionPane;

public class UseInsurance
{
	public static void main(String[] args)
	{
		String input;
		int select;

			input = JOptionPane.showInputDialog(null, "Which insurance type would you like?\n 1 - Life \n 2 - Health");
			select = Integer.parseInt(input);

			if(select == 1){	
				Life lInsur = new Life();
				lInsur.display();
			}
			
			else{
				Health hInsur = new Health();
				hInsur.display();
			}
	}
}