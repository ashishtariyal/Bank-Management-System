package ashu_developer;

import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fastcash extends JFrame implements ActionListener{
	
	JButton j2,j3,j4,j5,j6,j7,j8;
	String pinnumber;
	
	Fastcash(String pinnumber){
		
		this.pinnumber=pinnumber; 
 		
		ImageIcon i2 = new ImageIcon("icons/atm.jpg");
		Image i3 = i2.getImage().getScaledInstance(870, 970, Image.SCALE_DEFAULT);
		ImageIcon i4 = new ImageIcon(i3);
		JLabel label = new JLabel(i4);
		add(label);
		
		JLabel j1 =new JLabel(" Select Withdrawal Amount ");
		j1.setBounds(190,280,700,30);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("System",Font.BOLD, 16));
		label.add(j1);
	
		 j2 =new JButton("Rs 100");
		j2.setBackground(Color.LIGHT_GRAY);
		j2.setForeground(Color.BLACK);
		j2.setBounds(170, 350,130,23);
		j2.addActionListener(this);
		label.add(j2);
		 j3 =new JButton("Rs 500");
		j3.setBackground(Color.LIGHT_GRAY);
		j3.setForeground(Color.BLACK);
		j3.setBounds(170, 390,130,23);
		j3.addActionListener(this);
		label.add(j3);
		 j4 =new JButton("Rs 1000");
		j4.setBackground(Color.LIGHT_GRAY);
		j4.setForeground(Color.BLACK);
		j4.setBounds(170, 430,130,23);
		j4.addActionListener(this);
		label.add(j4);
		 j5 =new JButton("Rs 2000");
		j5.setBackground(Color.LIGHT_GRAY);
		j5.setForeground(Color.BLACK);
		j5.setBounds(330, 350,130,24);
		j5.addActionListener(this);
		label.add(j5);
		 j6 =new JButton("Rs 5000");
		j6.setBackground(Color.LIGHT_GRAY);
		j6.setForeground(Color.BLACK);
		j6.setBounds(330, 390,130,24);
		j6.addActionListener(this);
		label.add(j6);
		 j7 =new JButton("Rs 10,000");
		j7.setBackground(Color.LIGHT_GRAY);
		j7.setForeground(Color.BLACK);
		j7.setBounds(330, 430,130,24);
		j7.addActionListener(this);
		label.add(j7);
		 j8 =new JButton("Back");
		j8.setBackground(Color.LIGHT_GRAY);
		j8.setForeground(Color.BLACK);
		j8.setBounds(330, 470,130,24);
		j8.addActionListener(this);
		label.add(j8);
		
		setSize(850,850);
		setLocation(330,0);
		setUndecorated(true);
		setVisible(true);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fastcash("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==j8)
		{
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		else 
		{
			String amount =((JButton)e.getSource()).getText().substring(3);
			con1 con =new con1();
			try {
				ResultSet rs =con.s.executeQuery("select * from bank where pin ='"+pinnumber+"' ");
				int balance =0;
				while(rs.next())
				{
					if(rs.getString("type").equals("Deposit"))
					{
						balance +=Integer.parseInt(rs.getString("amount"));
					}
					else
					{
						balance -=Integer.parseInt(rs.getString("amount"));
					}
				}
				
				if(e.getSource() != j8 && balance <Integer.parseInt(amount))
				{
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date =new Date();
				String query ="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl' ,'"+amount+"')";
				con.s.executeQuery(query);
				JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully");
				
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}
		}
	}
	
}

