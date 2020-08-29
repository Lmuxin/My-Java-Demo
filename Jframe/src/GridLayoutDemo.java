import java.awt.*;

import javax.swing.*;

public class GridLayoutDemo extends JFrame{
	public GridLayoutDemo()
	{
		Container container=this.getContentPane();
		container.setLayout( new GridLayout(2,3));
		//super("s");
		this.setTitle("ÂäÏ¼");
		JButton b1=new JButton("a");
		JButton b2=new JButton("b");
		JButton b3=new JButton("c");
		JButton b4=new JButton("d");
		JButton b5=new JButton("e");
		JButton b6=new JButton("f");
		container.add(b1);
		container.add(b2);
		container.add(b3);
		container.add(b4);
		container.add(b5);
		container.add(b6);
		this.setSize(500,300);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
