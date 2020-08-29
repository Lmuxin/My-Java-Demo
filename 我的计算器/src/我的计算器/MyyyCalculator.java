package 我的计算器;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyyyCalculator {
	private Frame f;
	private Panel p1,p2;
	private JTextField tf;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	  MyyyCalculator()
	  {
		  f=new Frame("计算器");
		  f.setBounds(200,200,300,400);
		  
		  tf=new JTextField(25);
		  tf.setHorizontalAlignment(JTextField.RIGHT);//文本靠右对其
		  
		  p1=new Panel();
		  p1.add(tf);
		  p2=new Panel();
		  p2.setLayout(new GridLayout(5,4,3,3));
		  b1=new JButton("sqrt");
		  b2=new JButton("+/-");
		  b3=new JButton("CE");
		  b4=new JButton("C");
		  b5=new JButton("/");
		  b6=new JButton("*");
		  b7=new JButton("-");
		  b8=new JButton("+");
		  b9=new JButton("=");
		  b10=new JButton(".");
		  b11=new JButton("0");
		  b12=new JButton("1");
		  b13=new JButton("2");
		  b14=new JButton("3");
		  b15=new JButton("4");
		  b16=new JButton("5");
		  b17=new JButton("6");
		  b18=new JButton("7");
		  b19=new JButton("8");
		  b20=new JButton("9");
		  p2.add(b1);
		  p2.add(b2);
		  p2.add(b3);
		  p2.add(b4);
		  p2.add(b18);
		  p2.add(b19);
		  p2.add(b20);
		  p2.add(b5);
		  p2.add(b15);
		  p2.add(b16);
		  p2.add(b17);
		  p2.add(b6);
		  p2.add(b12);
		  p2.add(b13);
		  p2.add(b14);
		  p2.add(b7);
		  p2.add(b11);
		  p2.add(b10);
		  p2.add(b9);
		  p2.add(b8);
		 
		  f.add(p1, "North");
		  f.add(p2,"Center");
		  f.setResizable(false);//窗口不可变
		  myevent();
		  f.setVisible(true);
	  }
private void myevent()
{
	b1.addActionListener(new ActionListener()
			{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
			});
	
	b2.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b3.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b4.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b5.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b6.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b7.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b8.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b9.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b10.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b11.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b12.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b13.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b14.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	b15.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b16.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b17.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b18.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b19.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	b20.addActionListener(new ActionListener()
	{

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	});
	
	
	f.addWindowListener(new WindowAdapter()
			{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
			});
}
	public static void main(String[] args) {
		new MyyyCalculator();
		// TODO Auto-generated method stub

	}

}
