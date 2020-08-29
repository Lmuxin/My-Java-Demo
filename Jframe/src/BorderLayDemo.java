import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayDemo extends JFrame{
	public BorderLayDemo()
	{
	Container container=this.getContentPane();
	JButton b1=new JButton("a");
	JButton b2=new JButton("b");
	JButton b3=new JButton("c");
	JButton b4=new JButton("d");
	JButton b5=new JButton("e");
	JButton b6=new JButton("f");
	JButton b7=new JButton("g");
	JPanel p=new JPanel ();
	container.add(b1,BorderLayout.SOUTH);
	container.add(b2,BorderLayout.NORTH);
	container.add(b3,"East");
	container.add("West",b4);
	p.add(b5);
	p.add(b6);
	p.add(b7);
	container.add(p);
	this.setVisible(true);
	this.setSize(500,200);
	}
	public static void main(String[] args) {
		new BorderLayDemo();
		// TODO Auto-generated method stub

	}

}
