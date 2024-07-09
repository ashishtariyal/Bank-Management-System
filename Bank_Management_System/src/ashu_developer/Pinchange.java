package ashu_developer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Pinchange extends JFrame implements ActionListener {
	
	 JButton b1, b2;
	 JTextField t1, t2;
	 String pinnumber;
	 
	Pinchange(String pinnumber)
	{
		this.pinnumber=pinnumber;
		
		ImageIcon i2 = new ImageIcon("icons/atm.jpg");
		Image i3 = i2.getImage().getScaledInstance(870, 970, Image.SCALE_DEFAULT);
		ImageIcon i4 = new ImageIcon(i3);
		JLabel label = new JLabel(i4);
		add(label);
		
		JLabel j1 =new JLabel("CHANGE YOUR PIN");
		j1.setBounds(240,280,700,30);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("System",Font.BOLD, 16));
		label.add(j1);
		
		JLabel j2 =new JLabel("New PIN :");
		j2.setBounds(150,330,700,30);
		j2.setForeground(Color.WHITE);
		j2.setFont(new Font("System",Font.BOLD, 16));
		label.add(j2);
		  t1 = new JTextField();
		t1.setFont(new Font("System",Font.BOLD, 16));
		t1.setBounds(290,335,190,26);
		label.add(t1);
		
		JLabel j3 =new JLabel("Re-Enter PIN :");
		j3.setBounds(150,370,300,30);
		j3.setForeground(Color.WHITE);
		j3.setFont(new Font("System",Font.BOLD, 16));
		label.add(j3);
		  t2 = new JTextField();
		t2.setFont(new Font("System",Font.BOLD, 16));
		t2.setBounds(290,375,190,26);
		label.add(t2);
		
		 b1= new JButton("CHANGE");
		b1.setBounds(360, 475,120,24);
		b1.setFont(new Font("System",Font.BOLD, 13));
		b1.addActionListener(this);
		label.add(b1);
		
		 b2= new JButton("BACK");
		b2.setBounds(360, 505,120,24);
		b2.setFont(new Font("System",Font.BOLD, 13));
		b2.addActionListener(this);
		label.add(b2);

		
		setSize(850,850);
		setLocation(330,0);
		setUndecorated(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pinchange("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
		try {
			String npin =t1.getText();
			String rpin =t2.getText();
			
			if(! npin.equals(rpin))
			{
				JOptionPane.showMessageDialog(null, "Entered PIN doesn't match");
				return;
			}
			if(npin.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter New Pin");
				return;
			}
			if(rpin.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
				return;
			}
			con1 con =new con1();
			String query1 = "update bank set pin ='"+rpin+"' where pin='"+pinnumber+"' ";
			String query2 = "update login set pin ='"+rpin+"' where pin='"+pinnumber+"' "; 
			String query3 = "update signup3 set pin ='"+rpin+"' where pin='"+pinnumber+"' ";	
		
			con.s.executeUpdate(query1);
			con.s.executeUpdate(query2);
			con.s.executeUpdate(query3);
			JOptionPane.showMessageDialog(null, "PIN changed successfully");
			
			setVisible(false);
			new Transactions (rpin).setVisible(true);
		
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
	}

	else
	{
		setVisible(false);
		new Transactions(pinnumber).setVisible(true);
	}

	}
	
}


