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
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.SwingConstants;

public class MainClicker extends JFrame {

	private JFrame frame;
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
		mainButton();
	}
	JButton btnButtonik = new JButton("Buttonik");
	
	JButton btnNewButton_1 = new JButton("New 1");
	JButton btnNewButton = new JButton("New 2");
	JButton btnNewButton_3 = new JButton("New 3");
	private final JTextField textField = new JTextField();
	JButton btnNewButton_2 = new JButton("New 7");
	private JPanel panel;
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JButton btnNewButton_4 = new JButton("New 4");
	private final JButton btnNewButton_5 = new JButton("New 5");
	private final JPanel panel_3 = new JPanel();
	private final JButton btnNewButton_6 = new JButton("New 6");
	private final JPanel panel_4 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JPanel panel_6 = new JPanel();
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel_6.add(textField);
		
		textField.setMinimumSize(new Dimension(6, 28));
		textField.setColumns(15);
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setName("Clicerk show");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel_1.setSize(new Dimension(36, 39));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		panel_1.add(btnNewButton_5);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		panel_2.add(btnNewButton_4);	
		panel_2.add(panel_3);		
		panel_3.add(btnNewButton_6);
		panel_3.add(btnNewButton_1);
		panel_3.add(btnNewButton_2);
		panel.add(panel_4);
		panel.add(panel_5);
		panel.add(panel_6);
		panel_6.add(btnButtonik);
		panel_6.add(btnNewButton);
		panel_6.add(btnNewButton_3);
		

	}
	public void mainButton() {
		

		btnButtonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CLICK =CLICK+1;
				textField.setText("Liczba Clickow: "+ CLICK);
				
			}
		});
	}
	Przyciski BTN = new Przyciski( btnNewButton_1,23,43,"zzz");
}
