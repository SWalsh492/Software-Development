import javax.swing.JOptionPane;

 public class Joption14
 {
 public static void main(String[] args)
 {
	 String input;
	 String title;
	 int num;
	 String number;

	 input = JOptionPane.showInputDialog("What word(s) will be output: ");
	 title = JOptionPane.showInputDialog("What is the message title?");
	 number = JOptionPane.showInputDialog("Enter number of times word should be printed: ");
	 num = Integer.parseInt(number);

	 for(num = Integer.parseInt(number); num > 0; num--)
	 {
		 JOptionPane.showMessageDialog(null,input + " " + num, title, JOptionPane.PLAIN_MESSAGE);
	 }

	 System.exit(0);

 }
}