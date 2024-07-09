package ashu_developer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener{
	JTextField j22;
	JButton j3, j4;
	String pinnumber;
	Deposit(String pinnumber)
	
	{
		this.pinnumber=pinnumber;
		
		ImageIcon i2 = new ImageIcon("icons/atm.jpg");
		Image i3 = i2.getImage().getScaledInstance(870, 970, Image.SCALE_DEFAULT);
		ImageIcon i4 = new ImageIcon(i3);
		JLabel label = new JLabel(i4);
		add(label);
		
		JLabel j1= new JLabel("Enter the Amount you want to Deposit");
		j1.setBounds(170,280,700,30);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("System",Font.BOLD, 16));
		label.add(j1);
		
		 j22= new JTextField();
		j22.setFont(new Font("Raleway" ,Font.BOLD ,20));
		j22.setBounds(190,340,250,23);
		j22.addActionListener(this);
		label.add(j22);
		
		 j3 =new JButton("Back");
		j3.setBounds(230,420,80,22);
		j3.addActionListener(this);
		label.add(j3);
		 j4 =new JButton("Deposit");
		j4.setBounds(320,420,80,22);
		j4.addActionListener(this);
		label.add(j4);
		
		setSize(850,850);
		setLocation(330,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Deposit("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==j4)
		{
			String number =j22.getText(); 
			Date date =new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
			}
			else
			{
				try {
				con1 con =new con1();
				String query = "insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
				con.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				}
				catch(Exception e2)
				{
					System.out.println(e2);
				}
			}
			
		}
		else if(e.getSource()==j3)
		{
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	
}

