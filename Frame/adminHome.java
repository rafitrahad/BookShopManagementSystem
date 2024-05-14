package Frame;
import Class.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class adminHome extends JFrame implements MouseListener,ActionListener{
	JPanel panel;
	JLabel bg,profileImgLabel,bookImgLabel;
	JButton profileButton,bookSectionButton,backButton;
	//users us;
	//user u;
 
	public adminHome(){
		super("Admin home page");
		this.setSize(800,500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.u=u;
		//this.us=us;
		panel=new JPanel();
		panel.setLayout(null);
		ImageIcon a=new ImageIcon("Image/admin.png");
		Image a1=a.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
		ImageIcon a2=new ImageIcon(a1);
		profileImgLabel=new JLabel(a2);
		profileImgLabel.setBounds(100,140,150,150);
		panel.add(profileImgLabel);
		ImageIcon c=new ImageIcon("Image/book.png");
		Image c1=c.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
		ImageIcon c2=new ImageIcon(c1);
		bookImgLabel=new JLabel(c2);
		bookImgLabel.setBounds(300,140,150,150);//15-18 math,mcq
		panel.add(bookImgLabel);
		profileButton=new JButton("Profile");
		profileButton.setBounds(125,300,100,30);
		profileButton.setBackground(new Color(133,70,255));
		profileButton.addMouseListener(this);
		profileButton.addActionListener(this);
		profileButton.setBorder(null);
		panel.add(profileButton);
		bookSectionButton=new JButton("Book Section");
		bookSectionButton.setBounds(331,300,100,30);
		bookSectionButton.setBackground(new Color(133,70,255));
		bookSectionButton.addMouseListener(this);
		bookSectionButton.addActionListener(this);
		bookSectionButton.setBorder(null);
		panel.add(bookSectionButton);
		backButton=new JButton("Back");
		backButton.setBounds(180,355,200,30);
		backButton.setBackground(new Color(133,70,255));
		backButton.addMouseListener(this);
		backButton.addActionListener(this);
		backButton.setBorder(null);	
		panel.add(backButton);
		ImageIcon img=new ImageIcon("Image/customerHome.jpg");
		Image i1=img.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
		ImageIcon i2=new ImageIcon(i1);
		bg=new JLabel(i2);
		bg.setSize(800,500);
		panel.add(bg);
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==bookSectionButton){
			bookSectionButton.setBackground(new Color(223,80,242));
			bookSectionButton.setForeground(Color.BLACK);
		}
		if(me.getSource()==backButton){
			backButton.setBackground(new Color(223,80,242));
			backButton.setForeground(Color.BLACK);
		}
		if(me.getSource()==profileButton){
			profileButton.setBackground(new Color(223,80,242));
			profileButton.setForeground(Color.BLACK);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource()==bookSectionButton){
			bookSectionButton.setBackground(new Color(133,70,255));
			bookSectionButton.setForeground(Color.BLACK);
		}
		if(me.getSource()==backButton){
			backButton.setBackground(new Color(133,70,255));
			backButton.setForeground(Color.BLACK);
		}
		if(me.getSource()==profileButton){
			profileButton.setBackground(new Color(133,70,255));
			profileButton.setForeground(Color.BLACK);
		}
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==bookSectionButton){
			dispose();
			customizeBooks bs = new customizeBooks ();
			bs.setVisible(true);
		}
		if(ae.getSource()==backButton){
			dispose();
			adminSignIn asin=new adminSignIn();
			asin.setVisible(true);
		}
		/*if(ae.getSource()==profileButton){
			dispose();
			aProfile ap=new aProfile(u,us);
			ap.setVisible(true);
		}*/
	}
}
