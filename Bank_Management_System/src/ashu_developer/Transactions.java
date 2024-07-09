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
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener{
	
	JButton j2,j3,j4,j5,j6,j7,j8;
	String pinnumber;
	
	Transactions(String pinnumber){
		
		this.pinnumber=pinnumber; 
 		
		ImageIcon i2 = new ImageIcon("icons/atm.jpg");
		Image i3 = i2.getImage().getScaledInstance(870, 970, Image.SCALE_DEFAULT);
		ImageIcon i4 = new ImageIcon(i3);
		JLabel label = new JLabel(i4);
		add(label);
		
		
		JLabel j1 =new JLabel("Please select your Transactions");
		j1.setBounds(190,280,700,30);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("System",Font.BOLD, 16));
		label.add(j1);
	
		 j2 =new JButton("Deposit");
		j2.setBackground(Color.LIGHT_GRAY);
		j2.setForeground(Color.BLACK);
		j2.setBounds(170, 350,130,23);
		j2.addActionListener(this);
		label.add(j2);
		 j3 =new JButton("Fast Cash");
		j3.setBackground(Color.LIGHT_GRAY);
		j3.setForeground(Color.BLACK);
		j3.setBounds(170, 390,130,23);
		j3.addActionListener(this);
		label.add(j3);
		 j4 =new JButton("Pin Change");
		j4.setBackground(Color.LIGHT_GRAY);
		j4.setForeground(Color.BLACK);
		j4.setBounds(170, 430,130,23);
		j4.addActionListener(this);
		label.add(j4);
		 j5 =new JButton("Cash Withdrawl");
		j5.setBackground(Color.LIGHT_GRAY);
		j5.setForeground(Color.BLACK);
		j5.setBounds(330, 350,130,24);
		j5.addActionListener(this);
		label.add(j5);
		 j6 =new JButton("Mini Statement");
		j6.setBackground(Color.LIGHT_GRAY);
		j6.setForeground(Color.BLACK);
		j6.setBounds(330, 390,130,24);
		j6.addActionListener(this);
		label.add(j6);
		 j7 =new JButton("Balance Enquiry");
		j7.setBackground(Color.LIGHT_GRAY);
		j7.setForeground(Color.BLACK);
		j7.setBounds(330, 430,130,24);
		j7.addActionListener(this);
		label.add(j7);
		 j8 =new JButton("Exit");
		j8.setBackground(Color.LIGHT_GRAY);
		j8.setForeground(Color.BLACK);
		j8.setBounds(330, 470,130,24);
		j8.addActionListener(this);
		label.add(j8);
		
		setSize(850,850);
		setLocation(330,0);
		setUndecorated(true);
		setVisible(true);
		
//		JLabel jj =new JLabel();
//		jj.setBounds(180,190,500,30);
//		label.add(jj);
//		
//		try {
//			con1 con =new con1();
//			ResultSet rs= con.s.executeQuery("select * from signup where pin = '"+pinnumber+"'");
//			while(rs.next())
//			{
//				jj.setText("Your name : " + rs.getString("name"));
//			}
//			
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Transactions("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==j8)
		{
			System.exit(0);
		}
		else if(e.getSource()==j2)
		{
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}
		else if(e.getSource()==j5)
		{
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
		}
		else if(e.getSource()==j3)
		{
			setVisible(false);
			new Fastcash(pinnumber).setVisible(true);
		}
		else if(e.getSource()==j4)
		{
			setVisible(false);
			new Pinchange(pinnumber).setVisible(true);
		}
		else if(e.getSource()==j7)
		{
			setVisible(false);
			new Balance(pinnumber).setVisible(true);
		}
		else if(e.getSource()==j6)
		{
			new Ministatement(pinnumber).setVisible(true);
		}
			
	}
}


