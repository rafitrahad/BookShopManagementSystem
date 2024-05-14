package Frame;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class bookpayment extends JFrame implements ActionListener{
	double pc;
	JLabel numberLabel,pinLabel,priceLabel;
	JPanel panel;
	JTextField numberField,pinField,priceField;
	JButton backButton,confirmPaymentButton;
	String p;
    public bookpayment(String p,double pc){
		this.p=p;
		this.pc=pc;
		this.setTitle("BookShop");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		Font f=new Font("Arial",Font.BOLD,20);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		
		
		JLabel numberLabel = new JLabel("Number: ");
		numberLabel.setBounds(100,80,100,30);
		numberLabel.setFont(f);
		//numberLabel.setForeground(Color.RED);
		panel.add(numberLabel);
		
		numberField = new JTextField();
		numberField.setBounds(220,80,150,30);
		panel.add(numberField);
	
		JLabel pinLabel = new JLabel("Pin No:");
		pinLabel.setBounds(100,150,100,30);
		pinLabel.setFont(f);
		//pinLabel.setForeground(Color.RED);
		panel.add(pinLabel);
	
		pinField = new JTextField();
		pinField.setBounds(220,150,150,30);
		panel.add(pinField);
	
		priceLabel = new JLabel("Amount : ");
		priceLabel.setBounds(100,210,150,30);
		priceLabel.setFont(f);
		//priceLabel.setForeground(Color.RED);
		panel.add(priceLabel);
	
	
	
		priceField = new JTextField();
		priceField.setBounds(220,210,150,30);
		panel.add(priceField);
		 
		 
		 
		backButton=new JButton("Back");
		backButton.setBounds(200,320,80,30);
		backButton.addActionListener(this);
		panel.add(backButton);
		
		confirmPaymentButton=new JButton("Confirm Payment");
		confirmPaymentButton.setBounds(400,320,150,30);
		confirmPaymentButton.addActionListener(this);
		panel.add(confirmPaymentButton);
		
		
		ImageIcon bg=new ImageIcon(p);
		Image i1=bg.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
		ImageIcon i2=new ImageIcon(i1);
		
		JLabel bg2=new JLabel(i2);
		bg2.setSize(800,500);
		panel.add(bg2);
		
		
		getContentPane().setBackground(Color.BLUE);
		
		add(panel);
		
		
		
	
    }
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()==confirmPaymentButton){
			JOptionPane.showMessageDialog(this,"Thank You For Purchasing");
			
		}else if(ae.getSource()==backButton){
			
			//selectPaymentMethod s=new selectPaymentMethod();
			//s.setVisible(true);
			//this.setVisible(false);
		}
		
	}
	
	
}