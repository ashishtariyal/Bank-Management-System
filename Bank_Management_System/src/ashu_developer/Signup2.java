package ashu_developer;


import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;



@SuppressWarnings("unused")
public class Signup2 extends JFrame implements ActionListener{
	JTextField j5,j6;
	JComboBox  j,j1 ,j2 ,j3 ,j4; 
	JRadioButton j8,j9,j10,j11;
	JButton bt;
	
	
	Signup2(String name){
		
		setTitle("New Account Application ");
		setLayout(null);
		
		JLabel n =new JLabel("Page 2: Addtional Details");
		n.setFont(new Font("osward", Font.BOLD,25));
		n.setBounds(300,40,400,40);
		add(n);
		
		
		JLabel text1 =new JLabel("Religion :");
		text1.setFont(new Font("osward", Font.BOLD,20));
		text1.setBounds(100,120,300,50);
		add(text1);
		String[] s ={"Hindu" ,"Sikh" ,"Christian"};
		 j =new JComboBox(s);
		j.setBounds(320,135,400,30);
		j.setBackground(Color.WHITE);
		add(j);
		
		
		JLabel text2 =new JLabel("Category :");
		text2.setFont(new Font("osward", Font.BOLD,20));
		text2.setBounds(100,170,300,50);
		add(text2);
		String s1[] ={"General" ,"OBC" ,"SC" ,"ST"};
		 j1 =new JComboBox(s1);
		j1.setBounds(320,185,400,30);
		j1.setBackground(Color.WHITE);
		add(j1);
		
		JLabel text3 =new JLabel("Income : ");
		text3.setFont(new Font("osward", Font.BOLD,20));
		text3.setBounds(100,220,300,50);
		add(text3);
		String s2[] = {"Null" ,"< 1,50,000","< 5,50,000","< 10,50,000","< 15,00,000","we can't afford"};
		 j2 =new JComboBox(s2);
		j2.setBounds(320,235,400,30);
		add(j2);
		
		JLabel text4 =new JLabel("Education :");
		text4.setFont(new Font("osward", Font.BOLD,20));
		text4.setBounds(100,270,300,50);
		add(text4);
		String s3[] ={"Non-Graduation" ,"Graduate" ,"Post-Graduate" ,"Doctrate","Civil servant"};
		 j3 =new JComboBox(s3);
		j3.setBounds(320,285,400,30);
		j3.setBackground(Color.WHITE);
		add(j3);
		
		JLabel text5 =new JLabel("Occupation :");
		text5.setFont(new Font("osward", Font.BOLD,20));
		text5.setBounds(100,320,300,50);
		add(text5);
		String s4[] ={"Salaried" ,"Self-Employed" ,"Bussiness-Man" ,"Student","Retired", "Other"};
		 j4 =new JComboBox(s4);
		j4.setBounds(320,335,400,30);
		j4.setBackground(Color.WHITE);
		add(j4);
		
		JLabel text6 =new JLabel("Pan Number :");
		text6.setFont(new Font("osward", Font.BOLD,20));
		text6.setBounds(100,370,300,50);
		add(text6);
		 j5 = new JTextField();
			j5.setBounds(320, 385,400,28);
			j5.setFont(new Font("Arial", Font.BOLD,16));
			add(j5);
		
		JLabel text7 =new JLabel("Aaddhar Number :");
		text7.setFont(new Font("osward", Font.BOLD,20));
		text7.setBounds(100,420,300,50);
		add(text7);
		 j6 = new JTextField();
		j6.setBounds(320, 435,400,28);
		j6.setFont(new Font("Arial", Font.BOLD,16));
		add(j6);
		
		JLabel text8 =new JLabel("Senior Citizen :");
		text8.setFont(new Font("osward", Font.BOLD,20));
		text8.setBounds(100,470,300,50);
		add(text8);
		
		 j8 = new JRadioButton("Yes");
			j8.setBounds(320, 485, 50, 28); // Adjust the position
		    add(j8);
		      j9 = new JRadioButton("No");
			j9.setBounds(470, 485, 50, 28); // Adjust the position
		    add(j9);
		    ButtonGroup b2= new ButtonGroup();
		    b2.add(j8);
		    b2.add(j9);
		
		JLabel text9 =new JLabel("Existing Account :");
		text9.setFont(new Font("osward", Font.BOLD,20));
		text9.setBounds(100,520,300,50);
		add(text9);
		 j10 = new JRadioButton("Yes");
		j10.setBounds(320, 537, 50, 28); // Adjust the position
	    add(j10);
	      j11 = new JRadioButton("No");
		j11.setBounds(470, 537, 50, 28); // Adjust the position
	    add(j11);
	    ButtonGroup b3= new ButtonGroup();
	    b3.add(j10);
	    b3.add(j11);

		 bt =new JButton("Next");
		bt.setBackground(Color.BLACK);
		bt.setForeground(Color.WHITE);
		bt.setFont(new Font("Raleway", Font.BOLD, 14));
		bt.setBounds(370,675,100,30);
		bt.addActionListener(this);
		add(bt);
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(850,800);
		setVisible(true);
		setLocation(300, 10);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String religion = (String )j.getSelectedItem();
		String category = (String )j1.getSelectedItem();
		String income = (String )j2.getSelectedItem();
		String edu =  (String )j3.getSelectedItem();
		String occupation = (String )j4.getSelectedItem();
		
		
		String pan =j5.getText();
		String aaddhar = j6.getText();
		String senior=null;
		if(j8.isSelected())
		{
			senior ="Yes";
		}
		else if(j9.isSelected())
		{
			senior ="NO";
		}
		
		
		String  exist =null;
		if(j10.isSelected())
		{
			exist="Yes";
		}
		else if(j11.isSelected())
		{
			exist="No";
		}
		
		try {
		
			con1 con= new con1();
			String query="insert into signup2 values('"+religion+"','"+category+"','"+income+"','"+edu+"','"+occupation+"','"+pan+"','"+aaddhar+"','"+senior+"','"+exist+"')";
			con.s.executeUpdate(query);
			
			setVisible(false);
			new Signup3(religion).setVisible(true);
			
		
		}
		catch(Exception eu)
		{
			System.out.println(eu);
		}
		
	}
	

	
public static void main (String args[]) 
	{
		new Signup2("");
	}
	



}

