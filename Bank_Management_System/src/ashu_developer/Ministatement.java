package ashu_developer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ministatement extends JFrame{

	JButton b1 ,b2;
	Ministatement(String pinnumber)
	
	
	{
		
		JLabel j1 =new JLabel("T a r i y a l   B a n k");
		j1.setBounds(180,50,700,30);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("Raleway",Font.BOLD, 18));
		add(j1);
		
		JLabel j2 =new JLabel();
		j2.setBounds(50,100,500,30);
		add(j2);
		
		JLabel j3 =new JLabel();
		j3.setBounds(50,260,500,30);
		j3.setFont(new Font("Raleway",Font.BOLD, 15));
		add(j3);
		
		JLabel j4 =new JLabel();
		j4.setBounds(50,380,500,30);
		j4.setFont(new Font("Raleway",Font.BOLD, 16));
		add(j4);
		

		
		
		try {
			con1 con =new con1();
			ResultSet rs= con.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
			while(rs.next())
			{
				j2.setText("Card Number : " + rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+ rs.getString("cardnumber").substring(12));
			}
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try {
			con1 con =new con1();
			int balance =0;
			
			ResultSet rs= con.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
			while(rs.next())
			{
				j3.setText(j3.getText()+"<html>"+ rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+ "</html>");
		
			if(rs.getString("type").equals("Deposit"))
				{
					balance +=Integer.parseInt(rs.getString("amount"));
				}
				else
				{
					balance -=Integer.parseInt(rs.getString("amount"));
				}
			}
			j4.setText("Your current balance is Rs " + balance);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		setSize(550,720);
		setLocation(500,60);
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
//		setUndecorated(true);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ministatement("");
	}

}






//b1 =new JButton ("Hello");
//b1.setBounds(50,380,500,30);
//add(b1);
//b2 =new JButton ();
//b2.setBounds(50,450,500,30);
//add(b2);