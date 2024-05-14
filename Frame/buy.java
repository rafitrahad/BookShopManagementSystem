package Frame;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class buy extends JFrame implements ActionListener{
	private double amount,totalAmount;
	private String pc;
	private String q;
	JLabel imgLabel,numberLabel,totalLabel,priceLabel;
	JPanel panel;
	JComboBox quantity;
	JTextField numberField,pinField,priceField;
	JButton backButton,confirmPaymentButton;
	 books bs;
	 public buy(String p,String pc,String q,books bs){
			this.bs=bs;
		this.pc=pc;
		 this.q=q;
		this.setTitle("BookShop");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//amount = Double.valueOf(str);
		
		Font f=new Font("Arial",Font.BOLD,20);
		
		try{
		String str=pc;
		amount = Double.valueOf(str);
		}catch(Exception ex){}
		
		
		ImageIcon img=new ImageIcon(p);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		
		imgLabel=new JLabel(img);
		imgLabel.setBounds(50,100,img.getIconWidth(),img.getIconHeight());
		panel.add(imgLabel);
		
		numberLabel = new JLabel("Price:"+pc);
		numberLabel.setBounds(50,300,150,30);
		numberLabel.setFont(f);
		panel.add(numberLabel);
		
		/*String quantitys[]= {"1","2","3","4","5","6","7","8","9","10"};
		quantity = new JComboBox(quantitys);
		quantity.setBounds(300,100,60,25);
		quantity.addActionListener(this);
		panel.add(quantity);
		*/
		
		totalLabel = new JLabel("Net Price:"+totalAmount);
		totalLabel.setBounds(300,150,150,30);
		totalLabel.setFont(f);
		panel.add(totalLabel);
	
	    confirmPaymentButton=new JButton("Buy");
		confirmPaymentButton.setBounds(380,250,150,30);
		confirmPaymentButton.addActionListener(this);
		panel.add(confirmPaymentButton);
		 
		 
		backButton=new JButton("Back");
		backButton.setBounds(380,320,80,30);
		backButton.addActionListener(this);
		panel.add(backButton);
		
		
		
		
		add(panel);
		
		
		
	
    }
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()==confirmPaymentButton){
			selectPaymentMethod sp=new selectPaymentMethod(amount);
			sp.setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==backButton){
			selectbook sl= new selectbook(bs);
			sl.setVisible(true);
			this.setVisible(false);
		}
		
	}
	
	
}