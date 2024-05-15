
import java.lang.*;
//package Frames;
import Class.*;
//package Class;

import Frame.*;
public class Start{
	public static void main(String[] args){
		admins as=new admins();
		books bs=new books();
		users us=new users();
		user u=us.getUser(3);
		admin a=as.getUser(3);
		intro in=new intro(us,bs,as);
		in.setVisible(true);
		//customerSignin cin=new customerSignin(us,bs,as);
		//cin.setVisible(true);
		//customerHome ch=new customerHome(u,us,bs,as);
		//ch.setVisible(true);
		//adminSignIn ain=new adminSignIn(us,bs,as);
		//ain.setVisible(true);
		//adminHome ah=new adminHome(us,bs,a,as);
		//ah.setVisible(true);
		//Asearch s=new Asearch(us,bs,a,as);
		//s.setVisible(true);
		
	}
}