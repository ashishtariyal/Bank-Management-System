package ashu_developer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JLabel;

public class Balance extends JFrame implements ActionListener{
	
	String pinnumber;
	
	Balance(String pinnumber){
		this.pinnumber=pinnumber;
		
		ImageIcon i2 = new ImageIcon("icons/atm.jpg");
		Image i3 = i2.getImage().getScaledInstance(870, 970, Image.SCALE_DEFAULT);
		ImageIcon i4 = new ImageIcon(i3);
		JLabel label = new JLabel(i4);
		add(label);
		
		JLabel j1 =new JLabel("Your Balance");
		j1.setBounds(260,290,700,30);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("System",Font.BOLD, 16));
		label.add(j1);
		
		JButton b2= new JButton("BACK");
			b2.setBounds(360, 505,120,24);
			b2.setFont(new Font("System",Font.BOLD, 13));
			b2.addActionListener(this);
			label.add(b2);
			
		con1 con =new con1();
		int balance =0;
		try {
			ResultSet rs =con.s.executeQuery("select * from bank where pin ='"+pinnumber+"' ");
			
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
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		JLabel jj= new JLabel("Your Current Account Balance is Rs = " + balance);
		jj.setForeground(Color.WHITE);
		jj.setFont(new Font("System",Font.BOLD, 14));
		jj.setBounds(160,350,400,30);
		label.add(jj);
		
			
		setSize(850,850);
		setLocation(330,0);
		setUndecorated(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Balance("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new Transactions(pinnumber).setVisible(true);
	}

}
