package ashu_developer;

import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame implements ActionListener {
	
	JCheckBox j5,j6,j7,j8,j9,j10,j11;
	JRadioButton j1,j2,j3,j4;
	JButton submit, cancel;
	
	Signup3(String religion)
	{
		
		JLabel n =new JLabel("Page 3: Account Details");
		n.setFont(new Font("osward", Font.BOLD,25));
		n.setBounds(225,40,400,40);
		add(n);
		
		JLabel n1 =new JLabel(" Account Type :");
		n1.setFont(new Font("osward", Font.BOLD,20));                  
		n1.setBounds(100,120,400,40);
		add(n1);
		
		 j1 = new JRadioButton("Saving Account");
			j1.setBounds(100, 165, 180, 28); // Adjust the position
			j1.setBackground(Color.WHITE);
			j1.setForeground(Color.BLACK);
		    add(j1);
		     j2 = new JRadioButton("Current Account ");
			j2.setBounds(100, 195, 180, 28); // Adjust the position
			j2.setBackground(Color.WHITE);
			j2.setForeground(Color.BLACK);
		    add(j2);
		    
		     j3 = new JRadioButton("Fixed Deposit Account");
			j3.setBounds(340, 165, 190, 28); // Adjust the position
			j3.setBackground(Color.WHITE);
			j3.setForeground(Color.BLACK);
		    add(j3);
		     j4 = new JRadioButton("Recurring Deposit Account");
			j4.setBounds(340, 195, 190, 28); // Adjust the position
			j4.setBackground(Color.WHITE);
			j4.setForeground(Color.BLACK);
		    add(j4);   
		    ButtonGroup b1= new ButtonGroup();
		    b1.add(j1);
		    b1.add(j2);
		    b1.add(j3);
		    b1.add(j4);
		    
		
		    JLabel n2 =new JLabel("Card Number :");
			n2.setFont(new Font("Raleway", Font.BOLD,20));
			n2.setBounds(100,255,400,40);
			add(n2); 
			 JLabel n5 =new JLabel("Your 16 Digit Card  Number");
				n5.setFont(new Font("osward", Font.BOLD,10));
				n5.setBounds(100,275,400,40);
				add(n5);
			
			   JLabel n3 =new JLabel("XXXX-XXXX-XXXX");
				n3.setFont(new Font("Raleway", Font.BOLD,20));
				n3.setBounds(340,258,300,40);
				add(n3); 
			
			
			 JLabel n4 =new JLabel("Pin :");
			 n4.setFont(new Font("osward", Font.BOLD,20));
			 n4.setBounds(100,315,400,40);
			 add(n4);  
			 JLabel n6 =new JLabel("Your 4 Digit Password");
				n6.setFont(new Font("osward", Font.BOLD,10));
				n6.setBounds(100,335,400,40);
				add(n6);
				
				JLabel n7 =new JLabel("XXXX");
				n7.setFont(new Font("Raleway", Font.BOLD,20));
				n7.setBounds(340,318,300,40);
				add(n7); 
				
				
			 JLabel n8 =new JLabel("Services Required :");
			 n8.setFont(new Font("osward", Font.BOLD,20));
			 n8.setBounds(100,375,400,40);
			 add(n8);
		
			  j5 = new JCheckBox("ATM CARD");
				j5.setBounds(100, 420, 180, 28); // Adjust the position
				j5.setBackground(Color.WHITE);
				j5.setForeground(Color.BLACK);
			    add(j5);
			  j6 = new JCheckBox("Mobile Banking");
				j6.setBounds(100, 470, 180, 28); // Adjust the position
				j6.setBackground(Color.WHITE);
				j6.setForeground(Color.BLACK);
			    add(j6);
			    
		      j7 = new JCheckBox("Cheque Book");
				j7.setBounds(100, 520, 180, 28); // Adjust the position
				j7.setBackground(Color.WHITE);
				j7.setForeground(Color.BLACK);
			    add(j7);
		      j8 = new JCheckBox("Internet Banking");
				j8.setBounds(340, 420, 190, 28); // Adjust the position
				j8.setBackground(Color.WHITE);
				j8.setForeground(Color.BLACK);
			    add(j8); 
			  j9 = new JCheckBox("Email & SMS  Alerts");
				j9.setBounds(340, 470, 190, 28); // Adjust the position
				j9.setBackground(Color.WHITE);
				j9.setForeground(Color.BLACK);
			    add(j9); 
		      j10 = new JCheckBox("E-Statement");
				j10.setBounds(340, 520, 190, 28); // Adjust the position
				j10.setBackground(Color.WHITE);
				j10.setForeground(Color.BLACK);
			    add(j10);
			    
			     j11 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
			     j11.setFont(new Font("osward", Font.BOLD,10));
			     j11.setBounds(100, 590, 550, 23); // Adjust the position
			
				j11.setForeground(Color.BLACK);
			    add(j11);
			    
			    
			    submit= new JButton("SUBMIT");
			    submit.setBounds(250, 660, 100, 30);
			    submit.setBackground(Color.BLACK);
			    submit.setForeground(Color.WHITE);
				submit.addActionListener(this);
				add(submit);
				
				 cancel= new JButton("CANCEL");
				 cancel.setBounds(380, 660, 100, 30);
				 cancel.setBackground(Color.BLACK);
				 cancel.setForeground(Color.WHITE);
				 cancel.addActionListener(this);
					add(cancel);
			    
			    
		setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(750,770);
		setVisible(true);
		setLocation(380,30);
	}
	
	public static void main(String [] args)
	{
		new Signup3("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submit)
		{
			String accountType =null;
			if(j1.isSelected())
			{
				accountType="Saving Account";
			}
			else if(j3.isSelected())
			{
				accountType="Fixed Deposit Account";
			}
			else if(j2.isSelected())
			{
				accountType="Current Account";
			}
			else if(j4.isSelected())
			{
				accountType="Recurring Deposit Account";
			}
			Random random = new Random();
			String cardnumber =""+ Math.abs((random.nextLong()% 900000L) +504093600000L) ;
			
			String pinnumber = ""+ Math.abs((random.nextLong() % 9000L) + 1000L);
			String facility ="";
			if(j5.isSelected())
			{
				facility  =facility +"ATM CARD";
			}
			else if( j6.isSelected())
			{
				facility = facility+"Mobile Banking";
			}
			else if(j7.isSelected())
			{
				facility=facility+"Cheque Book";
			}
			else if(j8.isSelected())
			{
				facility=facility+"Internet Banking";	
			}
			else if(j9.isSelected())
			{
				facility=facility+"Email & SMS Alerts";
			}
			else if(j10.isSelected())
			{
				facility=facility+"E-Statement";
			}
			
			try {
				if(accountType.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				}
				else {
					con1 con = new con1();
					String query= "insert into signup3 values('"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query1= "insert into login values('"+cardnumber+"','"+pinnumber+"')";
					con.s.executeUpdate(query);
					con.s.executeUpdate(query1);

					
					JOptionPane.showMessageDialog(null, "Card Number : "+cardnumber+"\n Pin : "+pinnumber);
					
					setVisible(false);
					new Deposit(pinnumber).setVisible(true);
				}
				
				/////////
//				setVisible(false);
//				new Deposit(pinnumber).setVisible(true);
				
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
			
		}
		else if(e.getSource()==cancel)
		{
			System.exit(0);
//			setVisible(false);
//			new Login().setVisible(true);
		}
	}

}

