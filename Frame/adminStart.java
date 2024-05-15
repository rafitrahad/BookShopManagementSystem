package Frame;
import Class.*;
public class adminStart{
	
	users us;
	books bs;
	public adminStart(users us,books bs){
		this.us=us;
		this.bs=bs;
		admins as=new admins();
		adminSignIn ain=new adminSignIn( us,bs,as);
		ain.setVisible(true);
	}
}