import java.awt.*;
import java.awt.event.*;
public class frame {
	
		
public static void main(String []args)
	{
		Frame f=new Frame("my gui");
		f.setSize(400,300);
		f.setLocation(200,100);
		f.setLayout(new BorderLayout());
		
		Button b=new Button("我是一个按钮");
		f.add(b,"South");
		
		/*f.addWindowListener(new WindowAdapter()
				{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});*/
		f.addWindowListener(new mywin());
		f.setVisible(true);
		
	}



}
class mywin extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
/*class Winclose implements WindowListener
{
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}*/