package Frame;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class selectbook extends JFrame implements ActionListener{

	JLabel bookLabel1,bookLabel2,bookLabel3;
	JButton bookButton1,bookButton2,bookButton3;
	JPanel panel;
		String price1;
		String price2;
		String price3;
		String quantity1;
		String quantity2;
		String quantity3;
		books bs;
	
	public selectbook(books bs){
		this.bs=bs;
		this.setTitle("BookShop");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		//books bs=new books();
		
		Font f=new Font("Arial",Font.PLAIN,15);
		
		
		
		price1=bs.getUser(0).getPrice();
		price2=bs.getUser(1).getPrice();
		price3=bs.getUser(2).getPrice();
		quantity1=bs.getUser(0).getQuantity();
		quantity2=bs.getUser(1).getQuantity();
		quantity3=bs.getUser(2).getQuantity();
		
		
		//books bs=new books(); img1=new ImageIcon("background.jpg");
		ImageIcon img2=new ImageIcon("Image/harry porter.png");
		ImageIcon img3=new ImageIcon("Image/jungle book.png");
		ImageIcon img4=new ImageIcon("Image/story of thieves.png");
		ImageIcon img6=new ImageIcon("buy.png");
		
		
		panel=new JPanel();
		panel.setLayout(null);
		
		bookButton1=new JButton(img2);
		bookButton1.setBounds(40,80,img2.getIconWidth(),img2.getIconHeight());
		bookButton1.addActionListener(this);
		panel.add(bookButton1);
		
		bookLabel1=new JLabel("price: "+price1+"     "+"Quantity: "+quantity1);
		bookLabel1.setBounds(42,300,200,30);
		bookLabel1.setFont(f);
		//bookLabel1.setForeground(Color.WHITE);
		panel.add(bookLabel1);
		
		
		
		bookButton2=new JButton(img3);
		bookButton2.setBounds(267,80,img2.getIconWidth(),img2.getIconHeight());
		bookButton2.addActionListener(this);
		panel.add(bookButton2);
		
		bookLabel2=new JLabel("price: "+price2+"     "+"Quantity: "+quantity2);
		bookLabel2.setBounds(275,300,200,30);
		bookLabel2.setFont(f);
		//bookLabel2.setForeground(Color.WHITE);
		panel.add(bookLabel2);
		
		
		bookButton3=new JButton(img4);
		bookButton3.setBounds(527,80,img2.getIconWidth(),img2.getIconHeight());
		bookButton3.addActionListener(this);
		panel.add(bookButton3);
		
		bookLabel3=new JLabel("price: "+price3+"     "+"Quantity: "+quantity3);
		bookLabel3.setBounds(550,300,200,30);
		bookLabel3.setFont(f);
		//bookLabel3.setForeground(Color.WHITE);
		panel.add(bookLabel3);
		
	
		
		
		/*ImageIcon bg=new ImageIcon("Image/background.png");
		Image i1=bg.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
		ImageIcon i2=new ImageIcon(i1);
		
		JLabel bg2=new JLabel(i2);
		bg2.setSize(800,500);
		panel.add(bg2);*/
		
		add(panel);
		
		
		
	
    }
	
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==bookButton1){
			String i1="Image/harry porter.png";
			buy b=new buy(i1,price1,quantity1,bs);
			b.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==bookButton2){
			String i2="Image/jungle book.png";
			buy b=new buy(i2,price2,quantity2,bs);
			b.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==bookButton3){
			String i3="Image/story of thieves.png";
			buy b=new buy(i3,price2,quantity2,bs);
			b.setVisible(true);
			this.setVisible(false);
		}
		
		
		
	}
}