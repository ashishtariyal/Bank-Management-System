package ashu_developer;
 
import java.awt.*; 

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class Login extends JFrame implements ActionListener {
	
	JButton login, clear ,sign;
	JTextField t1;
	JPasswordField t2;
	
	Login()
	{
		setTitle("Automated Teller Machine");
		setLayout(null);
		
//		ImageIcon i1 = new ImageIcon(Login.class.getClassLoader().getResource("icons/logo.jpg"));
		ImageIcon i1 = new ImageIcon("icons/logo.jpg");
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(80, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome to the ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(220, 40, 400, 40);
		add(text);

		JLabel cardno = new JLabel("Card No :");
		cardno.setFont(new Font("Osward", Font.BOLD, 38));
		cardno.setBounds(120, 150, 250, 30);
		add(cardno);
		 t1 = new JTextField();
		t1.setBounds(345, 150, 250, 30);
		t1.setFont(new Font("Arial", Font.BOLD,14));
		add(t1);

		JLabel pin = new JLabel("Pin :");
		pin.setFont(new Font("Osward", Font.BOLD, 38));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		 t2 = new JPasswordField();
		t2.setBounds(345, 220, 250, 30);
		t1.setFont(new Font("Arial", Font.BOLD,14));
		add(t2);
		
		 login =new JButton("SIGN IN");
		login.setBounds(270,300,100,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		 clear =new JButton("CLEAR");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		 sign= new JButton("SIGN UP");
		sign.setBounds(270, 350, 260, 30);
		sign.setBackground(Color.BLACK);
		sign.setForeground(Color.WHITE);
		sign.addActionListener(this);
		add(sign);
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setSize(800,480);
		setVisible(true);
		setLocation(350, 200);
	}  
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==clear)
		{
			t1.setText("");
			t2.setText("");
		}
		
		else if(ae.getSource()==login)
		{
			con1 con =new con1();
			String cardnumber =t1.getText();
			String pinnumber = t2.getText();
			String query= "select * from login where cardnumber ='"+cardnumber+"' and pin='"+pinnumber+"'";
			try {
			ResultSet rs= con.s.executeQuery(query);
				if(rs.next())
				{
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}
		else if(ae.getSource()==sign)
		{
			
			setVisible(false);
			new Signup().setVisible(true);
		}
	}
	
	public static void main(String[] args)
	{
	new Login();
	}
}




