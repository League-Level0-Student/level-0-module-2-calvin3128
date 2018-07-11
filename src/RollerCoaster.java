import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("How tall are you in inches?");
	int height = Integer.parseInt(input);
	if(height > 48) {
	JOptionPane.showMessageDialog(null,"Have fun on the ride!");
	}
	else {
		JOptionPane.showMessageDialog(null,"Grow harder then come back ");
	}
}
}
