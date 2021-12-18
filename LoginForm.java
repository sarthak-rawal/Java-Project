package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JPasswordField PasswordTxt;
	private JTextField UsernameTxt;
	private JTextField LastNameTxt;
	private JTextField EmailTxt;
	private JTextField PasswordBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 763);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Facebbok");
		panel.setBackground(new Color(0, 51, 255));
		panel.setBounds(0, 0, 1123, 135);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facebook");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 50));
		lblNewLabel.setBounds(43, 20, 298, 94);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email or Phone");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(498, 3, 166, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_2.setBounds(739, 2, 152, 26);
		panel.add(lblNewLabel_2);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(739, 39, 202, 47);
		panel.add(PasswordTxt);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = UsernameTxt.getText();
				String psw = PasswordTxt.getText();
				if(un.equals("sitarambabu123@gmail.com") && psw.equals("123456")) {
					JOptionPane.showMessageDialog(null,"login success");
					
					new Home().setVisible(true);
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null,"login failed");
				}
			}
		});
		
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(0, 0, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(988, 51, 95, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Forget Password?");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(749, 96, 158, 26);
		panel.add(lblNewLabel_3);
		
		UsernameTxt = new JTextField();
		UsernameTxt.setBounds(498, 39, 202, 47);
		panel.add(UsernameTxt);
		UsernameTxt.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.BOLD, 20));
		chckbxNewCheckBox.setBackground(Color.BLUE);
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setToolTipText("");
		chckbxNewCheckBox.setBounds(498, 101, 21, 21);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_4 = new JLabel("Keep me looged in");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4.setBounds(524, 96, 188, 26);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 674, 1114, -7);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 677, 1123, 59);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Sign Up");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lblNewLabel_5.setBounds(480, 145, 235, 65);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Its free and always will be");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_6.setBounds(477, 217, 387, 42);
		contentPane.add(lblNewLabel_6);
		
		JFormattedTextField FristNameTxt = new JFormattedTextField();
		FristNameTxt.setForeground(new Color(0, 0, 0));
		FristNameTxt.setText("First Name");
		FristNameTxt.setToolTipText("");
		FristNameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		FristNameTxt.setBounds(480, 292, 247, 53);
		contentPane.add(FristNameTxt);
		
		LastNameTxt = new JTextField();
		LastNameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		LastNameTxt.setText("Last Name");
		LastNameTxt.setBounds(777, 292, 235, 53);
		contentPane.add(LastNameTxt);
		LastNameTxt.setColumns(10);
		
		EmailTxt = new JTextField();
		EmailTxt.setText("Your Email");
		EmailTxt.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		EmailTxt.setBounds(480, 365, 532, 47);
		contentPane.add(EmailTxt);
		EmailTxt.setColumns(10);
		
		PasswordBox = new JTextField();
		PasswordBox.setText("Enter password");
		PasswordBox.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		PasswordBox.setBounds(480, 422, 532, 47);
		contentPane.add(PasswordBox);
		PasswordBox.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Birthday:");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(480, 479, 141, 42);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"}));
		comboBox_1.setMaximumRowCount(33);
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(606, 531, 57, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setMaximumRowCount(15);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(490, 531, 112, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_8 = new JLabel("Year");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(673, 529, 42, 21);
		contentPane.add(lblNewLabel_8);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		spinner.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner.setBounds(848, 531, 46, 21);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		spinner_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1.setBounds(803, 531, 46, 21);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		spinner_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_2.setBounds(762, 531, 42, 21);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		spinner_3.setBounds(716, 531, 46, 21);
		contentPane.add(spinner_3);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBackground(new Color(230, 230, 250));
		female.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		female.setBounds(478, 558, 153, 31);
		contentPane.add(female);
		
		JRadioButton male = new JRadioButton("Male");
		male.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		male.setBackground(new Color(230, 230, 250));
		male.setBounds(659, 558, 159, 31);
		contentPane.add(male);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fn = FristNameTxt.getText();
				String ln = LastNameTxt.getText();
				String em = EmailTxt.getText();
				String rem = PasswordBox.getText();
				if (fn.equals("Sitaram") && ln.equals("Babu") && em.equals ("sitarambabu123@gmail,com") && rem.equals("123456")) {
					JOptionPane.showMessageDialog(null,"sign up success");
					new Home().setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null,"sing up failed");
				}
				
						}
		});
		btnNewButton_1.setBackground(new Color(154, 205, 50));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		btnNewButton_1.setBounds(490, 608, 159, 53);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\legion\\Downloads\\ssd.png"));
		lblNewLabel_9.setBounds(0, 264, 449, 308);
		contentPane.add(lblNewLabel_9);
		
		JTextArea txtrFacebook = new JTextArea();
		txtrFacebook.setText("Facebook helps you connect and \r\nshare with the people in your \r\nlife.");
		txtrFacebook.setFont(new Font("Segoe UI", Font.BOLD, 25));
		txtrFacebook.setForeground(new Color(0, 0, 0));
		txtrFacebook.setBackground(new Color(230, 230, 250));
		txtrFacebook.setBounds(10, 148, 416, 111);
		contentPane.add(txtrFacebook);
	}
}
