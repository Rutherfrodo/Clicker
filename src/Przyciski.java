import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Przyciski {
	public Przyciski(final JButton przycisk, double koszt, double multiplier, String TekstButton) {
		
		przycisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				przycisk.setText(TekstButton);
				
			}
		});
	
	}

}