package UserInterfaceSignInSignUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class SignUpJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTxt;
	private JPasswordField passwordField;
	private JPasswordField confirmPassword;
	private JTextField emailIdTxt;
	private JTextField phoneNoTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpJFrame frame = new SignUpJFrame();
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
	public SignUpJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(6, 6, 879, 531);
		contentPane.add(panel);
		panel.setLayout(null);
		
		userNameTxt = new JTextField();
		userNameTxt.setBounds(353, 67, 130, 26);
		panel.add(userNameTxt);
		userNameTxt.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(353, 126, 130, 26);
		panel.add(passwordField);
		
		confirmPassword = new JPasswordField();
		confirmPassword.setBounds(353, 187, 130, 26);
		panel.add(confirmPassword);
		
		emailIdTxt = new JTextField();
		emailIdTxt.setBounds(353, 294, 130, 26);
		panel.add(emailIdTxt);
		emailIdTxt.setColumns(10);
		
		phoneNoTxt = new JTextField();
		phoneNoTxt.setBounds(353, 351, 130, 26);
		panel.add(phoneNoTxt);
		phoneNoTxt.setColumns(10);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.setBounds(353, 409, 130, 29);
		panel.add(signUpBtn);
		
		JLabel userNameLb = new JLabel("UserName");
		userNameLb.setBounds(267, 72, 64, 16);
		panel.add(userNameLb);
		
		JLabel passwordLb = new JLabel("Password");
		passwordLb.setBounds(267, 131, 61, 16);
		panel.add(passwordLb);
		
		JLabel confirmPassLb = new JLabel("Confirm Password");
		confirmPassLb.setBounds(214, 192, 114, 16);
		panel.add(confirmPassLb);
		
		JLabel emailLb = new JLabel("Email Id");
		emailLb.setBounds(291, 299, 50, 16);
		panel.add(emailLb);
		
		JLabel phoneNoLb = new JLabel("Phone No");
		phoneNoLb.setBounds(280, 356, 61, 16);
		panel.add(phoneNoLb);
		
		JButton signInBtn = new JButton("Sign In");
		signInBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingPageJFrame landingPageJFrame= new LandingPageJFrame();
				landingPageJFrame.setVisible(true);
				dispose();
				
			}
		});
		signInBtn.setBounds(359, 473, 124, 29);
		panel.add(signInBtn);
		
		JComboBox roleNameCombobox = new JComboBox<String>();
		roleNameCombobox.setBounds(353, 244, 130, 27);
		roleNameCombobox.addItem("");
		roleNameCombobox.addItem("PATIENT");
		roleNameCombobox.addItem("COUNSELOR");
		roleNameCombobox.addItem("DOCTOR");
		roleNameCombobox.addItem("PHARMACY");
		roleNameCombobox.addItem("REHAB");
		roleNameCombobox.addItem("JAILADMIN");
		roleNameCombobox.addItem("LEGAL ADVISOR");
		roleNameCombobox.addItem("POLICE");
		roleNameCombobox.addItem("PSYCH WARD");
		panel.add(roleNameCombobox);
		
		JLabel roleNameBtn = new JLabel("RoleName");
		roleNameBtn.setBounds(254, 248, 69, 16);
		panel.add(roleNameBtn);
	}
}
