package Frame;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class selectPaymentMethod extends JFrame implements ActionListener{
	private double totalAmount;
	private double p;
	
	JLabel selctLabel;
	JButton bkashButton,rocketButton,nogodButton,dbblButton,backButton;
	
	JPanel panel,backgroundPanel;
	
	
	
	public selectPaymentMethod(double p){
		this.p=p;
		this.setTitle("Payment Option");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
		Font f=new Font("Arial",Font.BOLD,30);//plain
	
		ImageIcon bg=new ImageIcon("Image/selectoptionbackground.png");
		Image i1=bg.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
		ImageIcon i2=new ImageIcon(i1);

		
		panel=new JPanel();
		panel.setLayout(null);
		
		ImageIcon bkash = new ImageIcon("Image/bkash.png");
		ImageIcon nogod = new ImageIcon("Image/nogod.png");
		ImageIcon rocket = new ImageIcon("Image/rocket.png");
		ImageIcon dbbl = new ImageIcon("Image/dbbl.png");
		
		
		selctLabel =new JLabel("Select Payment Method");
		selctLabel.setBounds(150,40,400,50);
		selctLabel.setFont(f);
		selctLabel.setForeground(Color.WHITE);
		panel.add(selctLabel);
		
		
		bkashButton =new JButton(bkash);
		bkashButton.setBounds(20,100,bkash.getIconWidth(),bkash.getIconHeight());
		bkashButton.addActionListener(this);
		panel.add(bkashButton);
		
		
		nogodButton =new JButton(nogod);
		nogodButton.setBounds(220,100,nogod.getIconWidth(),nogod.getIconHeight());
		nogodButton.addActionListener(this);
		panel.add(nogodButton);
		
		rocketButton =new JButton(rocket);
		rocketButton.setBounds(410,100,rocket.getIconWidth(),rocket.getIconHeight());
		rocketButton.addActionListener(this);
		panel.add(rocketButton);
		
		dbblButton =new JButton(dbbl);
		dbblButton.setBounds(600,100,dbbl.getIconWidth(),dbbl.getIconHeight());
		dbblButton.addActionListener(this);
		panel.add(dbblButton);
		
		backButton=new JButton("Back");
		backButton.setBounds(200,320,80,30);
		backButton.addActionListener(this);
		panel.add(backButton);
		
		
		JLabel bg1=new JLabel(i2);
		bg1.setSize(800,500);
		panel.add(bg1);
		
		
		add(panel);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==bkashButton){
			String bk="Image/bkashbackground.png";
			bookpayment b=new bookpayment(bk,p);
			b.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==nogodButton){
			String ng="Image/nogodbackground.png";
			bookpayment b=new bookpayment(ng,p);
			b.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==rocketButton){
			String rk="Image/rocketbackground.png";
			bookpayment b=new bookpayment(rk,p);
			b.setVisible(true);
			this.setVisible(false);
		}
		
		
		else if(ae.getSource()==dbblButton){
			String d="Image/dbblbackground.png";
			bookpayment b=new bookpayment(d,p);
			b.setVisible(true);
			this.setVisible(false);
		}/*else if(ae.getSource()==backButton){
			
			buy sl= new buy(p,);
			sl.setVisible(true);
			this.setVisible(false);
		}*/
		
		
	}
	
	
	
	
	
	
}