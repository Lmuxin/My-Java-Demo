import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class scrollPaneDemo extends JFrame{
	JPanel p;
	JScrollPane scrollpane;
	private Container container;
public scrollPaneDemo()
{
  this.setTitle("图书管管理系统");
  container =this.getContentPane();
  scrollpane=new JScrollPane();
  scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
  p=new JPanel();
  scrollpane.setViewportView(p);
  p.add(new JButton("one"));
  p.add(new JButton("two"));
  p.add(new JButton("three"));
  p.add(new JButton("four"));
  container.add(scrollpane);
  container.add(new JButton("five"),BorderLayout.SOUTH);
  this.setVisible(true);
  this.setSize(200,200);
  
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new scrollPaneDemo();

	}

}
