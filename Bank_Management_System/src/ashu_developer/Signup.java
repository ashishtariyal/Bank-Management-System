package ashu_developer;


import java.sql.*;
import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;



//@SuppressWarnings("unused")
public class Signup extends JFrame implements ActionListener{
	JTextField j,j1 , j2 ,j5 ,j7 ,j8 ,j9, j10 ;
	JPasswordField t2;
	JButton bt;
	JRadioButton j4 , jj ,j6 ,gg; ;
	JDateChooser j3;
	
	public String name;
	

	Signup(){ 
		this.name=name;
		setTitle("New Account Application ");
		setLayout(null);
		
		JLabel n =new JLabel("Page 1: Personal Details");
		n.setFont(new Font("osward", Font.BOLD,25));
		n.setBounds(300,40,400,40);
		add(n);
		
		JLabel n1 =new JLabel("Name :");
		n1.setFont(new Font("osward", Font.BOLD,20));
		n1.setBounds(100,120,300,50);
		add(n1);
		 j = new JTextField();
		j.setBounds(320, 135,400,28);
		j.setFont(new Font("Arial", Font.BOLD,16));
		add(j);
		
		JLabel n2 =new JLabel("Mothers Name :");
		n2.setFont(new Font("osward", Font.BOLD,20));
		n2.setBounds(100,170,300,50);
		add(n2);
		 j1 = new JTextField();
		j1.setBounds(320, 185,400,28);
		j1.setFont(new Font("Arial", Font.BOLD,16));
		add(j1);

		
		JLabel n3 =new JLabel("Fathers Name :");
		n3.setFont(new Font("osward", Font.BOLD,20));
		n3.setBounds(100,220,300,50);
		add(n3);
		 j2 = new JTextField();
		j2.setBounds(320, 235,400,28);
		j2.setFont(new Font("Arial", Font.BOLD,16));
		add(j2);
		
		JLabel n4 =new JLabel("Date of Birth :");
		n4.setFont(new Font("osward", Font.BOLD,20));
		n4.setBounds(100,270,300,50);
		add(n4);
		  j3 =new JDateChooser();
		j3.setBounds(320, 285, 400, 28); // Adjust the position
	    add(j3);
		
		JLabel n5 =new JLabel("Gender :");
		n5.setFont(new Font("osward", Font.BOLD,20));
		n5.setBounds(100,320,300,50);
		add(n5);
		 j4 = new JRadioButton("Male");
		j4.setBounds(320, 335, 60, 28); // Adjust the position
	    add(j4);
	     jj = new JRadioButton("Female");
		jj.setBounds(470, 335, 80, 28); // Adjust the position
	    add(jj);
	    ButtonGroup bb= new ButtonGroup();
	    bb.add(j4);
	    bb.add(jj);
		
		JLabel n6 =new JLabel("Email Address :");
		n6.setFont(new Font("osward", Font.BOLD,20));
		n6.setBounds(100,370,300,50);
		add(n6);
		 j5 = new JTextField();
		j5.setBounds(320, 385,400,28);
		j5.setFont(new Font("Arial", Font.BOLD,16));
		add(j5);
		
		JLabel n7 =new JLabel("Marital Status :");
		n7.setFont(new Font("osward", Font.BOLD,20));
		n7.setBounds(100,420,300,50);
		add(n7);
		 j6 = new JRadioButton("Married ");
		j6.setBounds(320, 437, 90, 28); // Adjust the position
	    add(j6);
	     gg = new JRadioButton("UnMarried");
		gg.setBounds(470, 437, 90, 28); // Adjust the position
	    add(gg);
	    ButtonGroup b1= new ButtonGroup();
	    b1.add(j6);
	    b1.add(gg);
		
		JLabel n8 =new JLabel("Address :");
		n8.setFont(new Font("osward", Font.BOLD,20));
		n8.setBounds(100,470,300,50);
		add(n8);
		
		
		 j7 = new JTextField();
		j7.setBounds(320, 485,400,28);
		j7.setFont(new Font("Arial", Font.BOLD,16));
		add(j7);
		
		JLabel n9 =new JLabel("City :");
		n9.setFont(new Font("osward", Font.BOLD,20));
		n9.setBounds(100,520,300,50);
		add(n9);
		 j8 = new JTextField();
		j8.setBounds(320, 535,400,28);
		j8.setFont(new Font("Arial", Font.BOLD,16));
		add(j8);
		
		JLabel n10 =new JLabel("State :");
		n10.setFont(new Font("osward", Font.BOLD,20));
		n10.setBounds(100,570,300,50);
		add(n10);
		 j9 = new JTextField();
		j9.setBounds(320, 585,400,28);
		j9.setFont(new Font("Arial", Font.BOLD,16));
		add(j9);
		
		JLabel n11 =new JLabel("Pin Code");
		n11.setFont(new Font("osward", Font.BOLD,20));
		n11.setBounds(100,620,300,50);
		add(n11);
		 j10= new JTextField();
		j10.setBounds(320, 635,400,28);
		j10.setFont(new Font("Arial", Font.BOLD,16));
		add(j10);
		
		
		
		 bt =new JButton("Next");
		bt.setBackground(Color.BLACK);
		bt.setForeground(Color.WHITE);
		bt.setFont(new Font("Raleway", Font.BOLD, 14));
		bt.setBounds(370,695,100,30);
		bt.addActionListener(this);
		add(bt);
		
		
		//////////////
		
		 
			
//			 t2 = new JPasswordField();
////				t2.setBounds(345, 220, 250, 30);
//				t2.setFont(new Font("Arial", Font.BOLD,14));
//				add(t2);
				
				
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(850,800);
		setVisible(true);
		setLocation(300, 10);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = j.getText();
		String mname =j1.getText();
		String fname =j2.getText();
		String dob = ((JTextField)  j3.getDateEditor().getUiComponent()).getText();
		String gender =null;
		if(j4.isSelected())
		{
			gender ="Male";
		}
		else if(jj.isSelected())
		{
			gender ="Female";
		}
		
		String email =j5.getText();
		String marital=null;
		if(j6.isSelected())
		{
			marital ="Married";
		}
		else if(gg.isSelected())
		{
			marital ="UnMarried";
		}
		
		String address =j7.getText();
		String  city =j8.getText();
		String state = j9.getText();
		String pincode =j10.getText();
		
		
		try {
		if(name.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Name is Required");
		}
		else
		{
			con1 con= new con1();
			String query="insert into signup values('"+name+"','"+mname+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
			

			con.s.executeUpdate(query);
		

			setVisible(false);
			new Signup2(name).setVisible(true);
			
		}
		}
		catch(Exception eu)
		{
			System.out.println(eu);
		}
		
	}
	

	
public static void main (String args[]) 
	{
		new Signup();
	}



}