import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClicker {

	private JFrame frame;
	private JPanel PanelItemow;
	private double CLICK = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClicker window = new MainClicker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainClicker() {
		initialize();
	}
	JButton btnButtonik = new JButton("Buttonik");
	JButton btnNewButton_1 = new JButton("New button");
	JButton btnNewButton = new JButton("New button");
	JButton btnNewButton_3 = new JButton("New button");
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setName("Clicerk show");
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		PanelItemow = new JPanel();
		frame.getContentPane().add(PanelItemow, BorderLayout.EAST);
		PanelItemow.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		PanelItemow.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		panel_2.add(btnNewButton_3);
		panel_2.add(btnNewButton);
		panel_2.add(btnNewButton_1);
		
		JPanel PanelLayoutEast = new JPanel();
		PanelItemow.add(PanelLayoutEast);
		PanelLayoutEast.setLayout(new BoxLayout(PanelLayoutEast, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		
		panel_1.add(btnButtonik);

	}
	public void mainButton() {
		btnButtonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CLICK++;
			}
		});
	}

}
