import javax.swing.JOptionPane;

 public class Joption15
 {
 public static void main(String[] args)
 {

	 int choice = JOptionPane.showConfirmDialog(null, "Click yes or no.");

	 if(choice == 0)
	 {
		 JOptionPane.showMessageDialog(null, "You clicked Yes!");
	 }
	 else if(choice == 1)
	 {
		 JOptionPane.showMessageDialog(null, "You clicked No!");
	 }
	 else
	 {
		 JOptionPane.showMessageDialog(null, "You clicked Cancel!");
	 }



	 System.exit(0);

 }
}