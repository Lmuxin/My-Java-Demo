package gui1;
import java.awt.*;
import java.awt.event.*;
class  GUI
{

  private Frame f;
  private  Button b;
  
  GUI()
	   {
			init();
	   }
  public void init()
	 {
		   f=new Frame("我是你爸爸");
		   b=new Button("我是一个按钮");
		   
		  f.setBounds(300,300,300,300);
		  f.setLayout(new FlowLayout());
		  Every();
		  
		f.add(b);
		f.setVisible(true);
  
  }
  

private void Every()
{

	f.addWindowListener(new WindowAdapter()
		{
		
		public void windowClosing(WindowEvent e)
			{
			     System.exit(0);
			
			}
	    }   );
}




public  static void main(String[] args)
{

GUI G=new GUI();

}

}