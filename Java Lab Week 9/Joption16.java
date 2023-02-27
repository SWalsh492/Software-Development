import javax.swing.JOptionPane;

 public class Joption16
 {
 public static void main(String[] args)
 {
	 int correct = 1;

	while(correct == 1)
	{
		int choice = JOptionPane.showConfirmDialog(null, "Was the java programming language first released in 1995?", "Yes or no?", JOptionPane.YES_NO_OPTION);

	 	if(choice == 0)
	 	{
			 correct++;
			 JOptionPane.showMessageDialog(null, "Yes, that's correct! The java programming languaged was first released by Sun Microsystems in 1995.");
	 	}
	 	else if(choice == 1)
	 	{
			 JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again");
	 	}
	}



	 System.exit(0);

 }
}