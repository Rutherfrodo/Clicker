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
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.DebugGraphics;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.KeyEvent;

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
	private final JLabel lblNewLabel = new JLabel("CLICK");
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setName("Clicerk show");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		panel = new JPanel();
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel_1.setSize(new Dimension(36, 39));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.add(btnNewButton_5);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_2.add(btnNewButton_4);	
		panel_2.add(panel_3);		
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		panel_3.add(btnNewButton_6);
		panel_3.add(btnNewButton_1);
		panel_3.add(btnNewButton_2);
		panel.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		panel_6.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		lblNewLabel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_7.add(lblNewLabel_1);
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setDisplayedMnemonic(KeyEvent.VK_ACCEPT);
		lblNewLabel_1.setFont(new Font("Impact", Font.BOLD, 35));
		panel_7.add(lblNewLabel);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Impact", Font.BOLD, 35));
		lblNewLabel.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		panel_6.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
		panel.add(panel_4);
		panel_4.add(btnNewButton_3);
		panel_4.add(btnNewButton);
		panel.add(panel_5);
		

	}
	public void mainButton() {
		panel_5.add(btnButtonik);
		

		btnButtonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CLICK =CLICK+1;
				lblNewLabel.setText(""+ CLICK);
				
			}
		});
	}
	Przyciski BTN = new Przyciski( btnNewButton_1,23,43,"zzz");
	private final JLabel lblNewLabel_1 = new JLabel("Liczba klików: ");
	private final JPanel panel_7 = new JPanel();

}
