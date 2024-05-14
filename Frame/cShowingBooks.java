package Frame;
import Class.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cShowingBooks extends JFrame implements MouseListener,ActionListener{
	JPanel panel,panel1,panel2,panel3;
	JLabel bg,searchLabel;
	JTextField searchField;
	JTabbedPane tp;
	JButton backButton,searchButton;
	users us;
	user u;
	
	public cShowingBooks(user u,users us){
		super("Customer showing books");
		this.setSize(800,500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.u=u;
		this.us=us;
		
		panel=new JPanel();
		panel.setLayout(null);
		
		tp = new JTabbedPane();
		tp.setBounds(0,50,800,450);
		this.add(tp);
		
		panel1 = new JPanel();
		panel1.setBackground(new Color(132,237,178));
		panel1.setLayout(null);
		
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(132,237,178));
		panel2.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBackground(new Color(132,237,178));
		panel3.setLayout(null);

		
		tp.addTab("All",panel1);
		tp.addTab("Storybook",panel2);
		tp.addTab("Textbook",panel3);
		
		Font f2=new Font("Arial",Font.PLAIN,17);
		
		searchLabel=new JLabel("Search books");
		searchLabel.setBounds(250,30,150,30);
		searchLabel.setFont(f2);
		searchLabel.setForeground(Color.WHITE);
		panel.add(searchLabel);
		
		searchField=new JTextField();
        searchField.setBounds(360,33,150,25);
		searchField.setFont(f2);
		searchField.setBorder(null);
		searchField.setBackground(new Color(133,70,255));
        panel.add(searchField);
		
		ImageIcon src=new ImageIcon("Image/search.jpg");
		Image s1=src.getImage().getScaledInstance(50,30,Image.SCALE_SMOOTH);
		ImageIcon s2=new ImageIcon(s1);
		
		searchButton=new JButton(s2);
		searchButton.setBounds(535,30,50,30);
		//searchButton.setBackground(new Color(133,70,255));
		searchButton.addMouseListener(this);
		searchButton.addActionListener(this);
		//searchButton.setBorder(null);	
		panel.add(searchButton);
		
		backButton=new JButton("Home");
		backButton.setBounds(650,30,100,30);
		backButton.setBackground(new Color(133,70,255));
		backButton.addMouseListener(this);
		backButton.addActionListener(this);
		backButton.setBorder(null);	
		panel.add(backButton);
		
		ImageIcon img=new ImageIcon("Image/showBooks.jpg");
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
		if(me.getSource()==backButton){
			backButton.setBackground(new Color(223,80,242));
			backButton.setForeground(Color.BLACK);
		}
	}
	
	public void mouseExited(MouseEvent me){
		if(me.getSource()==backButton){
			backButton.setBackground(new Color(133,70,255));
			backButton.setForeground(Color.BLACK);
		}
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==backButton){
			dispose();
			customerHome cm=new customerHome(u,us);
			cm.setVisible(true);
		}
	}
}