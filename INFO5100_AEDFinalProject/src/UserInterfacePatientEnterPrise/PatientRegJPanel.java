package UserInterfacePatientEnterPrise;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JButton;

public class PatientRegJPanel extends JPanel {
	private JTextField patientIdTxt;
	private JTextField patientNameTxt;
	private JTextField patientAgeTxt;

	/**
	 * Create the panel.
	 */
	public PatientRegJPanel() {
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		patientIdTxt = new JTextField();
		patientIdTxt.setBounds(193, 55, 130, 26);
		add(patientIdTxt);
		patientIdTxt.setColumns(10);
		
		patientNameTxt = new JTextField();
		patientNameTxt.setBounds(193, 109, 130, 26);
		add(patientNameTxt);
		patientNameTxt.setColumns(10);
		
		patientAgeTxt = new JTextField();
		patientAgeTxt.setBounds(193, 165, 130, 26);
		add(patientAgeTxt);
		patientAgeTxt.setColumns(10);
		
		JComboBox genderCombo = new JComboBox();
		genderCombo.setBounds(193, 219, 130, 27);
		add(genderCombo);
		
		JComboBox cityCombo = new JComboBox();
		cityCombo.setBounds(193, 274, 130, 27);
		add(cityCombo);
		
		JComboBox stateCombo = new JComboBox();
		stateCombo.setBounds(193, 329, 130, 27);
		add(stateCombo);
		
		JComboBox zipCodeCombo = new JComboBox();
		zipCodeCombo.setBounds(193, 385, 130, 27);
		add(zipCodeCombo);
		
		JLabel patientIdLb = new JLabel("Patient ID");
		patientIdLb.setBounds(113, 60, 68, 16);
		add(patientIdLb);
		
		JLabel patientNameLb = new JLabel("Name");
		patientNameLb.setBounds(137, 114, 44, 16);
		add(patientNameLb);
		
		JLabel patientAgeLb = new JLabel("Age");
		patientAgeLb.setBounds(137, 170, 32, 16);
		add(patientAgeLb);
		
		JLabel patientGenderLb = new JLabel("Gender");
		patientGenderLb.setBounds(125, 223, 44, 16);
		add(patientGenderLb);
		
		JLabel patientCityLb = new JLabel("City");
		patientCityLb.setBounds(137, 278, 32, 16);
		add(patientCityLb);
		
		JLabel patientStateLb = new JLabel("State");
		patientStateLb.setBounds(125, 333, 44, 16);
		add(patientStateLb);
		
		JLabel patientZipcodeLb = new JLabel("Zipcode");
		patientZipcodeLb.setBounds(119, 389, 50, 16);
		add(patientZipcodeLb);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(40, 40, 651, 465);
		add(desktopPane);
		
		JButton savePatientDetailsBtn = new JButton("Save Details");
		savePatientDetailsBtn.setBounds(273, 402, 117, 29);
		desktopPane.add(savePatientDetailsBtn);
		
		JLabel patientPicLb = new JLabel("Patient Pic");
		patientPicLb.setBounds(403, 6, 237, 186);
		desktopPane.add(patientPicLb);
		
		JLabel patientConcernLb = new JLabel("Patient Concern");
		patientConcernLb.setBounds(340, 292, 99, 16);
		desktopPane.add(patientConcernLb);
		
		JTextArea patientConcernTxtArea = new JTextArea();
		patientConcernTxtArea.setBounds(451, 292, 174, 79);
		desktopPane.add(patientConcernTxtArea);
		
		JLabel lblNewLabel = new JLabel("Camera option");
		lblNewLabel.setBounds(481, 216, 123, 16);
		desktopPane.add(lblNewLabel);

	}

}
