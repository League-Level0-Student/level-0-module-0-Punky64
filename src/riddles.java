import javax.swing.JOptionPane;

public class riddles {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Fire = JOptionPane.showInputDialog("When I eat I grow, what am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (Fire.equals("fire")) {
			JOptionPane.showInputDialog("Corect");
			score=score+1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else if (Fire.matches("Fire")) {
			JOptionPane.showInputDialog("Corect"); 
			score=score+1;
			
		} else {
			JOptionPane.showInputDialog("nope");
		}
		// 6. Add some more riddles
		String nutin = JOptionPane.showInputDialog("The poor have it the rich need it and if you eat it you die");
		
		if (nutin.equals("nothing")) {
			JOptionPane.showInputDialog("Corect");
			score=score+1;
		}

		else if (Fire.matches("Nothing")) {
			JOptionPane.showInputDialog("Corect");
			score=score+1;
		} else {
			JOptionPane.showInputDialog("nope");
		}
		

		JOptionPane.showMessageDialog(null, "score "+score);
	}
}
