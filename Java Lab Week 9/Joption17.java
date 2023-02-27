import javax.swing.JOptionPane;

 public class Joption17
 {
 public static void main(String[] args)
 {
	 int correct = 1;

	 do
	 {
		 int choice1 = JOptionPane.showConfirmDialog(null, "Was the java programming language first released in 1995?", "Yes or no?", JOptionPane.YES_NO_OPTION);
		 if(choice1 == 0)
		 {
			 correct++;
			 JOptionPane.showMessageDialog(null, "Yes, that's correct!");
			 int choice2 = JOptionPane.showConfirmDialog(null, "Is java an object-oriented language?", "yes or no?", JOptionPane.YES_NO_OPTION);
			 if(choice2 == 0)
			 {
				 correct++;
				 JOptionPane.showMessageDialog(null, "Yes, that's correct!");
				 int choice3 = JOptionPane.showConfirmDialog(null, "Was the java programming langauge developed by Bill Gates?", "yes or no?", JOptionPane.YES_NO_OPTION);
				 if(choice3 == 1)
				 {
					 correct++;
					   JOptionPane.showMessageDialog(null, "Yes, that's correct!");
				 }
				 else if(choice3 == 0)
				 {
					 correct = 4;
					 JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again");
				 }
			 }
			 else if(choice2 == 1)
			 {
				 correct = 4;
				 JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again");
			 }
		}
		 else if(choice1 == 1)
		 {
			 correct = 4;
		 	JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again");
		 }
	 }while(correct <3);



	System.exit(0);

 }
}