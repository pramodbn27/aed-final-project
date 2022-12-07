package UserInterfacePatientEnterPrise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import UserInterfaceSignInSignUp.LandingPageJFrame;

import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PatientRegistrationJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientRegistrationJFrame frame = new PatientRegistrationJFrame();
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
	public PatientRegistrationJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel patientJPanel = new JPanel();
		patientJPanel.setBounds(6, 6, 940, 547);
		contentPane.add(patientJPanel);
		patientJPanel.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(6, 6, 928, 535);
		patientJPanel.add(splitPane);
		
		JPanel patientRegRightJPanel = new JPanel();
		patientRegRightJPanel.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(patientRegRightJPanel);
		
		JPanel patientRegLeftJPanel = new JPanel();
		patientRegLeftJPanel.setBackground(Color.GRAY);
		splitPane.setLeftComponent(patientRegLeftJPanel);
		
		JButton patientRegBtn = new JButton("Enter Patient Details");
		patientRegBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientRegJPanel patientRegJPanel=new PatientRegJPanel();
				splitPane.setRightComponent(patientRegJPanel);
			}
		});
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingPageJFrame landingPageJFrame = new LandingPageJFrame();
				landingPageJFrame.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_patientRegLeftJPanel = new GroupLayout(patientRegLeftJPanel);
		gl_patientRegLeftJPanel.setHorizontalGroup(
			gl_patientRegLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientRegLeftJPanel.createSequentialGroup()
					.addGroup(gl_patientRegLeftJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientRegLeftJPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(patientRegBtn))
						.addGroup(gl_patientRegLeftJPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(logoutBtn)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_patientRegLeftJPanel.setVerticalGroup(
			gl_patientRegLeftJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientRegLeftJPanel.createSequentialGroup()
					.addGap(79)
					.addComponent(patientRegBtn)
					.addPreferredGap(ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
					.addComponent(logoutBtn)
					.addGap(42))
		);
		patientRegLeftJPanel.setLayout(gl_patientRegLeftJPanel);
	}

}
