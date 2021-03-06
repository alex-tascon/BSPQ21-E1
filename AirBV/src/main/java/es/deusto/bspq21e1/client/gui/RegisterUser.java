package es.deusto.bspq21e1.client.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class RegisterUser extends JFrame{
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtEmail;
	public RegisterUser() {
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblRegisterTitle = new JLabel("Register as a new user");
		lblRegisterTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegisterTitle.setBounds(127, 11, 177, 28);
		getContentPane().add(lblRegisterTitle);
		
		//JLabels
		JLabel lblId = new JLabel("Id number");
		lblId.setBounds(102, 65, 95, 14);
		getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(102, 90, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(102, 116, 46, 14);
		getContentPane().add(lblEmail);
		
		//txtFields
		txtId = new JTextField();
		txtId.setBounds(192, 62, 112, 20);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(192, 90, 112, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(192, 116, 112, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		//Register Button
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnRegister.setBounds(161, 166, 89, 23);
		getContentPane().add(btnRegister);
	}
}
