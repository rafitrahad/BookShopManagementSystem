package Frame;
import Class.*;
public class bookStart{
	public bookStart(){
		
		books bs=new books();
		selectbook in=new selectbook(bs);
		in.setVisible(true);
	}
}