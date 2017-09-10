import javax.swing.JOptionPane;

public class quiz {
	public static void main(String[] args) {
		String Spiders = JOptionPane.showInputDialog("I bet you don't know how many legs does a spider has. But Lets see if you can guess");
		if (Spiders.equals("8")) {
			JOptionPane.showInputDialog("... C-Corect");

		} else if (Spiders.matches("[0-9]+")) {
			JOptionPane.showInputDialog("Ha no but I'll give you another chance");
}
		else if (Spiders.equals("eight")) {
			JOptionPane.showInputDialog("... C-Corect");
		}else{ JOptionPane.showInputDialog("Ha no but I'll give you another chance");
		}
		}

	}

