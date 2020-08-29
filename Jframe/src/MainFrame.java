import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	public MainFrame()
	{
		super("图书馆管理系统");
		Container container=this.getContentPane();
		container.setLayout(new BorderLayout());
		JPanel panel=new JPanel();
	    panel.setBackground(Color.red);
		JButton bt=new JButton("Press me");
		panel.add(bt);
		container .add(panel,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setSize(600,300);
	}

	public static void main(String[] args) {
		new MainFrame();
		// TODO Auto-generated method stub

	}

}
