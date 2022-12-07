package UserInterfaceSignInSignUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPageJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPageJFrame frame = new LandingPageJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public LandingPageJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel landingLeftJPanel = new JPanel();
		landingLeftJPanel.setBackground(Color.GRAY);
		landingLeftJPanel.setBounds(6, 6, 433, 490);
		contentPane.add(landingLeftJPanel);
		landingLeftJPanel.setLayout(null);
		
		JPanel landingRightJPanel = new JPanel();
		landingRightJPanel.setBackground(SystemColor.textHighlight);
		landingRightJPanel.setBounds(443, 6, 454, 490);
		contentPane.add(landingRightJPanel);
		landingRightJPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(183, 110, 130, 26);
		landingRightJPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 170, 130, 26);
		landingRightJPanel.add(passwordField);
		
		JLabel userNameLb = new JLabel("UserName");
		userNameLb.setBounds(105, 115, 66, 16);
		landingRightJPanel.add(userNameLb);
		
		JLabel passwordLb = new JLabel("Password");
		passwordLb.setBounds(105, 175, 66, 16);
		landingRightJPanel.add(passwordLb);
		
		JButton signInBtn = new JButton("Sign In");
		signInBtn.setBounds(183, 231, 130, 29);
		landingRightJPanel.add(signInBtn);
		
		JLabel newUserLb = new JLabel("New User ?");
		newUserLb.setBounds(96, 277, 75, 16);
		landingRightJPanel.add(newUserLb);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpJFrame signUpFrame= new SignUpJFrame();
				signUpFrame.setVisible(true);
				dispose();
				
				
			}
		});
		signUpBtn.setBounds(183, 272, 130, 29);
		landingRightJPanel.add(signUpBtn);
	}
}
